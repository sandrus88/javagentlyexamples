package com.sg.javagently.ch4;

import java.io.BufferedReader;
import java.io.IOException;

class SommaTreModi {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferReaderSum = Text.open(System.in);

		int count;
		double total = 0;
		double posTotal = 0;
		double negTotal = 0;
		double number;

		System.out.println("****** Le tre somme ******");
		Text.prompt("Quanti numeri?");
		count = Text.readInt(bufferReaderSum);

		for (int i = 1; i <= count; i++) {
			Text.prompt(i + ">  ");
			number = Text.readDouble(bufferReaderSum);
			total = total + number;
			if (number > 0)
				posTotal += number;
			else
				negTotal += number;
		}
		
		Text.prompt("Basta, grazie.");
		Text.prompt("Il totale e' " + total);
		Text.prompt("Il totale positivo e' " + posTotal);
		Text.prompt("Il totale negativo e' " + negTotal);
	}
}