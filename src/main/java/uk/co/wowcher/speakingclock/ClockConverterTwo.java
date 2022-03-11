package uk.co.wowcher.speakingclock;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClockConverterTwo {
	
	//Declaring a list of times in word format to convert a number time value to a word time value
	//Another solution would be using hashmaps
	private static final List<String> NUMBERS = Collections.unmodifiableList(Arrays.asList("","one","two","three","four","five","six","seven","eight","nine",
			"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
		    "twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"));
			
	public ClockConverterTwo() {}
	
	//Method to convert a string time into words following the example:
	//"08:34" should be converted to "It's twenty six minutes to nine in the morning"
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
        
        String wordTimeValue = "It's ";
        int addHour = 0;
        
        //Getting the minute value
        if(minuteIntValue != 0)
        {
        	String minuteForString = "";
        	if(minuteIntValue == 1 || minuteIntValue == 59)
        	{
        		minuteForString = "minute";
        	}
        	else
        	{
        		minuteForString = "minutes";
        	}
        	
        	if(minuteIntValue == 15) {
        		wordTimeValue += "quarter past ";
        	}
        	else if(minuteIntValue == 30) {
        		wordTimeValue += "half past ";
        	}
        	else if(minuteIntValue == 45) {
        		wordTimeValue += "quarter to ";
        		addHour = 1;
        	}
        	else if(minuteIntValue < 30) {
        		wordTimeValue += NUMBERS.get(minuteIntValue) + " " + minuteForString + " past ";
        	}
        	else
        	{
        		wordTimeValue += NUMBERS.get(60 - minuteIntValue) + " " + minuteForString + " to ";
        		addHour = 1;
        	}	
        }
        
        //Getting the hour value
        if(hourIntValue == 0 || hourIntValue == 12)
        {
        	if(addHour == 1)
        	{
        		wordTimeValue += NUMBERS.get(1);
        	}
        	else
        	{
        		wordTimeValue += NUMBERS.get(12);
        	}      	
        }
        else if(hourIntValue < 12){
        	wordTimeValue += NUMBERS.get(hourIntValue + addHour);
        }
        else {
        	wordTimeValue += NUMBERS.get(hourIntValue - 12 + addHour);
        }
        
        //Getting the period of the day
    	if(hourIntValue < 1)
    	{
    		wordTimeValue += " at night";
    	}
    	else if (hourIntValue < 12)
    	{
    		wordTimeValue += " in the morning";  		
    	}   
    	else if (hourIntValue < 18)
    	{
    		wordTimeValue += " in the afternoon";  		
    	}
    	else if (hourIntValue < 22)
    	{
    		wordTimeValue += " in the evening";  		
    	} 
    	else
    	{
    		wordTimeValue += " at night";  
    	}
    	
        return wordTimeValue;
	}
	
	public void printTimeToWords(String stringTime)
	{
		System.out.println("Converting " + stringTime + " into words makes: " +  convertTimeToWords(stringTime));
	}
}
