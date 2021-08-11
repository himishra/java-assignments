package com.learningjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter total number of elements: ");
		int n = input.nextInt();

		// Create HashSet object.
		HashSet<Integer> hashSet = new HashSet<Integer>();
		System.out.println("Enter values.");
		for (int i = 0; i < n; i++) {
			hashSet.add(input.nextInt());
		}

//		// Iterate HashSet object.
//		// way-1
//		Iterator<Integer> it = hashSet.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		// way-2
//		for (Integer i : hashSet) {
//			System.out.println(i);
//		}
//
//		// isEmpty() method of HashSet.
//		System.out.print("Is hashSet object empty? " + hashSet.isEmpty() + "\n");
//
//		// contains() method of HashSet.
//		System.out.println("Enter element to check it is in hashSet or not : " + hashSet.contains(input.nextInt()));
//
//		// remove() method of HashSet.
//		System.out.println("Enter element to remove from hashSet : " + hashSet.remove(input.nextInt()));
//
//		// size() method of HashSet.
//		System.out.println("Size of hashSet : " + hashSet.size());
//
//		// clear() method of HashSet.
//		hashSet.clear();
//
//		// iterate after clear().
//		for (Integer i : hashSet) {
//			System.out.println(i);
//		}

		// another hashset object
		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		System.out.println("Enter values.");
		for (int i = 0; i < n; i++) {
			hashSet2.add(input.nextInt());
		}

		System.out.println("HashSet first object.");
		Iterator<Integer> it = hashSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("HashSet second object.");
		it = hashSet2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// addAll() method.
		hashSet.addAll(hashSet2);
		System.out.println("HashSet first object after adding all.");
		it = hashSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// removeAll() method.
		hashSet.removeAll(hashSet2);
		System.out.println("HashSet first object after removing all.");
		it = hashSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
