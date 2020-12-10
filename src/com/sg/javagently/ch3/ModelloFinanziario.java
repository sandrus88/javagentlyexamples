package com.sg.javagently.ch3;

/*
 * Visualizza un istrogramma dell'interesse semplice per una capitale e un tasso dati,
 * per un periodo da 5 a 15 anni.
 * 
 * Illustra l'uso di passaggio di parametri e cicli for.
 */

class ModelloFinanziario {
	static final double p = 1000;
	static final double rate = 12.5;

	static void bar(int label, double h) {
		// Disegna una singola barra di istogramma fatta h/100 asterischi
		// e con una etichetta che indica gli anni
		System.out.print(label + "\t|");
		int stop = (int) (h / 100);
		for (int star = 0; star < stop; star++)
			System.out.println('*');
		System.out.println(" " + (long) h);
	}

	static void axis() {
		// Disegna un asse orizzontale con ticks+1 suddivisioni etichettati a intervalli
		// di 1000.
		// Ogni suddivisione e' lunga 10 caratteri
		int ticks = 5;

		// Stampa una barra
		System.out.print('\t');
		for (int line = 0; line < ticks * 10; line++)
			System.out.print('=');
		System.out.println('=');

		// Stampa i ticks
		System.out.print('\t');
		for (int n = 0; n < ticks; n++)
			System.out.print("+         ");
		System.out.println('+');

		// Etichetta i ticks
		System.out.print('\t');
		for (int n = 0; n < ticks; n++)
			System.out.print(n * 1000 + "       ");
		System.out.println();

		// Etichetta l'intero asse
		System.out.println("\t\t\t\tgraz");
	}

	public static void main(String[] args) {
		// L'intestazione
		System.out.println("Piano di crescita di SavBank");
		System.out.println("============================");
		System.out.println("Capitale di " + p + " al tasso di " + rate);
		System.out.println();
		System.out.println("Anni");

		// Visualizza una barra per ogni anno e infine le righe conclusive
		for (int year = 5; year <= 15; year++)
			bar(year, p * 1.2 * year * rate / 100 + p);
		axis();
	}
}
