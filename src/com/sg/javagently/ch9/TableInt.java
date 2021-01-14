package com.sg.javagently.ch9;

import java.io.BufferedReader;
import java.io.IOException;

import com.sg.javagently.ch4.Text;

class TableInt {
	public static void main(String[] args) throws IOException {

		OurInteger t[] = new OurInteger[10];

		BufferedReader bufferReader = Text.open(System.in);
		for (int i = 0; i < 10; i++) {
			t[i] = new OurInteger(Text.readInt(bufferReader));
		}

		System.out.println("Prima dell'ordinamento");
		System.out.println("======================");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i].val + " ");
			System.out.println();
		}

		Ordinamento.selectionOrdinamento(t, t.length);

		System.out.println();
		System.out.println("Dopo l'ordinamento");
		System.out.println("======================");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i] + " ");
			System.out.println();
		}
	}

	class OurInteger implements OrdinamentoI {
		int val;

		public OurInteger(int i) {
			val = i;
		}

		@Override
		public boolean lessThan(OrdinamentoI a) {
			OurInteger i = (OurInteger) a;
			return val < i.val;
		}

		public String toString() {
			return String.valueOf(val);
		}

	}
}