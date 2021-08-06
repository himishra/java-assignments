package com.assignments;

import java.util.Scanner;

public class MinAndMaxElement {

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

	public void findMinAndMaxElement() {
		int minElement = array[0], maxElement = array[0];
		for (int i = 0; i < numberOfElement; i++) {
			// minimum element.
			if(array[i] < minElement) {
				minElement = array[i];
			}
			
			// maximum element.
			if(array[i] > maxElement) {
				maxElement = array[i];
			}
		}
		System.out.println("Maximum Element: "+maxElement);
		System.out.println("Maximum Element: "+minElement);
	}
}
