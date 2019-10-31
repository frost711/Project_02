# Project_02
## Methodology
### Classes & Methods
1. _MesoAbstract_
	* abstract char letterAverage()
	
2. _MesoInherit_
	* Constructor
		- Initializes the class variable stID to that of the Mesostation parameter
		stID.
	* calAverage
		- It calculates the ASCII value of each character of the stID and averages 
			their value. It then stores the floor of the average, the ceiling of the average
			and the actual average in an int array and returns it.
	* letterAverage
		- returns the 3 element in the calAverage array
		
3. PosAvg
	* Constructor
		- Calls the read method on the text file "Mesonet.txt".
		- Also initiates the class variable stationID with the String parameter passed in.
	* getStationID
		- Returns stationID.
	* read
		-  Reads in every line of the text file. Skips over the first 2 lines of the text file
			before adding strings of stationNames to a class variable ArrayList. Does so by 
			calling the stationName method to isolate the 4 characters of the station name from
			the rest of the line information.
	* stationName
		- Returns a substring of 4 characters.
	* indexOfStation
		- Returns the index of a station that matches the station of importance character for
			character.
	* toString
		- Returns a string of the stations N-2, N+2, N-1, and N+1.

4. LetterAvg
	*
		-		