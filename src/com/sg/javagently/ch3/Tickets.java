package com.sg.javagently.ch3;

/*
 * Crea e stampa un'etichetta per un talloncino di un dato prezzo, stile, valore.
 * 
 * Illustra la dichiarazione di una classe
 */

class Tickets {
	private char hori, verti, price;
	private int depth, width;

	Tickets(char h, char v, int d, int w) {
		hori = h;
		verti = v;
		depth = d;
		width = w;
	}

	void varyBox(char price) {
		aLine(hori, hori, hori);
		for (int d = 2; d < depth; d++)
			aLine(verti, price, verti);
		aLine(hori, hori, hori);
		System.out.println();
	}

	private void aLine(char left, char centre, char right) {
		System.out.print(left);
		for (int w = 2; w < width; w++)
			System.out.print(centre);
		System.out.println(right);
	}

	/*
	 * Il programma stampa quattro talloncini di diverso aspetto
	 */
	public static void main(String[] args) {
		System.out.println("Prezzi suggeriti per la festa");
		Tickets small = new Tickets('-', '|', 5, 11);
		small.varyBox('2');
		small.varyBox('1');

		Tickets bigger = new Tickets('=', '=', 7, 15);
		bigger.varyBox('5');
		bigger.varyBox('8');
	}
}
