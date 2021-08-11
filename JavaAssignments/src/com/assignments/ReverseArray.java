package com.assignments;

import java.util.Scanner;

public class ReverseArray {

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

	public void reverseArray() {
		int temp = 0;									
		for (int i = 0; i < numberOfElement / 2; i++) {	
			temp = array[i];							//	temp = 1
			array[i] = array[numberOfElement - i - 1];	//	arr[0] = arr[4] 
			array[numberOfElement - i - 1] = temp;		//	arr[4] = temp
		}
	}
}