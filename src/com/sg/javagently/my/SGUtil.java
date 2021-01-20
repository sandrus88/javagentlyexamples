package com.sg.javagently.my;

public class SGUtil {
	public static void printArray(String[] arr) {
		final String separator = ", ";
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + separator);
		}
		System.out.println();
	}
}
