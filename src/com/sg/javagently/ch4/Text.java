package com.sg.javagently.ch4;

import java.io.*;

public class Text {

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
	 * Metodo open crea e ritorna un BufferedReader costruito con il file passato come parametro.
	 * 
	 * @param nomeFile il nome del file
	 * @return BufferedReader costruito con il file passato come parametro 
	 * @throws FileNotFoundException se il file non esiste nel file system
	 */
	public static BufferedReader open(String nomeFile) throws FileNotFoundException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeFile));
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
	
	/**
	 * Il metodo writeDouble 
	 * 
	 * @param double number, int align, int frac
	 * @return stringa
	 */
//	public static String writeDouble(double number, int align, int frac) {
//		String s = bufferedReader.readLine(); 
//		return s;
//	}
	
	/**
	 * Dato un BufferedReader come input, leggiamo il valore char dal suo stream.
	 * 
	 * @param bufferedReader BufferedReader dal quale leggere un char
	 * @return il valore char letto dal bufferedReader
	 * @throws IOException se la comunicazione del inputStream del bufferedReader si interrompe
	 */
	public static char readChar(BufferedReader bufferedReader) throws IOException {
		String s = bufferedReader.readLine(); 
		char c = s.charAt(0);
		return c;
	}
	
	/**
	 * Dato un BufferedReader come input, leggiamo una stringa dal suo stream.
	 * 
	 * @param bufferedReader BufferedReader dal quale leggere una stringa
	 * @return la stringa dal bufferedReader
	 * @throws IOException se la comunicazione del inputStream del bufferedReader si interrompe
	 */
	public static String readLine(BufferedReader bufferedReader) throws IOException {
		String s = bufferedReader.readLine(); 
		return s;
	}
	
	public static PrintWriter create(String nomeFile) throws IOException {
		PrintWriter printWriter = new PrintWriter(new FileWriter(nomeFile));
		return printWriter;
	}
}
