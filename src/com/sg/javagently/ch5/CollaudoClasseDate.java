package com.sg.javagently.ch5;

import java.io.BufferedReader;
import java.io.IOException;
import com.sg.javagently.ch4.Text;

class CollaudoClasseDate {
	public static void main(String[] args) throws IOException, Date.DateException {

		BufferedReader bufferReader = Text.open(System.in);

		Date d1 = new Date();
		Date d2 = new Date();

		try {
			d1 = new Date(1998, 12, 25);
			Text.prompt("Inserire una data (prima l'anno)");
			int a = Text.readInt(bufferReader);
			int m = Text.readInt(bufferReader);
			int g = Text.readInt(bufferReader);
			d2 = new Date(a, m, g);
		} catch (Date.DateException e) {
			System.out.println(e.getMessage());
		}
		System.out.print(d1 + " e' ");
		if (d1.lessThan(d2))
			System.out.print("precedente al ");
		else
			System.out.print("successivo al ");
		System.out.println(d2);
	}
}