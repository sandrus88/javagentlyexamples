package com.sg.javagently.ch6;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

import com.sg.javagently.ch4.Text;

public class VotiStudenti {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferReaderFile = Text.open("marks.dat");
		BufferedReader bufferReader = Text.open(System.in);
		Hashtable table = new Hashtable(20);

		for (int i = 0; i < 10; i++) {
			Studenti studenti = new Studenti();

			studenti.setName(bufferReaderFile);
			studenti.setMarks(bufferReaderFile);
			studenti.calculateFinal();
			table.put(studenti.name, new Integer(studenti.finalMark));
		}

		System.out.println("Nella tabella ci sono");
		for (Enumeration e = table.keys(); e.hasMoreElements();) {
			String name = (String) e.nextElement();
			System.out.println(name);
		}

		while (true) {
			try {
				System.out.print("Quali voti vorresti conoscere?");
				String s = Text.readLine(bufferReader) + " " + Text.readLine(bufferReader);
				if (table.containsKey(s)) {
					Integer result = (Integer) table.get(s);
					System.out.println(result.intValue());
				} else {
					System.out.println("Mi spiace, prova ancora");
				}
			} catch (EOFException e) {
				break;
			}
		}

	}
}
