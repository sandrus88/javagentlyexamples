package com.sg.javagently.ch4;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;

public class SommaConEccezioni {

	public static void main(String[] args) throws IOException {
		int count = 0;
		double total = 0;
		double number;

		BufferedReader bufferReader = Text.open(System.in);

		Text.prompt("****** Somma di numeri ******");
		Text.prompt("Inserisci i numeri, termina con control-D (unix) o control-Z (Windows)");

		try {
			for (count = 1;; count++) {
				Text.prompt(count + ">");
				number = Text.readDouble(bufferReader);
				total += number;
			}
		} catch (EOFException e) {
			Text.prompt("Basta, grazie.");
			Text.prompt("Il totale dei " + (count - 1) + " numeri e' " + total);
		}

	}
}
