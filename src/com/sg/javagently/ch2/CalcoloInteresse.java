package com.sg.javagently.ch2;

/*
 * Calcola la differenza in interessi semplici tra due tassi 
 * di interesse per il resto dell'anno dato un certo mese.
 * 
 * Illustra dichiarazioni, assegnamenti, costanti espressioni e stampe.
 */

public class CalcoloInteresse {
	static final double p = 1000; // in graz
	static final int m = 4; // per Aprile
	static final double oldRate = 12.5; // %
	static final double newRate = 13.00; // %

	public static void main(String[] args) {
		// Inizia con un titolo
		System.out.println("SavBank Calcolo degli interessi");
		System.out.println("===============================");

		// Effettua il calcolo preliminare
		double ptOver100 = p * (12 - m) / 12 / 100;

		// Stampa i risultati
		System.out.println("Data una variazione del tasso dal " + oldRate + "% al " + newRate + "% nel mese " + m + ",");
		System.out.println("su un capitale di G" + p + " l'interesse per il resto dell'anno");
		System.out.print("variera' di graz e centesimi: ");
		System.out.println(ptOver100 * newRate - ptOver100 * oldRate);
	}
}
