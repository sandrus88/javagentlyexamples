package com.sg.javagently.my;

public class SGUtil {
	public static void printArray(String[] arr) {
		final String separator = ", ";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + separator);
			}
		}
		System.out.println();
	}
	
	public static String getArrayAsString(String[] arr) {
		final String separator = ", ";
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				 s = s + arr[i];
			} else {
				 s =  s + arr[i] + separator ;
			}
		}
		return s;
	}
}
