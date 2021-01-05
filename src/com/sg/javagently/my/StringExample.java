package com.sg.javagently.my;

public class StringExample {

	public static void main(String[] args) {

		String frase = "ciao";
		char[] caracters = frase.toCharArray();
		for (int i = 0; i < caracters.length; i++) {
			System.out.println("Questo e' il carattere della posizione " + "'" + i + "'" + " della frase ciao " + caracters[i]);
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

	}
}
