import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// This class is responsible for generating the first 2 lines of the output related to the position/index
public class PosAvg {

	private String stationID;

	protected ArrayList<String> stations = new ArrayList<String>();

	public PosAvg(String stID) throws IOException {
		// TODO Auto-generated constructor stub
		// reads the text file that is used for comparison and calculations throughout
		// the program
		read("Mesonet.txt");
		this.stationID = stID;
		// The index average is N+2 station and N-2 station && the average of N+1
		// station and N-1 station
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
		for (int i = 0; i < 2; ++i)
			lineInfo = br.readLine();

		// reads in each line of the text file until the loop reaches the final line
		while (lineInfo != null) {
			String newStation = stationName(lineInfo);
			stations.add(newStation);

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
		String stationName = strg.substring(0, 3);
		return stationName;
	}

	public String indexOfStation() {
		// TODO Auto-generated method stub
		String indexOfStation; //= stations.getIndex().equals(stationID);

		// Index of the station is index of ArrayList + 1 since ArrayList is zero
		// indexed

		return indexOfStation = null;
	}

}
