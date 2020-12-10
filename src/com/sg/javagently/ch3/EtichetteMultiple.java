package com.sg.javagently.ch3;

/*
 * Il programma stampera' etichette una sotto l'altra
 * 
 * Illustra semplice ciclo for
 */

class EtichetteMultiple {
	static final int nEtichette = 8;

	public static void main(String[] args) {
		for (int i = 0; i < nEtichette; i++) {
			System.out.println("---------------------");
			System.out.println("|                   |");
			System.out.println("| Ms Mary Brown     |");
			System.out.println("| 33 Charles Street |");
			System.out.println("| Brooklyn          |");
			System.out.println("|                   |");
			System.out.println("---------------------");
			System.out.println("\n\n");
		}
	}
}
