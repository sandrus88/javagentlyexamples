package com.sg.javagently.ch4;

import java.io.BufferedReader;
import java.io.IOException;

public class InputDaFile {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferReaderFin = Text.open("numbers.txt");

		String line = Text.readLine(bufferReaderFin);

		Text.prompt("Letto dal file la riga : " + line);
	}
}
