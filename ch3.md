1. Tipi primitivi nello specifico.
2. Ripetizione con cicli for.
3. Passaggio dei parametri.
4. Class Study 1: Talloncini del prezzo.

#### 1. Tipi primitivi nello specifico
**BOOLEAN**<br/>
Come detto boolean puo' valere 0 o 1, oppure true or false. Quindi vengono utilizzati in presenza di condizioni o espressioni booleane.
Gli operatori di confronto, per comparare espressioni numeriche sono: 

`==` ( uguale a )<br/> 
`!=` ( diverso da )<br/>
`>` ( maggiore di )<br/>
`<` ( minore di )<br/> 
`>=` ( maggiore di o uguale a )<br/> 
`<=` ( minore di o uguale a )

Altri operatori sono:<br/>
`&` ( congiunzione, si legge e (and) )<br/>
`|` ( disgiunzione, si legge o (or) )<br/>
`^` ( disgiunzione esclusiva (xor) )<br/>
`!` ( negazione (not) )
 
Esempio: 

A condizione; B condizione; 

`A&B` ( se una tra A e B o entrambi sono false, allora dara'  false. Se A e B sono vere dara'  true ).
`A|B` ( se una tra A e B o entrambi sono vere dara'  true. Se A e B sono false dara' false )<br/>
`A^B` ( se A = false e B = false dara'  false, se A = true e B = false dara' true )<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ( se A = false e B = true dara'  true,   se A = true e B = true dara'  false )<br/>
se A = true ( `!A` = false ), se A = false ( `!A` = true ).

Esistono anche `&&` e `||`, operano e valutano nello stesso tempo.<br/>
`A&&B` ( se A e' falsa non verifica se B e' vera o falsa perche' sara' a prescindere false )</br>
`A||B` ( se A e' vera non verifica se B e' vera o falsa perche' sara'  a prescindere true ).

**CHAR**</br>
Il char viene rappresentato tra due apici ' '. Esempio char a = 'a';

**TIPI NUMERICI**<br/>
Vedi punto 7) del file [ch2.md](ch2.md).<br/>
Per incrementare o decrementare una variabile numerica esistono questi assegnamenti:
`nomeVariabile++;` ( incrementa di 1 )<br/>
`nomeVariabile--;` ( decrementa di 1 )<br/>
`nomeVariabile += nomeAltraVariable;` ( addiziona nomeAltraVariable a nomeVariabile )<br/>
`nomeVariabile -= nomeAltraVariable;` ( sottrae nomeAltraVariable a nomeVariabile )<br/>
`++nomeVariabile;` ( prima incrementa e poi la usa )<br/>

Generalmente si possono convertire i tipi numerici se uno "entra" nell'altro. Viceversa si puo' fare "castando" ( forma standard: `(tipo) espressione` )

Esempio: 

```
class MyClass {
	float kilograms;
	double estimate;
	kilograms=(float)(estimate*1.2);
}
```

#### 2. Ripetizione con cicli for 
Il for e' un blocco di codice che viene ripetuto n-volte.
L'istruzione for elementare e':

```
for (inizializzazione; controllo; incremento) { // si puo' inizializzare dentro il ciclo for o al di fuori
    //codice da eseguire
}
```
Esempio:

```
for (int i = 0; i < 5; i++ ) {
    System.out.println(i);
}	
```
oppure 

```
int i;
for ( i = 0; i < 5; i++ ) {
    System.out.println(i);
}
```

#### 3. Passaggio dei parametri


#### 4. Class Study 1: Talloncini del prezzo
**Risolvi il seguente problema:**</br>
La High School di Savanna sta organizzando una festa e ha fissato il prezzo dei cibi e delle bevande in uno, due, cinque o otto graz. Si vorrebbero disegnare con il computer i relativi talloncini del prezzo. I talloncini G5 e G8 dovrebbero essere più grandi e di maggiore impatto dei talloncini G1 e G2.

```
/*
 * Crea e stampa un'etichetta per un talloncino di un dato prezzo, stile, valore.
 * 
 * Illustra la dichiarazione di una classe
 */

class Tickets {
	private char hori, verti, price;
	private int depth, width;

	Tickets(char h, char v, int d, int w) {
		hori = h;
		verti = v;
		depth = d;
		width = w;
	}

	void varyBox(char price) {
		aLine(hori, hori, hori);
		for (int d = 2; d < depth; d++)
			aLine(verti, price, verti);
		aLine(hori, hori, hori);
		System.out.println();
	}

	private void aLine(char left, char centre, char right) {
		System.out.print(left);
		for (int w = 2; w < width; w++)
			System.out.print(centre);
		System.out.println(right);
	}

	/*
	 * Il programma stampa quattro talloncini di diverso aspetto
	 */
	public static void main(String[] args) {
		System.out.println("Prezzi suggeriti per la festa");
		Tickets small = new Tickets('-', '|', 5, 11);
		small.varyBox('2');
		small.varyBox('1');

		Tickets bigger = new Tickets('=', '=', 7, 15);
		bigger.varyBox('5');
		bigger.varyBox('8');
	}
}
```
che stamperà vedi [Tickets.java](sandrus88/javagentlyexamples\src\com\sg\javagently\ch3\Tickets.java).