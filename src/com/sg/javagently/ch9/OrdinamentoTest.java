package com.sg.javagently.ch9;

import java.io.BufferedReader;
import java.io.IOException;

import com.sg.javagently.ch4.Text;

public class OrdinamentoTest {

	public static void main(String[] args) throws IOException {

		Country t[] = new Country[10];
		String s;

		BufferedReader bufferReader = Text.open("Nazioni");
		for (int i = 0; i < t.length; i++) {
			s = Text.readLine(bufferReader);
			t[i] = new Country(s);
		}

		System.out.println("Prima dell'ordinamento");
		System.out.println("======================");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}

		Ordinamento.selectionOrdinamento(t, t.length);

		System.out.println();
		System.out.println("Dopo l'ordinamento");
		System.out.println("======================");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}

	}
}
