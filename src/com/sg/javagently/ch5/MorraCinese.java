package com.sg.javagently.ch5;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

import com.sg.javagently.ch4.Text;

public class MorraCinese {

	private static int myChoice;
	private static char yourChoice;
	private static Random dice;

	void startGame(BufferedReader in) throws IOException {
		System.out.println("Giochiamo alla morra cinese");
		System.out.println("Per dimostrare che non baro, dammi tu il numero da cui iniziare.");
		dice = new Random(Text.readInt(in));
	}

	void winner() {
		switch (myChoice) {
		case 0:
			report('R', 'S', 'P');
			break;
		case 1:
			report('S', 'P', 'R');
			break;
		case 2:
			report('P', 'R', 'S');
			break;
		}
	}

	void makeMyChoice() {
		int next = dice.nextInt();
		if (next < 0)
			next = -next;
		myChoice = next % 3;
	}

	char getYourChoice(BufferedReader in) throws IOException {
		do {
			Text.prompt("Scegli tra R S P o Q per smettere?");
			yourChoice = Text.readChar(in);
		} while (yourChoice != 'R' & yourChoice != 'S' & yourChoice != 'P' & yourChoice != 'Q');
		if (yourChoice != 'Q')
			System.out.println("Tu hai scelto " + yourChoice + " e ");
		return yourChoice;
	}

	private static void report(char me, char Iwin, char youWin) {
		System.out.println("Io ho scelto " + me);
		if (yourChoice == Iwin)
			System.out.println("Ho vinto");
		else if (yourChoice == youWin)
			System.out.println("Hai vinto");
		else
			System.out.println("Siamo pari");
	}

	public static void main(String[] args) throws IOException {

		BufferedReader bufferReader = Text.open(System.in);

		MorraCinese myGame = new MorraCinese();
		myGame.startGame(bufferReader);
		while (true) {
			myGame.makeMyChoice();
			if (myGame.getYourChoice(bufferReader) == 'Q')
				break;
			myGame.winner();
		}
		System.out.println("Grazie per aver giocato");
	}
}