package com.sg.javagently.ch4.javagently;

import static java.lang.System.in;
import java.io.*;
import com.sg.javagently.ch4.javagently.*;

public class SommaSequenzaNum {
	public static void main(String[] args) throws IOException {
		int count;
		double total = 0;
		double number;
		
		Text text = new Text();
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
//		bufferReader = text.open(System.in);

		System.out.println("****** Somma di numeri ******");

		text.prompt("Quanti numeri?");
		count = text.readInt(bufferReader);
		for (int i = 1; i <= count; i++) {
			System.out.print(i + "> ");
			number = text.readDouble(bufferReader);
			total += number;
		}

		System.out.println("Basta, grazie.");
		System.out.println("Il totale e' " + total);
	}
}
