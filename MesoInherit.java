
// This class is responsible for generating output for lines 3 to 6
// Must inherit the abstract class/method as necessary
public class MesoInherit {

	private String station;

	public MesoInherit(MesoStation mesoStation) {
		// TODO Auto-generated constructor stub

		this.station = mesoStation.getStID();

	}

	public int[] calAverage() {

		// Returns an array of 3 int values
		int[] averages = new int[3];
		int val1 = (int) station.charAt(0);
		int val2 = (int) station.charAt(1);
		int val3 = (int) station.charAt(2);
		int val4 = (int) station.charAt(3);

		double avg = ((val1 + val2 + val3 + val4) / 4.0);

		// [0] Calculates ASCII Ceiling
		averages[0] = (int) Math.ceil(avg);

		// [1] Calculates ASCII Floor
		averages[1] = (int) Math.floor(avg);

		// [2] Calculates ASCII Average
		averages[2] = (int) Math.ceil(avg);

		return averages;
	}

	// Returns a "string" of the letter that corresponds to the ASCII average from
	// the stationID
	public char letterAverage() {
		// TODO Auto-generated method stub

		return (char) calAverage()[2];
	}

}
