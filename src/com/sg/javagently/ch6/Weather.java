package com.sg.javagently.ch6;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;

import com.sg.javagently.ch4.Text;

class Weather {

	static int startYear, endYear = 0;
	static double rainTable[][] = new double[12][70];

	static void readIn() throws IOException {

		BufferedReader bufferReaderFile = Text.open("rain.dat");

		int actualYear = 0;
		int yearIndex = 0;
		try {
			while (true) {
				actualYear = Text.readInt(bufferReaderFile);
				System.out.print(actualYear + " ");
				if (yearIndex == 0) {
					startYear = actualYear;
				}
				for (int m = 0; m < 12; m++) {
					rainTable[m][yearIndex] = Text.readDouble(bufferReaderFile);
					System.out.print(Text.writeDouble(rainTable[m][yearIndex], 5, 0));
				}
				System.out.println();
				yearIndex++;
			}
		} catch (EOFException e) {
			endYear = actualYear;
			System.out.println("Dati letti dal " + startYear + " al " + endYear + "\n\n");

		}
	}

	static void showResults() {
		System.out.println("Statistica per le precipitazioni dal " + startYear + " al " + endYear);
		System.out.println("===============================================================================\n");
		System.out.println("Mese\tMedia\tDeviazione Std");
		int nyears = endYear - startYear + 1;
		double a, s;
		for (int m = 0; m < 12; m++) {
			a = Pioggie.monthlyAverage(rainTable[m], nyears);
			s = Pioggie.monthlyStdDev(rainTable[m], nyears, a);
			System.out.println(Text.writeInt(m + 1, 2) + Text.writeDouble(a, 11, 2) + Text.writeDouble(s, 10, 4));

		}

	}

	public static void main(String[] args) throws IOException {

		readIn();
		showResults();
	}

}
