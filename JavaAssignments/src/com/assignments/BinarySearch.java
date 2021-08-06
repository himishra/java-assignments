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
		System.out.println("Enter a number to find in array: ");
		int searchElement = scanner.nextInt();
		int low = 0, high = numberOfElement, mid = 0;
		int flag = 0;
		while (low <= high) {
			mid = low + high / 2;
			if (array[mid] == searchElement) {
				System.out.println(searchElement + " number found at " + (mid + 1));
				flag=1;
				break;
			} else if (array[mid] < searchElement) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if(flag==0) {
			System.out.println(searchElement+" not found in the array.");
		}
	}
}
