package com.sg.javagently.ch3;

/*
 * Visualizza una tavola per la conversione da gradi Celsius a gradi Fahrenheit per valori tra 0 e 99.
 * 
 * Illustra l'uso di metodi static per strutturare un programma, di metodi tipizzati e dei parametri.
 */

class GrandiTavoleDiConversione {
	static final int colsPerLine = 5;
	static final int maxLineNo = 20;
	static final String gap = "\t\t";

	// una semplice funzione di conversione
	static int fahrenheit(int Celsius) {
		return Math.round(Celsius * 9 / 5 + 32);
	}

	static void outaLine(int thisline) {
		/*
		 * Utilizzando l'informazione sul numero di riga fornito dal parametro, il
		 * metodo calcola i valori in gradi Celsius per la riga e li visualizza con i
		 * valori Fahrenheit equivalenti
		 */
		for (int col = 0; col < colsPerLine; col++) {
			int c = thisline * colsPerLine + col;
			System.out.print(c + "  ");
			System.out.print(fahrenheit(c) + gap);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("\t\tTavola di Conversione");
		System.out.println("\t\t=====================");
		System.out.println();

		for (int col = 0; col < colsPerLine; col++)
			System.out.print("C   F" + gap);
		System.out.println();
		/*
		 * per ogni riga, viene chiamato il metodo outaLine con il numerodi riga come
		 * parametro
		 */
		for (int r = 0; r < maxLineNo; r++)
			outaLine(r);

	}
}
