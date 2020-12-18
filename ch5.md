# Index
1. Cicli condizionali con while e do-while
2. Istruzione switch
3. Case Study 2: il gioco della morra cinese

# Descrizione

#### 1. Cicli condizionali con while e do-while
I cicli condizionali son quelli che si verificano finche' la condizione e' `true`. Abbiamo visto nel capitolo 4 il `for` adesso vediamo l'istruzione `while`.

Esempio:

```
while(condizione) {
	blocco codice da eseguire
}
```

Esiste un'altra istruzione il `do-while`, con cui prima esegue il blocco di codice e poi verifica la condizione. Qui, a differenza del `while` le parentesi graffe sono obbligatorie.

Esempio:

```
do {
	blocco codice da eseguire
} while(condizione);
```

#### 2. Istruzione switch
L'istruzione `switch` e' una struttura condizionale che permette di eseguire diversi blocchi di istruzioni, a seconda del valore dell'espressione di controllo.

Esempio:

```
switch (condizione) { 
	case 1: 
		istruzione1; 
		break; 
	case 2: 
		istruzione2; 
		break; 
	... 
	default: 
		istruzione_default; 
}
```
Lo `switch` si usa solo in presenza di una condizione che dia un `int` o un `char`. Allo stesso modo `case` dovra' esserlo.
La keyword `default` non e' obbligatoria ma se e' presente, viene eseguita quando la struttura Switch Case non trova nessun caso.

Esempio pratico:

```
public class MyClass {
	public static void main(String[] args) {
		String mese = "02";
		String nome;

		switch (mese) {
			case "01": 
				nome = "Gennaio" ;
		   	break;
			case "02": 
				nome = "Febbraio" ;
		   	break;
			case "03": 
				nome = "Marzo";
		   	break;
			default: 
				nome = "Altri mesi";
		}
		System.out.print.ln("fascia = " + nome);
	}
}
```
#### 3. Case Study 2: il gioco della morra cinese
Creare un programma che ricrei il gioco della morra cinese ( pietra, forbici o carta ). Le regole sono che la pietra batte le forbici ( puo' romperle ), le forbici battono la carta ( possono tagliarle ) e la carta batte la pietra ( puo' avvolgerla ).

```
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
		if (next < 0) {
			next = -next;
		}	
		myChoice = next % 3;
	}

	char getYourChoice(BufferedReader in) throws IOException {
		do {
			Text.prompt("Scegli tra R S P o Q per smettere?");
			yourChoice = Text.readChar(in);
		} while (yourChoice != 'R' & yourChoice != 'S' & yourChoice != 'P' & yourChoice != 'Q');
		if (yourChoice != 'Q') {
			System.out.println("Tu hai scelto " + yourChoice + " e ");
		}
		return yourChoice;
	}

	private static void report(char me, char Iwin, char youWin) {
		System.out.println("Io ho scelto " + me);
		if (yourChoice == Iwin) {
			System.out.println("Ho vinto");
		} else if (yourChoice == youWin) {
			System.out.println("Hai vinto");
		} else {
			System.out.println("Siamo pari");
	 	}
	}	

	public static void main(String[] args) throws IOException {

		BufferedReader bufferReader = Text.open(System.in);

		MorraCinese myGame = new MorraCinese();
		myGame.startGame(bufferReader);
		while (true) {
			myGame.makeMyChoice();
			if (myGame.getYourChoice(bufferReader) == 'Q') {
				break;
			}	
			myGame.winner();
		}
		System.out.println("Grazie per aver giocato");
	}
}
```