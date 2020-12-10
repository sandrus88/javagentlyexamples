package com.sg.javagently.ch2;

/*
 * Calcola il nuovo orario di arrivo per veicoli piu' veloci del 15% rispetto ai precedenti.
 * 
 * Illustra costanti, espressioni, assegnamenti e l'operatore %
 */

public class PianificazioneOrario {
	static final double reduction = 0.85;
	static final int depart = 900;
	static final int arrive = 1015;
	
	public static void main(String[] args) {
		long newArrive; //orario in 24 ore
		int departM, arriveM, oldJourneyTime;
		long newJourneyTime;
		long newArriveM; // in minuti in un giorno
		
		//converte l'orario iniziale in minuti
		departM = (depart / 100)*60 + depart % 100;
		arriveM = (arrive / 100)*60 + arrive % 100;
		
		//calcola i tempi di viaggio vecchi e nuovi
		oldJourneyTime = arriveM - departM;
		newJourneyTime = Math.round(oldJourneyTime*reduction);
		
		//calcola il nuovo tempo di arrivo in minuti e lo converte in orario 24 ore
		newArriveM = departM + newJourneyTime;
		newArrive = (newArriveM / 60)*100 + newArriveM % 60;
		
		//Stampa il risultato
		System.out.println("L'orario di partenza e' " + depart);
		System.out.println("Il vecchio orario di arrivo e' " + arrive);
		System.out.println("Il vecchio tempo di viaggio e' di " + oldJourneyTime + "'");
		System.out.println("Il nuovo tempo di viaggio e' di " + newJourneyTime + "'");
		System.out.println("Il nuovo orario di arrivo e' " + newArrive);
		
	}
}
