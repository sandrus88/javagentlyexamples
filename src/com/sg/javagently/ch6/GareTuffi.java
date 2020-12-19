package com.sg.javagently.ch6;

import java.io.BufferedReader;
import java.io.IOException;

import com.sg.javagently.ch4.Text;

class GareTuffi {

	static final int noofDives = 3;

	public static void main(String[] args) throws IOException {

		System.out.println("Calcolo del punteggio dei tuffi\n" + "=====================================\n");

		BufferedReader bufferReader = Text.open(System.in);

		double result, total = 0;
		Giudice dive = new Giudice(8);

		for (int i = 0; i < noofDives; i++) {
			System.out.println("Tuffo n. " + (i + 1));
			dive.getScores(bufferReader);
			result = (double) (dive.assessScores() - dive.minScore - dive.maxScore) / (double) (dive.noofJugdes);
			total += result;
			System.out.println("I punteggi " + dive.minScore + " del giudice " + dive.minJudge + " e " + dive.maxScore
					+ " del giudice " + dive.maxJudge + " sono esclusi.");
			System.out.println("Il risultato e': " + Text.writeDouble(result, 5, 3));
		}
		System.out.println("La media e': " + Text.writeDouble(total / noofDives, 5, 3));

	}

}
