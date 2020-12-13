package com.sg.javagently.ch4;

import java.io.*;

class Text {

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
		String s = bufferedReader.readLine(); 
		int x = Integer.parseInt(s);
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
		String s = bufferedReader.readLine(); 
		double x = Double.parseDouble(s);
		return x;
	}

}
