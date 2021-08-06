package com.assignments;

import java.util.Scanner;

public class ReverseANumber {

	{
		System.out.print("Enter number: ");
	}

	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();

	public void reverseNumber() {
		
		String reversedNumber = "";
		int remainder = 0;
		System.out.println("Original Number: "+ number);
		while(number > 0) {
			remainder = number%10;
			reversedNumber += remainder;
			number /= 10;
		}
		
		System.out.println("Reversed Number: "+reversedNumber);
	}
}
