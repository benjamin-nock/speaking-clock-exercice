package uk.co.wowcher.speakingclock;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClockConverterOne {
	
	//Declaring a list of times in word format to convert a number time value to a word time value
	//Another solution would be using hashmaps
	//I also could have had the same result with two shorter lists, one with values from zero to nineteen and one with decimal values from twenty to fifty.
	private static final List<String> NUMBERS = Collections.unmodifiableList(Arrays.asList("","one","two","three","four","five","six","seven","eight","nine",
			"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
		    "twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine",
		    "thirty","thirty one","thirty two","thirty three","thirty four","thirty five","thirty six","thirty seven","thirty eight","thirty nine",
		    "forty","forty one","forty two","forty three","forty four","forty five","forty six","forty seven","forty eight","forty nine",
		    "fifty","fifty one","fifty two","fifty three","fifty four","fifty five","fifty six","fifty seven","fifty eight","fifty nine"));
			
	public ClockConverterOne() {}
	
	//Method to convert a string time into words following the example:
	//"08:34" should be converted to "It's eight thirty four"
	public String convertTimeToWords(String stringTime) {
		int hourIntValue = 0;
		int minuteIntValue = 0;
		
		//Testing if input is midday using input string
		if(stringTime.equals("12:00"))
		{
			return "It's midday";
		}
		
		//Testing if input is midnight using input string
		if(stringTime.equals("24:00") || stringTime.equals("00:00"))
		{
			return "It's midnight";
		}
		
		//Parsing the input to get the hour and minutes
		String[] stringTimeSplit = stringTime.split(":");
		
		//Checking if the input was the correct format for parsing
        if( stringTimeSplit.length != 2 ) {
        	return "Input String doesn't respect the correct time format";
        }
        
        //Converting hour string to hour int
        try {
            hourIntValue = Integer.parseInt(stringTimeSplit[0]);
        }
        catch (NumberFormatException nfe) {
        	return "Hour value isn't a parseable Integer";
        }   
        //Converting minute string to minute int
        try {
            minuteIntValue = Integer.parseInt(stringTimeSplit[1]);
        }
        catch (NumberFormatException nfe) {
        	return "Minute value isn't a parseable Integer";
        } 
         
        //Testing if time value respects the correct time format
        if(!(hourIntValue >= 0 && hourIntValue < 24) || !(minuteIntValue >= 0 && minuteIntValue <= 59))
        {
        	return "Time value doesn't respect the correct time format";
        }
        
        return getFinalTimeString(NUMBERS.get(hourIntValue), NUMBERS.get(minuteIntValue));
	}
	
	private String getFinalTimeString(String hourStringValue, String minuteStringValue)
	{
		if(hourStringValue.isEmpty())
		{
			//I don't want to print "It's eleven" when input is "00:11" because it can get confused with "11:00"
			return "It's " + minuteStringValue + " minutes past twelve";
		}
		else
		{
			return "It's " + hourStringValue + " " + minuteStringValue;		
		}
	}
	
	public void printTimeToWords(String stringTime)
	{
		System.out.println("Converting " + stringTime + " into words makes: " +  convertTimeToWords(stringTime));

	}
}
