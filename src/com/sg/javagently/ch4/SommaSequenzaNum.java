package com.sg.javagently.ch4;

import java.io.BufferedReader;
import java.io.IOException;

public class SommaSequenzaNum {
	public static void main(String[] args) throws IOException {
		int count;
		double total = 0;
		double number;

		BufferedReader bufferReader = Text.open(System.in);

		Text.prompt("****** Somma di numeri ******");
		Text.prompt("Quanti numeri?");
		count = Text.readInt(bufferReader);
		for (int i = 1; i <= count; i++) {
			Text.prompt(i + "> ");
			number = Text.readDouble(bufferReader);
			total += number;
		}

		Text.prompt("Basta, grazie.");
		Text.prompt("Il totale e' " + total);
	}
}
