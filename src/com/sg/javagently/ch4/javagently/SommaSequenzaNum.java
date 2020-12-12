package com.sg.javagently.ch4.javagently;

import java.io.*;
import com.sg.javagently.ch4.javagently.*;

public class SommaSequenzaNum {
	public static void main(String[] args) throws IOException {
		int count;
		double total = 0;
		double number;

		BufferedReader in = Text.open(System.in);

		System.out.println("****** Somma di numeri ******");

		Text.prompt("Quanti numeri?");
		count = Text.readInt(in);
		for (int i = 1; i <= count; i++) {
			System.out.println(i + "> ");
			number = Text.readDouble(in);
			total += number;
		}

		System.out.println("Basta, grazie.");
		System.out.println("Il totale e' " + total);
	}
}
