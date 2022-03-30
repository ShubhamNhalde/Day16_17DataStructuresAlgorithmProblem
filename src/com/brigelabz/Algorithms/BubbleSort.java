package com.brigelabz.Algorithms;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		int number, a, b, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of integers: ");
		number = sc.nextInt();
		int[] arrInput = new int[number];
		System.out.println("Enter " + number + " integers: ");
		for (a = 0; a < number; a++)
			arrInput[a] = sc.nextInt();
		// to access each array element
		for (a = 0; a < (number - 1); a++) {
			// to compare array elements
			for (b = 0; b < number - a - 1; b++) {
				// logic to sort in ascending order
				if (arrInput[b] > arrInput[b + 1]) {
					temp = arrInput[b];
					arrInput[b] = arrInput[b + 1];
					arrInput[b + 1] = temp;
				}
			}
		}
		sc.close();
		System.out.println("Sorted integers: ");
		for (a = 0; a < number; a++)
			System.out.println(arrInput[a]);
	}
}
