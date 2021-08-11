package com.assignments;

import java.util.Scanner;

public class DuplicateElementsInArray {
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

	public void duplicateElements() {
		for (int i = 0; i < numberOfElement; i++) {			// n
			for (int j = i + 1; j < numberOfElement; j++) {	// n
				if (array[i] == array[j]) {
					System.out.println(array[j]);
				}
			}
		}
	}

}
