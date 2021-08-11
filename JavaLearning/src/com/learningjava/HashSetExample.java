package com.learningjava;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 5, 10, 1, 5, 4, 6, 10 };
		HashSet<Integer> uniqueElements = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (!uniqueElements.add(array[i])) {
				System.out.println(array[i]);
			}
		}
	}
}
