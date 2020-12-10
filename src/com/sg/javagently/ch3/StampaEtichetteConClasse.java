package com.sg.javagently.ch3;

/*
 * Una classe che fornisce servizi per stampare un dato numero di etichette per riga.
 * Questo numero viene fornito come parametro al costruttore al momento della istanziazione di un oggetto.
 * Tutte le etichette hanno la stessa larghezza, ma l'altezza non e' conosciuta dalla classe.
 */

class EtichetteConClasse {
	EtichetteConClasse(int a) {
		across = a;
	}

	private int across;

	void printHorizontals() {
		for (int box = 0; box < across; box++)
			System.out.print("-----------   ");
		System.out.println();
	}

	void printVerticals() {
		for (int box = 0; box < across; box++)
			System.out.print("|         |   ");
		System.out.println();
	}
}

class StampaEtichetteConClasse {
	static final int nLabels = 4;
	static final int depth = 5;

	public static void main(String[] args) {
		// Crea una istanza della classe che dovrà provvedere alla stampa
		// e dice quante etichette sono necessarie
		EtichetteConClasse label = new EtichetteConClasse(nLabels);

		// Stampa le due righe orizzonatli intorno a quelle verticali.
		label.printHorizontals();
		for (int row = 2; row < depth; row++)
			label.printVerticals();
		label.printHorizontals();
	}
}
