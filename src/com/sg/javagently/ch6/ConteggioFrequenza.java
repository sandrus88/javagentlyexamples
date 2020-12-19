package com.sg.javagently.ch6;

import java.io.IOException;
import java.util.Random;

import com.sg.javagently.ch4.Text;

class ConteggioFrequenza {

	static final int maxscore = 20;
	static final int n = 100;

	public static void main(String[] args) throws IOException {

		int scoreFreqs[] = new int[maxscore];
		int score;
		Random TestScore = new Random();

		for (int i = 0; i < n; i++) {
			score = Math.abs(TestScore.nextInt() % 20);
			scoreFreqs[score]++;
		}

		System.out.println("Tabella delle frequenze di punteggio\n" + "=====================================\n");

		for (int i = 0; i < maxscore; i++) {
			Text.writeInt(i, 6);
			Text.writeInt(scoreFreqs[i], 6);
			System.out.println();

		}
	}
}