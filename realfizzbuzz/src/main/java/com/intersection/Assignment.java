/**
 * 
 */
package com.intersection;

/**
 * @author amuthukumarasamy
 *
 */
public class Assignment {
	public static void main(String[] args) {		
		if (args[0].equalsIgnoreCase("Step1"))
			assignment1();
		else if (args[0].equalsIgnoreCase("Step2"))
			assignment2();
		else if (args[0].equalsIgnoreCase("Step3"))
			assignment3();
		else if (args[0].equalsIgnoreCase("All")) {
			assignment1();
			assignment2();
			assignment3();
		}
	}

	private static void assignment3() {
		System.out.println("Step3");
		System.out.println("-----");
		Step3 assignment3 = new Step3();
		System.out.println(assignment3.process(1, 20));	
		System.out.println(assignment3.process(0, 19));
		System.out.println(assignment3.process(15, 0));
		System.out.println(assignment3.process(0, 50));
		System.out.println("\n");
	}

	private static void assignment2() {
		System.out.println("Step2");
		System.out.println("-----");
		Step2 assignment2 = new Step2();
		System.out.println(assignment2.process(1, 20));
		System.out.println(assignment2.process(0, 19));
		System.out.println(assignment2.process(15, 0));
		System.out.println("\n");
	}

	private static void assignment1() {
		System.out.println("Step1");
		System.out.println("-----");
		Step1 assignment1 = new Step1();
		System.out.println(assignment1.process(1, 20));
		System.out.println(assignment1.process(0, 19));
		System.out.println(assignment1.process(15, 0));
		System.out.println("\n");
	}
}
