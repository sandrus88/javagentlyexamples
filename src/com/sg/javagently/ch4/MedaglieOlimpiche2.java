package com.sg.javagently.ch4;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class MedaglieOlimpiche2 {

	public static void main(String[] args) throws IOException {

		System.out.println("**** Medaglie olimpiche ****\n");

		BufferedReader bufferReader = Text.open(System.in);
		BufferedReader bufferReaderFile;
		String filename = "";

		for (;;) {
			try {
				Text.prompt("Quale file per il medagliere?");
				filename = Text.readLine(bufferReader);
				bufferReaderFile = Text.open(filename);
				break;
			} catch (FileNotFoundException e) {
				System.out.println(filename + " non esiste.");
				System.out.println("Prova ancora");
			}
		}

		String country;
		int gold, silver, bronze, total, all = 0;
		System.out.println("\nNazione\t\tOro\tArgento\tBronzo\tTotale");

		String line = Text.readLine(bufferReaderFile);
		if (line != null) {
			String[] arrStr = line.split(" ");
			country = arrStr[0];
			gold = Integer.parseInt(arrStr[1]);
			silver = Integer.parseInt(arrStr[2]);
			bronze = Integer.parseInt(arrStr[3]);
			total = gold + silver + bronze;
			System.out.print(country);
			if (country.length() < 8)
				System.out.print("\t");
			System.out.println("\t" + gold + "\t" + silver + "\t" + bronze + "\t" + total);
			all += total;
		} else {
			System.out.println("Fine del file");
		}

	}
}
