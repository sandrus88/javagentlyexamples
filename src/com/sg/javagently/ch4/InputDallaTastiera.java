package com.sg.javagently.ch4;

import java.io.*;
import static java.lang.System.in;

public class InputDallaTastiera {

	public static void main(String[] args) throws IOException {
		InputStreamReader inputStream = new InputStreamReader(in);
		BufferedReader bufferReader = new BufferedReader(inputStream);
		
		String line = bufferReader.readLine();
		System.out.println("Ho inserito: " + line);
	}
}