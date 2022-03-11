package uk.co.wowcher.speakingclock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClockConverterTwoTest {

	@Test
	public void testConvertTimeToWordsOne()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("00:01"), "It's one minute past twelve at night");
	}
	
	@Test
	public void testConvertTimeToWordsTwo()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("05:13"), "It's thirteen minutes past five in the morning");
	}
	
	@Test
	public void testConvertTimeToWordsThree()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("18:15"), "It's quarter past six in the evening");
	}
	
	@Test
	public void testConvertTimeToWordsFour()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("22:30"), "It's half past ten at night");
	}
	
	@Test
	public void testConvertTimeToWordsFive()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("00:45"), "It's quarter to one at night");
	}
	
	@Test
	public void testConvertTimeToWordsSix()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("17:43"), "It's seventeen minutes to six in the afternoon");
	}
	
	@Test
	public void testConvertTimeToWordsSeven()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("21:59"), "It's one minute to ten in the evening");
	}
	
	@Test
	public void testConvertTimeToWordsEight()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("12:00"), "It's midday");
	}
	
	@Test
	public void testConvertTimeToWordsNine()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("24:00"), "It's midnight");
	}
	
	@Test
	public void testConvertTimeToWordsTen()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("00:00"), "It's midnight");
	}
	
	@Test
	public void testConvertTimeToWordsEleven()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("25:15"), "Time value doesn't respect the correct time format");
	}
	
	@Test
	public void testConvertTimeToWordsTwelve()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("24:15"), "Time value doesn't respect the correct time format");
	}
	
	@Test
	public void testConvertTimeToWordsThirteen()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("00:60"), "Time value doesn't respect the correct time format");
	}
	
	@Test
	public void testConvertTimeToWordsFourteen()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("2a:15"), "Hour value isn't a parseable Integer");
	}
	
	@Test
	public void testConvertTimeToWordsFifteen()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("20:1b"), "Minute value isn't a parseable Integer");
	}
	
	@Test
	public void testConvertTimeToWordsSixteen()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("2053"), "Input String doesn't respect the correct time format");
	}
	
	@Test
	public void testConvertTimeToWordsSeventeen()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("14:00"), "It's two in the afternoon");
	}
	
	@Test
	public void testConvertTimeToWordsEighteen()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("12:02"), "It's two minutes past twelve in the afternoon");
	}
	
	@Test
	public void testConvertTimeToWordsNineteen()
	{
		ClockConverterTwo clockConverterTest = new ClockConverterTwo();
		assertEquals(clockConverterTest.convertTimeToWords("12:31"), "It's twenty nine minutes to one in the afternoon");
	}
}
