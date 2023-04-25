package com.greatlearning.lab3;

import java.util.Stack;

public class BalancingBrackets {

	public boolean isValid(String s) {
		// Initializing stack with Character data type
		Stack<Character> stack = new Stack<Character>();
		char cha;

		// Looping through the String characters
		for (int i = 0; i < s.length(); i++) {
			cha = s.charAt(i);

			// Checking if it is an opening part then storing it into the stack
			if (cha == '(' || cha == '[' || cha == '{') {
				stack.push(cha);
			} else {

				/*
				 * If the character is closing part than we change the value of char variable to
				 * corresponding opening part for making comparisons
				 */

				if (cha == ')') {
					cha = '(';
				} else if (cha == ']') {
					cha = '[';
				} else {
					cha = '{';
				}

				/*
				 * Comparing top of the stack with the current value of char if matches then we
				 * pop out the stack top element
				 */
				if (!stack.empty() && stack.peek() == cha) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		// Checking if the stack is empty then brackets are balanced else not
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}

}
