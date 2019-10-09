import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MesoInherit 
{
	protected ArrayList<String> stations = new ArrayList<String>();
	
	public MesoInherit(String strg) throws IOException
	{
		// reads the text file that is used for comparison and caluclations throught the program
		read("Mesonet.txt");
		
	}
	
	public MesoInherit(MesoStation mesoStation) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Loads a list of players from a txt file. Each line of the txt represents a
	 * station. The first five lines of the txt file is information about the
	 * contents of the entire file. The sixth line denotes the order of the fields.
	 * Stations should not be constructed from the first 6 lines.
	 * 
	 * @param filename The file to read from.
	 * @throws IOException
	 */
	// May run into problem with hard coding the read method
	public void read(String filename) throws IOException
	{
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
	public String stationName(String strg)
	{
		String stationName = strg.substring(0, 4);
		return stationName;
	}

	public String[] calAverage() {
		// TODO Auto-generated method stub
		return null;
	}

	public String letterAverage() {
		// TODO Auto-generated method stub
		return null;
	}

}
