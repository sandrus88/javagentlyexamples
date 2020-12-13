package com.sg.javagently.ch4.javagently;

import java.io.*;

class TextStatic {

	/**
	 * Stampa a video il messaggio passato come parametro
	 * 
	 * @param msg messaggio da far stampare a video
	 */
	public static void prompt(String msg) {
		System.out.println(msg);
	}

	/**
	 * Metodo open crea e ritorna un BufferedReader costruito con l'InputStream
	 * passato come parametro.
	 *
	 * @param in è un tipo InputStream
	 * @return BufferedReader costruito con il parametro passato al metodo
	 */
	public static BufferedReader open(InputStream in) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
		return bufferedReader;
	}

	/**
	 * Dato un BufferedReader come input, leggiamo il valore intero dal suo stream.
	 * 
	 * @param bufferedReader BufferedReader dal quale leggere un intero
	 * @return il valore intero letto dal bufferedReader
	 * @throws IOException se la comunicazione del inputStream del bufferedReader si interrompe
	 */
	public static int readInt(BufferedReader bufferedReader) throws IOException {
		int x = bufferedReader.read(); 
		System.out.println("x: " + x);
		return x;
	}

	/**
	 * Dato un BufferedReader come input, leggiamo il valore double dal suo stream.
	 * 
	 * @param bufferedReader BufferedReader dal quale leggere un double
	 * @return il valore double letto dal bufferedReader
	 * @throws IOException se la comunicazione del inputStream del bufferedReader si interrompe
	 */
	public static double readDouble(BufferedReader bufferedReader) throws IOException {
		double x = bufferedReader.read(); 
		return x;
	}

}
