package com.unittest.testing;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class AppTest 
{
Fahrenheit object;
	@Before
	public void newClassFahrenheit() {
		object = new Fahrenheit(); 
	}
	@Test
	public void testResult0Input0() {
		double input = 0;
		double expected = 0;
		object.input(input);
		double actual = object.getCelsius();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult1000Input1000() {
		double input = 1000;
		double expected = 1000;
		object.input(input);
		double actual = object.getCelsius();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResultMinus1000InputMinus1000() {
		double input = -1000;
		double expected = -1000;
		object.input(input);
		double actual = object.getCelsius();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResultTrueInput0() {
		double input = 0;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput1000() {
		double input = 1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinus1000() {
		double input = -1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput2000() {
		double input = 2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinas2000() {
		double input = -2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinas1010() {
		double input = -1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinas1001() {
		double input = -1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinas999() {
		double input = -999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinas501() {
		double input = -501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinas500() {
		double input = -500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinas499() {
		double input = -499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInputMinas1() {
		double input = -1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput1() {
		double input = 1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput499() {
		double input = 499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput500() {
		double input = 500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput501() {
		double input = 501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput999() {
		double input = 999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput1010() {
		double input = 1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResultTrueInput1001() {
		double input = 1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResult32CalculateFromInput0() {
		double input = 0;
		double expected = 32.00;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult32CalculateFromInput1000() {
		double input = 1000;
		double expected = 1832.00;
		object.input(input);
		object.calculate(); 
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResult32CalculateFromInputMinas1000() {
		double input = -1000;
		double expected = -1768.00;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual, 2);
	}
	@Test
	public void testResultMessageOutputFromInput0() {
		double input = 0;
		String expected = "0 celcius = 32 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInput1000() {
		double input = 1000;
		String expected = "1000 celcius = 1832 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResultMessageOutputFromInputMinas1000() {
		double input = -1000;
		String expected = "-1000 celcius = -1768 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
}
	
