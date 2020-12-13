package com.sg.javagently.ch4.javagently;

import static java.lang.System.in;
import java.io.*;
import com.sg.javagently.ch4.javagently.*;

public class SommaSequenzaNumStatic {
	public static void main(String[] args) throws IOException {
		int count;
		double total = 0;
		double number;

		BufferedReader bufferReader = TextStatic.open(System.in);

		TextStatic.prompt("****** Somma di numeri ******");
		TextStatic.prompt("Quanti numeri?");
		count = TextStatic.readInt(bufferReader);
		System.out.println(count);
		for (int i = 1; i <= count; i++) {
			System.out.print(i + "> ");
			number = TextStatic.readDouble(bufferReader);
			total += number;
		}

		System.out.println("Basta, grazie.");
		System.out.println("Il totale e' " + total);
	}
}
