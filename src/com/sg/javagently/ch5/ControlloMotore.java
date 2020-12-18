package com.sg.javagently.ch5;

import java.io.BufferedReader;
import java.io.IOException;
import com.sg.javagently.ch4.Text;

class ControlloMotore {

	static void react(int dotcount) {
		for (int dot = 0; dot < dotcount; dot++)
			System.out.print(".");
		System.out.println();
	}

	static void instructions() {
		System.out.println("Inserire i numeri da verificare");
		System.out.println("Il motore funzionera' fino a che sono letti valori uguali o decrescenti.");
		System.out
				.println("Si ferma normalmente se legge un valore crescente e in modo anomalo per una valore negativo");
	}

	public static void main(String[] args) throws IOException {

		BufferedReader bufferReader = Text.open(System.in);
		System.out.println("***** Controllo di un motore *****");
		Text.prompt("Inserire il primo valore");
		int n = Text.readInt(bufferReader);
		if (n <= 0)
			System.out.println("Il motore non puo' funzionare");
		else {
			instructions();
			int previous;
			do {
				react(n);
				previous = n;
				n = Text.readInt(bufferReader);
			} while (n >= 0 & n <= previous);

			if (n < 0)
				System.out.println("Spegnimento anomalo");
			else
				System.out.println("Spegnimento regolare");

		}
	}
}
