package com.project.calculator;

import java.util.Scanner;

public class ReadInput {

	public static String read() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input Expression (E.g 2+4*5)");

		String inputLine = scanner.nextLine();

		scanner.close();
		return inputLine;
	}

}
