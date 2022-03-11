package uk.co.wowcher.speakingclock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClockConverterOneTest {

	@Test
	public void testConvertTimeToWordsOne()
	{
		ClockConverterOne clockConverterTest = new ClockConverterOne();
		assertEquals(clockConverterTest.convertTimeToWords("00:33"), "It's thirty three minutes past twelve");
	}
	
	@Test
	public void testConvertTimeToWordsTwo()
	{
		ClockConverterOne clockConverterTest = new ClockConverterOne();
		assertEquals(clockConverterTest.convertTimeToWords("04:03"), "It's four three");
	}
	
	@Test
	public void testConvertTimeToWordsThree()
	{
		ClockConverterOne clockConverterTest = new ClockConverterOne();
		assertEquals(clockConverterTest.convertTimeToWords("12:00"), "It's midday");
	}
	
	@Test
	public void testConvertTimeToWordsFour()
	{
		ClockConverterOne clockConverterTest = new ClockConverterOne();
		assertEquals(clockConverterTest.convertTimeToWords("16:47"), "It's sixteen forty seven");
	}
	
	@Test
	public void testConvertTimeToWordsFive()
	{
		ClockConverterOne clockConverterTest = new ClockConverterOne();
		assertEquals(clockConverterTest.convertTimeToWords("24:00"), "It's midnight");
	}
	
	@Test
	public void testConvertTimeToWordsSix()
	{
		ClockConverterOne clockConverterTest = new ClockConverterOne();
		assertEquals(clockConverterTest.convertTimeToWords("a:36"), "Hour value isn't a parseable Integer");
	}
	
	@Test
	public void testConvertTimeToWordsSeven()
	{
		ClockConverterOne clockConverterTest = new ClockConverterOne();
		assertEquals(clockConverterTest.convertTimeToWords("04:b"), "Minute value isn't a parseable Integer");
	}
	
	@Test
	public void testConvertTimeToWordsEight()
	{
		ClockConverterOne clockConverterTest = new ClockConverterOne();
		assertEquals(clockConverterTest.convertTimeToWords("25:54"), "Time value doesn't respect the correct time format");
	}
	
	@Test
	public void testConvertTimeToWordsNine()
	{
		ClockConverterOne clockConverterTest = new ClockConverterOne();
		assertEquals(clockConverterTest.convertTimeToWords("04:66"), "Time value doesn't respect the correct time format");
	}
	
	@Test
	public void testConvertTimeToWordsTen()
	{
		ClockConverterOne clockConverterTest = new ClockConverterOne();
		assertEquals(clockConverterTest.convertTimeToWords("24:40"), "Time value doesn't respect the correct time format");
	}
	
	@Test
	public void testConvertTimeToWordsEleven()
	{
		ClockConverterOne clockConverterTest = new ClockConverterOne();
		assertEquals(clockConverterTest.convertTimeToWords("2440"), "Input String doesn't respect the correct time format");
	}
}
