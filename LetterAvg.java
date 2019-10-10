import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// This class is responsible for generating line 7 of the output to the end of the output.
public class LetterAvg {
	
	private String letterAvg;

	protected ArrayList<String> stationList = new ArrayList<String>();
	
	protected ArrayList<String> sameLetterStations = new ArrayList<String>();
	
	public LetterAvg(String letterAverage) {

		this.letterAvg = letterAverage;
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

	public String numberOfStationWithLetterAvg() {
		// TODO Auto-generated method stub
		char charAvg = letterAvg.charAt(0);
		int count = 0;
		for (int i = 0; i < stationList.size(); ++i)
		{
			if (charAvg == (stationList.get(i).charAt(0)))
			{
				sameLetterStations.add(stationList.get(i));
				++count;
			}
		}
			return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String output = "They are: \n";
    	for (int i = 0; i < sameLetterStations.size(); i++)
    	{
    		output = output + sameLetterStations.get(i).toString();
    	}
    	return output;
	}

}
