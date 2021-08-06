package com.assignments;

import java.util.Scanner;

public class BubbleSort {
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
	
	public void bubbleSortAlgorithm() {
		
		for(int i=0;i<numberOfElement-1;i++) {
			for(int j=0;j<numberOfElement-i-1;j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
		}
	}
}
