import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// This class is responsible for generating the first 2 lines of the output related to the position/index
public class PosAvg {

	private String stationID;

	private int indexOfStation;

	protected ArrayList<String> stationList = new ArrayList<String>();

	public PosAvg(String stID) throws IOException {
		// reads the text file that is used for comparison and calculations throughout
		// the program
		read("Mesonet.txt");
		this.stationID = stID;
	}

	public String getStationID() {
		return stationID;
	}

	public int getIndexOfStation() {
		return indexOfStation;
	}

	/**
	 * Loads a list of players from a text file. Each line of the text represents a
	 * station. The first five lines of the text file is information about the
	 * contents of the entire file. The sixth line denotes the order of the fields.
	 * Stations should not be constructed from the first 6 lines.
	 * 
	 * @param filename The file to read from.
	 * @throws IOException
	 */
	// May run into problem with hard coding the read method
	public void read(String filename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String lineInfo = br.readLine();

		// Removes the first two lines of the text file from the ArrayList
		for (int i = 0; i <= 2; ++i)
			lineInfo = br.readLine();

		// reads in each line of the text file until the loop reaches the final line
		while (lineInfo != null) {
			String newStation = stationName(lineInfo);
			stationList.add(newStation);

			lineInfo = br.readLine();
		}
		br.close();
	}

	/**
	 * Creates a new string from each line of the text file by separating the first
	 * four characters into a substring. The return string is to be stored in the
	 * stations ArrayList.
	 * 
	 * @param strg
	 * @return
	 */
	public String stationName(String strg) {
		String stationName = strg.substring(0, 5);
		return stationName;
	}

	public String indexOfStation() {
		indexOfStation = 0;
		String stationOfImportance = getStationID();
		for (int i = 0; i < stationList.size(); ++i) {
			if (stationOfImportance.equalsIgnoreCase(stationList.get(i))) {
				// Index of the station is index of ArrayList + 1 since ArrayList is zero
				// indexed
				indexOfStation = stationList.indexOf(stationList.get(i)) + 1;
			}
		}
		return Integer.toString(indexOfStation);
	}

	@Override
	public String toString() {
		// The index average is N+2 station and N-2 station && the average of N+1
		// station and N-1 station
		String station1 = null; // stationList.get(getIndexOfStation() - 1);
		String station2 = null; // stationList.get(getIndexOfStation() + 1);
		String station3 = null; // stationList.get(getIndexOfStation() - 2);
		String station4 = null; // stationList.get(getIndexOfStation() + 2);
		return String.format("The index is average of %s and %s, %s and %s, and so on.", station1, station2, station3,
				station4);
	}

}
