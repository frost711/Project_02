import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// This class is responsible for generating line 7 of the output to the end of the output.
public class LetterAvg {

	private char letterAvg;

	protected ArrayList<String> stations = new ArrayList<String>();

	protected ArrayList<String> sameLetterStations = new ArrayList<String>();

	public LetterAvg(char letterAverage) throws IOException {

		this.letterAvg = letterAverage;
		read("Mesonet.txt");
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
		String stationName = strg.substring(1, 5);
		return stationName;
	}

	public int numberOfStationWithLetterAvg() {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < stations.size(); ++i) {
			if (letterAvg == (stations.get(i).charAt(0))) {
				// sameLetterStations.add(stations.get(i));
				++count;
			}
		}
		return count;
	}

	public ArrayList<String> numberOfStationWithLetterAvg1() {

		for (int i = 0; i < stations.size(); ++i) {
			if (letterAvg == (stations.get(i).charAt(0))) {
				sameLetterStations.add(stations.get(i));

			}
		}
		return sameLetterStations;
	}

	@Override
	public String toString() {
		ArrayList<String> temp = new ArrayList<String>();
		temp = numberOfStationWithLetterAvg1();
		String output = "\nThey are:";
		for (int i = 0; i < temp.size(); ++i) {
			output = (output + "\n" + temp.get(i));
		}
		return output;
	}

}
