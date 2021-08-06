package com.assignments;

import java.util.Scanner;

public class BinarySearch {

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

	public void binarySearch() {
		System.out.print("Enter a number to find in array: ");
		int searchElement = scanner.nextInt();
		
		int low = 0, high = numberOfElement - 1, mid = 0;
		
		while (low <= high) {
			mid = low + ((high - low) / 2);
			if (array[mid] == searchElement) {
				System.out.println(searchElement + " number found at " + (mid + 1));
				break;
			} else if (array[mid] < searchElement) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if (low > high) {
			System.out.println(searchElement + " not found in the array.");
		}
	}
}
