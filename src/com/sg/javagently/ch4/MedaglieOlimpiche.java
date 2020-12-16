package com.sg.javagently.ch4;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class MedaglieOlimpiche {

	public static void main(String[] args) throws IOException {

		System.out.println("**** Medaglie olimpiche ****");
		System.out.println();

		BufferedReader bufferReader = Text.open(System.in);
		BufferedReader bufferReaderFile = Text.open(System.in);
		String filename = "";

		for (;;) {
			try {
				Text.prompt("Quale file per il medagliere?");
				filename = Text.readLineFile(bufferReader);
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

		try {
			for (;;) {
				country = Text.readLineFile(bufferReaderFile);
				gold = Text.readInt(bufferReaderFile);
				silver = Text.readInt(bufferReaderFile);
				bronze = Text.readInt(bufferReaderFile);
				total = gold + silver + bronze;
				System.out.print(country);
				if (country.length() < 8)
					System.out.print("\t");
				System.out.println("\t" + gold + "\t" + silver + "\t" + bronze + "\t" + total);
				all += total;
			}
		} catch (EOFException e) {
			System.out.println(all + " medaglie vinte.");
		}
	}
}
