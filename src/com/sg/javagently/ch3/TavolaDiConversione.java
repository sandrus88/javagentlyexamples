package com.sg.javagently.ch3;

/*
 * Visualizza una semplice tavola per la conversione da gradi Celsius a gradi Fahrenheit
 * per un certo intervallo di valori.
 * 
 * Illustra l'utilizzo delle variabili di ciclo in espressioni contenute nel ciclo
 */

class TavolaDiConversione {
	public static void main(String[] args) {
		System.out.println("Tavola di Conversione");
		System.out.println("=====================");
		System.out.println(); 
		System.out.println("C       F");

		for (int c = 5; c <= 20; c++) {
			System.out.print(c + "\t");
			System.out.println(Math.round(c * 9 / 5 + 32));
		}
	}
}
