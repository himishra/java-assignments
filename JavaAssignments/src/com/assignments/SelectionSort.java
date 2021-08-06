package com.assignments;

import java.util.Scanner;

public class SelectionSort {
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

	public void selectionSortAlgorithm() {

		for (int i = 0; i < numberOfElement - 1; i++) {
			int min_idx=i;
			for (int j = i+1; j < numberOfElement; j++) {
				if (array[j] < array[min_idx]) {
					min_idx = j;
				}
			}
			int temp = array[i];
			array[i] = array[min_idx];
			array[min_idx] = temp;
		}
	}
}
