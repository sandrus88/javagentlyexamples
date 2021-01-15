package com.sg.javagently.ch7;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;

import com.sg.javagently.ch4.Text;

public class FormattazioneSpazi {

	public static void main(String[] args) throws IOException {

		System.out.println("Questo programma sostituisce gli spazi doppi con spazi singoli.");
		BufferedReader bufferReader = Text.open(System.in);

		String s = "";
		int spaceAt, startingFrom;
		try {
			while (true) {
				s = bufferReader.readLine();
				if (s == null) {
					throw new EOFException();
				}
				startingFrom = 0;
				while (true) {
					spaceAt = s.indexOf("  ", startingFrom);
					if (spaceAt == -1) {
						break;
					} else if (spaceAt == 0) {
						s = s.substring(0, spaceAt);
					} else {
						s = s.substring(0, spaceAt) + " " + s.substring(spaceAt + 2, s.length());
					}
					startingFrom = spaceAt + 2;
				}
				System.out.println(s);
			}
		} catch (EOFException e) {
		}
	}
}
