package com.assignments;

import java.util.Scanner;

public class LinearSearch {

	{
		System.out.print("Enter number of elements: ");
	}

	Scanner scanner = new Scanner(System.in);
	int numberOfElement = scanner.nextInt();
	int[] array = new int[numberOfElement];

	public void getElements() {
		for (int i = 0; i < numberOfElement; i++) {
			System.out.print("Enter value of " + i + " element: ");
			array[i] = scanner.nextInt();
		}
	}

	public void displayElements() {
		for (int i = 0; i < numberOfElement; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void linearSearch() {
		System.out.println("Enter a number to find in array: ");
		int searchElement = scanner.nextInt();
		int flag=0;
		for(int i=0;i<numberOfElement;i++) {
			if(array[i] == searchElement) {
				System.out.println(searchElement + " number found at "+ (i+1));
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(searchElement+" not found in the array.");
		}
	}
}
