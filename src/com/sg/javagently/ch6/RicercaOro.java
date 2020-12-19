package com.sg.javagently.ch6;

import java.io.BufferedReader;
import java.io.IOException;

import com.sg.javagently.ch4.Text;

class RicercaOro {

	public static void main(String[] args) throws IOException {

		System.out.println("****** Savanna Exploration inc. ******");
		System.out.print("Dov'e' l'oro? ");

		BufferedReader bufferReaderFile = Text.open("gold.dat");

		System.out.print("Troveremo l'oro");

		Oro mine = new Oro(8, 8);
		//mine.readIn(bufferReaderFile);
		mine.asses();
		mine.print();

	}

}
