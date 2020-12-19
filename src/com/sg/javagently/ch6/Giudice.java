package com.sg.javagently.ch6;

import java.io.BufferedReader;
import java.io.IOException;

import com.sg.javagently.ch4.Text;

class Giudice {

	static final int noofJugdes = 8;
	int minJudge, maxJudge, minScore, maxScore;

	Giudice(int n) {
		n = noofJugdes;
		score = new int[noofJugdes];
	}

	void getScores(BufferedReader in) throws IOException {
		System.out.println("Inserisci " + noofJugdes + " punteggi in ordine");
		for (int i = 0; i < noofJugdes; i++) {
			score[i] = Text.readInt(in);
		}
	}

	int assessScores() {
		minScore = 10;
		maxScore = 0;
		int sum = 0;
		for (int i = 0; i < noofJugdes; i++) {
			sum += score[i];
			if (score[i] <= minScore) {
				minScore = score[i];
				minJudge = i;
			}
			if (score[i] > maxScore) {
				maxScore = score[i];
				maxJudge = i;
			}
		}
		minJudge++;
		maxJudge++;
		return sum;
	}

	private int score[];
}
