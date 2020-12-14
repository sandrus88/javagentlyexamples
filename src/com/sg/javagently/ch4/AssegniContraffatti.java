package com.sg.javagently.ch4;

import java.io.BufferedReader;
import java.io.IOException;

public class AssegniContraffatti {
	static final int noOfDigits = 10;
	static boolean counterfeit = false;
	static int countOfZeros = 0;
	static int countOfNonZeros = 0;

	static void recordZero() {
		countOfZeros++;
		countOfNonZeros = 0;
		if (countOfZeros == 3)
			counterfeit = true;
	}

	static void recordNonZero() {
		countOfNonZeros++;
		countOfZeros = 0;
		if (countOfNonZeros == 4)
			counterfeit = true;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader bufferReaderAss = Text.open(System.in);

		System.out.println("****** Ricerca di contraffazioni ******");
		System.out.println(
				"Inserisci le 10 cifre del numero di un assegno " + "separate da uno spazio e termina con un invio");

		char digit;
		for (int i = 0; i < noOfDigits; i++) {
			digit = Text.readChar(bufferReaderAss);
			if (digit == '0')
				recordZero();
			else
				recordNonZero();
		}
		if (counterfeit)
			System.out.print("\tCONTRAFFATTO");
		else
			System.out.print("\tOK");
		System.out.println();
	}
}
