package com.sg.javagently.ch5;

import java.io.BufferedReader;
import java.io.IOException;
import com.sg.javagently.ch4.Text;

class MassimoComunDivisore {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferReader = Text.open(System.in);

		System.out.println("***** Ricerca del MCD *****");
		Text.prompt("Quali sono i due interi?");
		int a = Text.readInt(bufferReader);
		int b = Text.readInt(bufferReader);
		System.out.println("Il MCD di " + a + " e " + b + " e' ");

		while (a != b)
			if (a > b)
				a -= b;
			else
				b -= a;
		System.out.println(a);
	}
}