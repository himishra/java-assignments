package com.assignments;

import java.util.Scanner;

public class TwoDMatrixAddition {
	Scanner scanner = new Scanner(System.in);
	int rows, cols;
	{
		System.out.print("Enter number of rows: ");
		rows = scanner.nextInt();
		System.out.print("Enter number of cols: ");
		cols = scanner.nextInt();
	}

	int[][] firstArray = new int[rows][cols];
	int[][] secondArray = new int[rows][cols];

	public void getElements() {

		System.out.println("Enter elements of first array...");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter value of row-" + i + " and col-" + j + " element: ");
				firstArray[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter elements of second array...");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter value of row-" + i + " and col-" + j + " element: ");
				secondArray[i][j] = scanner.nextInt();
			}
		}
	}
	
	public void displayArrays() {
		
		System.out.println("Elements of first array...");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(secondArray[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Elements of second array...");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(secondArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void additionMatrix() {
		System.out.println("Result of addition...");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(firstArray[i][j]+ secondArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
