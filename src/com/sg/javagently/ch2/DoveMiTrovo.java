package com.sg.javagently.ch2;

import java.util.*;

/*
 * Il programma che scopre dove sono
 * 
 * Illustra l'uso delle classi di un package e la possibilita' di cambiare localizzazione
 */

class DoveMiTrovo {
	public static void main(String[] args) {
		Locale here = Locale.getDefault();

		System.out.println("La mia localizzazione e' " + here);
		System.out.println("Stato " + here.getCountry());
		System.out.println("Linguaggio " + here.getLanguage());
		System.out.println("Stato " + here.getDisplayCountry());
		System.out.println("Linguaggio " + here.getDisplayLanguage());
		System.out.println();

		Locale there = new Locale("GERMAN", "GERMANY");
		there.setDefault(Locale.GERMANY);
		System.out.println("La nuova localizzazione e' " + there);
		System.out.println("Stato " + there.getCountry());
		System.out.println("Linguaggio " + there.getLanguage());
		System.out.println("Stato " + there.getDisplayCountry());
		System.out.println("Linguaggio " + there.getDisplayLanguage());
	}
}
