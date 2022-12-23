package com.project.calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainApp {

	public static void main(String[] args) {
		final String inputExp = ReadInput.read();

		Queue<String> operations;
		Queue<String> numbers;

//		using split method to split numbers and operators into two different string arrays
		String numbersArr[] = inputExp.split("[-+*/]");
//		first array holds only numbers
//		second array holds only mathematical operators
		String operatorsArr[] = inputExp.split("[0-9]+");

//		converting string array into a queue
		numbers = new LinkedList<String>(Arrays.asList(numbersArr));
		operations = new LinkedList<String>(Arrays.asList(operatorsArr));

//		fetching first element in numbers queue
		Double res = Double.parseDouble(numbers.poll());

//		running a loop on numbers queue till it is empty
		while (!numbers.isEmpty()) {
			String opr = operations.poll();
			// fetching elements in operations queue inside the loop

			Operate operate;
			switch (opr) {
			case "+":
				operate = new Add();
				break;
			case "-":
				operate = new Subtract();
				break;
			case "*":
				operate = new Multiply();
				break;
			case "/":
				operate = new Division();
				break;
			default:
				continue;
			}
//			fetching the next number from the numbers queue
			Double num = Double.parseDouble(numbers.poll());

			res = operate.getResult(res, num);
		}
		System.out.println(res);
	}
}
