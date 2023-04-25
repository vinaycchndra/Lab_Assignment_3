package com.greatlearning.lab3;

import java.util.Scanner;

// Driver Class for the Question 1 of the assignment
public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input variable
		String input;
		System.out.println("Enter the String of brackets which you want to check: ");

		// Taking input
		input = sc.next();

		// Object of the class which holds the solution method with name as "isValid"
		BalancingBrackets obj = new BalancingBrackets();

		// calling the isValid function
		if (obj.isValid(input)) {
			System.out.println("The entered String " + input + " has Balanced Brackets");
		} else {
			System.out.println("The entered String " + input + " do not contain Balanced Brackets");
		}
		sc.close();
	}

}
