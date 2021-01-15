package com.sg.javagently.ch7;

import java.util.Calendar;

public class GiorniAcquistiPrimaDiNatale {

	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();
		Calendar christmas = Calendar.getInstance();

		christmas.set(today.get(Calendar.YEAR), Calendar.DECEMBER, 25);

		System.out.println("Usate questo programma solo in dicembre!");
		System.out.println("Natale cade il giorno " + christmas.getTime());
		System.out.println("Oggi e' il giorno " + today.getTime());
		System.out.println("Abbiamo a disposizione " + (christmas.get(Calendar.DATE) - today.get(Calendar.DATE))
				+ " giorni per effettuare gli acquisti di Natale.");
	}
}
