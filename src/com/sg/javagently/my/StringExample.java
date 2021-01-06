package com.sg.javagently.my;

import java.text.DateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class StringExample {

	public static void main(String[] args) {

		String frase = "ciao";
		char[] caracters = frase.toCharArray();
		for (int i = 0; i < caracters.length; i++) {
			System.out.println(
					"Questo e' il carattere della posizione " + "'" + i + "'" + " della frase ciao " + caracters[i]);
		}
		System.out.println();

		int bang = frase.indexOf("ci");
		int fizz = frase.indexOf("zo");
		System.out.println("Questi caratteri sono contenuti nella frase " + bang);
		System.out.println("Questi caratteri non sono contenuti nella frase " + fizz);
		System.out.println();

		String small = frase.substring(1, 3);
		System.out.println("Questa e' una sottostringa della frase " + small);
		System.out.println("Questa e' la comparazione tra la sottostringa e la frase " + frase.equals(small));
		System.out.println("Questa e' la comparazione tra la sottostringa e la frase " + frase.compareTo(small));
		System.out.println();

		String s = "Questo e' l'ombellico del mondo";
		StringTokenizer token = new StringTokenizer(s);
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		System.out.println();

		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

		Date today = new Date();
		DateFormat dFull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Oggi e' il giorno " + dFull.format(today.getTime()));
		System.out.println();

		DateFormat dDefault = DateFormat.getDateInstance(DateFormat.DEFAULT);
		System.out.println("Oggi e' il giorno " + dDefault.format(today.getTime()));
		System.out.println();

		DateFormat dLong = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Oggi e' il giorno " + dLong.format(today.getTime()));
		System.out.println();

		DateFormat dMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Oggi e' il giorno " + dMedium.format(today.getTime()));
		System.out.println();

		DateFormat dShort = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Oggi e' il giorno " + dShort.format(today.getTime()));
		System.out.println();

	}
}
