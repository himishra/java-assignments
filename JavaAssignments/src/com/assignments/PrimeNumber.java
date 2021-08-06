package com.assignments;

import java.util.Scanner;

public class PrimeNumber {

	{
		System.out.print("Enter number: ");
	}

	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();

	public void checkPrimeOrNot() {
		int flag = 0;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				System.out.println(number + " is not prime number");
				flag=1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(number + " is prime number.");
		}
	}
}
