package com.sg.javagently.ch4;

import java.io.BufferedReader;
import java.io.IOException;

public class NumeroMaggiore {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferReaderSum = Text.open(System.in);

		System.out.println("****** Ricerca del massimo ******");

		// Scopre quanti numeri verranno letti
		Text.prompt("Quanti numeri (uno o piu')?");
		int n = Text.readInt(bufferReaderSum);

		// Inizia la sequenza
		Text.prompt("Inseriscili");
		Text.prompt("1>");
		int highest = Text.readInt(bufferReaderSum);

		// Legge e confronta il resto dei numeri
		int number;
		for (int i = 2; i <= n; i++) {
			Text.prompt(i + ">");
			number = Text.readInt(bufferReaderSum);
			if (number > highest)
				highest = number;
		}
		Text.prompt("Basta, grazie");
		Text.prompt("Il massimo e' " + highest);
	}
}