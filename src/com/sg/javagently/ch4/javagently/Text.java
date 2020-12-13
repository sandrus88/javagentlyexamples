package com.sg.javagently.ch4.javagently;

import java.io.*;

class Text {

	/**
	 * Stampa a video il messaggio passato come parametro
	 * @param msg messaggio da far stampare a video
	 */
	void prompt(String msg) {

	}

	/**
	 * Dato un BufferedReader come input, apre lo stream e aspetta che l'utente inserisce un intero.
	 * @param in BufferedReader a quale aprire lo stream e leggere il valore inserito dalla tastiera
	 * @return il valore intero inserito dall'utente
	 */
	int readInt(BufferedReader in) {
		return 0;
	}

	/**
	 * Dato un BufferedReader come input, apre lo stream e aspetta che l'utente inserisce un intero.
	 * @param in BufferedReader a quale aprire lo stream e leggere il valore inserito dalla tastiera
	 * @return il valore double inserito dall'utente
	 */
	double readDouble(BufferedReader in) {
		return 0;
	}

	String readString(BufferedReader in) {
		return null;
	}

	char readChar(BufferedReader in) {
		return 0;
	}

	String writeInt(int number, int align) {
		return null;
	}
	
	String writeDouble(double number, int align, int frac) {
		return null;
	}

	/**
	 * Metodo open, dato un InputStream crea e ritorna un BufferedReader
	 *
	 * @param in InputStream da aprire
	 * @return BufferedReader per l'input stream passato in input
	 */
	BufferedReader open(InputStream in) {
		return null;
	}
	
	BufferedReader open(String filename) {
		return null;
	}
	
	PrintWriter create(String filename) {
	return null;
	}
}
