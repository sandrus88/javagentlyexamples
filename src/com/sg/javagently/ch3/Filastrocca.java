package com.sg.javagently.ch3;

/*
 * Il programma visualizza il testo della canzone "One man went to mow"
 * 
 * Illustra cicli for annidati e conteggi a rovescio
 */

class Filastrocca {
	public static void main(String[] args) {
		System.out.println("****** One man went to mow ******");
		for (int man = 1; man <= 5; man++) {
			System.out.println(man + " men went to mow, went to mow a meadow,");
			for (int companions = man; companions >= 2; companions--)
				System.out.print(companions + " men, ");
			System.out.println("1 man and his dog, " + "went to mow a meadow. ");
			System.out.println();
		}
	}
}
