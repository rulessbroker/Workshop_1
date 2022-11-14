package com.bridgelabz;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 12, 45, 23, 89, 54, 23 };
		System.out.println("Simple Array : ");
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}

		simpleSort(arr);
		System.out.println();
		bubbleSorting(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void simpleSort(int arr[]) {
		int length = arr.length;
		Arrays.sort(arr);
		System.out.println("\nSorted array : ");
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void bubbleSorting(int arr[]) {
		int length = arr.length;
		int j;
		System.out.println("Bubble sorting : ");
		for (int i = 0; i < length - 1; i++)

			for (j = 0; j < length - i - 1; j++)

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
}
