package com.sg.javagently.ch5;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;

import com.sg.javagently.ch4.Text;

class TassiCambio {
	static final double yenExchange = 0.04;
	static final double dollarExchange = 4.6;
	static final double markExchange = 3.0;
	static final double francExchange = 0.91;

	public static void main(String[] args) throws IOException {
		BufferedReader bufferReaderCambio = Text.open(System.in);
		double amount;
		double factor = 0;
		char c = '$';

		System.out.println("Listino di cambio della SavBank");
		System.out.println("==================================");
		System.out.println("Graz\t in\t valgono");
		for (;;) {
			try {
				amount = Text.readDouble(bufferReaderCambio);

				boolean found = false;
				while (!found) {
					c = Text.readChar(bufferReaderCambio);
					Text.prompt("\t\t");
					switch (c) {
					case 'Y':
						factor = yenExchange;
						break;
					case '$':
						factor = dollarExchange;
						break;
					case 'D':
						factor = markExchange;
						break;
					case 'F':
						factor = francExchange;
						break;
					default:
						System.out.println("Valute valide sono Y$DF. Prova ancora.");
						Text.prompt("\t\t");
					}
					found = (c == 'Y' | c == '$' | c == 'D' | c == 'F');
				}
				// System.out.print(Text.writeDouble(amount/factor, 8,3));
				switch (c) {
				case 'Y':
					System.out.println("yen");
					break;
				case '$':
					System.out.println("dollari");
					break;
				case 'D':
					System.out.println("marchi");
					break;
				case 'F':
					System.out.println("franchi");
					break;
				}
			} catch (EOFException e) {

			}
		}
	}
}
