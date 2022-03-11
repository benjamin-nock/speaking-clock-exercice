package uk.co.wowcher.speakingclock;

public class MainApp {
	
	public static void main(String[] args) {
		
		//The class clockConverterOne contains the solution to the given problem
		System.out.println("Conversions with ClockConverterOne:");
		ClockConverterOne clockConverterOne = new ClockConverterOne();
		
		clockConverterOne.printTimeToWords("00:01");
		clockConverterOne.printTimeToWords("05:13");
		clockConverterOne.printTimeToWords("18:15");
		clockConverterOne.printTimeToWords("22:30");
		clockConverterOne.printTimeToWords("11:00");
		clockConverterOne.printTimeToWords("00:45");
		clockConverterOne.printTimeToWords("17:43");
		clockConverterOne.printTimeToWords("21:59");
		clockConverterOne.printTimeToWords("12:00");
		clockConverterOne.printTimeToWords("24:00");
		clockConverterOne.printTimeToWords("00:00");
		clockConverterOne.printTimeToWords("25:15");
		clockConverterOne.printTimeToWords("24:15");
		clockConverterOne.printTimeToWords("00:60");
		clockConverterOne.printTimeToWords("2:5");
		clockConverterOne.printTimeToWords("2a:56");
		clockConverterOne.printTimeToWords("02:5c");
		clockConverterOne.printTimeToWords("180");
		
		System.out.println();
		
		System.out.println("Conversions with ClockConverterTwo:");
		//I decided to take a bit more time to make a more realistic clockConverter for fun
		ClockConverterTwo clockConverterTwo = new ClockConverterTwo();
		
		clockConverterTwo.printTimeToWords("00:01");
		clockConverterTwo.printTimeToWords("05:13");
		clockConverterTwo.printTimeToWords("18:15");
		clockConverterTwo.printTimeToWords("22:30");
		clockConverterTwo.printTimeToWords("11:00");
		clockConverterTwo.printTimeToWords("00:45");
		clockConverterTwo.printTimeToWords("12:55");
		clockConverterTwo.printTimeToWords("12:02");
		clockConverterTwo.printTimeToWords("17:43");
		clockConverterTwo.printTimeToWords("21:59");
		clockConverterTwo.printTimeToWords("12:00");
		clockConverterTwo.printTimeToWords("24:00");
		clockConverterTwo.printTimeToWords("00:00");
		clockConverterTwo.printTimeToWords("25:15");
		clockConverterTwo.printTimeToWords("24:15");
		clockConverterTwo.printTimeToWords("00:60");
		clockConverterTwo.printTimeToWords("2:5");
		clockConverterTwo.printTimeToWords("2a:56");
		clockConverterTwo.printTimeToWords("02:5c");
		clockConverterTwo.printTimeToWords("180");
	}
}
