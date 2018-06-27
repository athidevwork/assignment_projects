/**
 * 
 */
package com.intersection;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author amuthukumarasamy
 *
 */
public class RealFizzBuzzTest {

	@Test
	public void assertAssignment1SampleOutput() {
		Step1 assignment = new Step1();
		assertTrue("Expected Assignment1 Output", assignment.process(1, 20).equals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"));
		//fail("Not yet implemented");
	}

	@Test
	public void assertAssignment1AddTestOutput() {
		Step1 assignment = new Step1();
		assertTrue("Expected Output with 0", assignment.process(0, 20).equals("0 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"));
	}

	@Test
	public void assertAssignment1Rainy1Scenario() {
		Step1 assignment = new Step1();
		assertTrue("Start index larger than end index", assignment.process(1, 0).equals("Start index cannot be greater than end"));
	}	
	
	@Test
	public void assertAssignment2Sample() {
		Step2 assignment = new Step2();
		assertTrue("Expected Assignment2 Output", assignment.process(1, 20).equals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"));
	}	
	
	@Test
	public void assertAssignment2AddTestOutput() {
		Step2 assignment = new Step2();
		assertTrue("Expected Output with 0", assignment.process(0, 20).equals("0 1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"));
	}

	@Test
	public void assertAssignment2Rainy1Scenario() {
		Step2 assignment = new Step2();
		assertTrue("Start index larger than end index", assignment.process(1, 0).equals("Start index cannot be greater than end"));
	}
	
	@Test
	public void assertAssignment3Sample() {
		Step3 assignment = new Step3();
		assertTrue("Expected Assignment3 Output", assignment.process(1, 20).equals("integer integer lucky integer buzz fizz integer integer fizz buzz integer fizz lucky integer fizzbuzz integer integer fizz integer buzz \nfizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10"));
	}	
	
	@Test
	public void assertAssignment3AddTestOutput() {
		Step3 assignment = new Step3();
		assertTrue("Expected Output with 0", assignment.process(0, 20).equals("integer integer integer lucky integer buzz fizz integer integer fizz buzz integer fizz lucky integer fizzbuzz integer integer fizz integer buzz \nfizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 11"));
	}

	@Test
	public void assertAssignment3Rainy1Scenario() {
		Step3 assignment = new Step3();
		assertTrue("Start index larger than end index", assignment.process(1, 0).equals("Start index cannot be greater than end"));
	}
}
