1) Idientificatore
2) dichiarazione
3) metodi 
4) invocare un metodo
5) costruttore
6) Variabili, metodi di classe o di instanza. 
7) Tipi di dati primitivi.
8) Assegnamento 
9) Package
10) Localizzazione Locale



1) Idientificatore: tipo della variabile, primitivo oppure oggetto.
2) Dichiarazione: 
tipo nomeVariabile = valoreVariabile;   (tipo nomeVariabile;)
int a = 4;    (int a;)
String s = new String("hello");   (String s;)

3) Definizione metodo:   
	[visibilita] [staticNonStatic] [tipoRitorno] nomeMetodo([tipoInput in1] [tipoInput in2] ){
		// blocco codice da eseguire
	}
	private String stampaArray(String[] arr){ codice da eseguire; }
	int somma(int a, int b){ codice da eseguire; }
	public static void main(String[] args){ codice da eseguire; }

visibilita: public, private, niente (di package)
staticNonStatic: static => metodo di classe, "niente" metodo di oggetto/instanza)
tipoRitorno: void, int, String, MyObject, etc
tipoInput: "niente", int, String, MyObject, etc

4) invocare un metodo

Se il metodo è del oggetto, creare prima l'oggetto e poi accedere usando obj.nomeMetodo();
Se il metodo è di classe, accedere usando nomeClasse.nomeMetodo();

class MyObject{
	metodo();
	static metodoStaitico();
}

class TestObject{
	MyObject obj = new Object();
	obj.metodo();
	MyObject.metodoStaitico();
}

5) costruttore
* costruttore:  metodo "speciale" che non ha valore di ritorno e prende il nome della classe.
Esempio, una classe con 3 costruttori. 
class MyObject{
	MyObject();
	MyObject(int a);
	MyObject(String s1, String s2);
}

*
Quando crei un oggetto, di una classe per cui non è stata definita nessuno costruttore, java automaticamente chima il costrutture id default.
class ObjectSenzaCostrutore{
	// no constructor
}

ObjectSenzaCostrutore obj = new ObjectSenzaCostrutore(); // java chiama il costruttore di default.

* visibilita del cotruttoere puo essere private, public o di package. 
Non puo essere static; non puo essere final


6) Variabili, metodi di classe o di instanza. 

class MyObject{
	int a1;   //variabile di instanza
	int a2;   //variabile di instanza
	static String x1;    //variabile di classe
	static final String x2;     //variabile di classe, costante.

	metodo1(){}  // metodo di instanza
	static metodo2(){}  // metodo di classe 
	public static void main(String[] args){}  // metodo di classe 
}

final: ogni variavbile dichiarata final, non si puo piu cambiare, quidi è una costante; 
ogni metodo dichiarato final, non si puo piu cambiare, ovvero non si puo riscrivere nei sottoclassi.


7) Tipi di dati primitivi.

1 bit: unita piu piccola del compilatore (0 oppure 1; true oppure false)

boolen b; // 1 bit; true o false
byte b; //8 bit, 2 alla potenza di 8 = 256 numeri. Considerando i negativi possiamo esprimere il range [-128, 127]
short sh; // 16 bit
char c; // 16 bit
int i; // 32 bit;
float f; // 32 bit;
double d; // 64 bit;
long l; // 64 bit;


8) assegnamento

9) package: un package è....

Esepmio:
package com.sg.mypackage;
class MyObject{

}



package anotherpackage;

import com.sg.mypackage.*;
class MyObject{

}




Esercizio:

1)  creare un repository su git hub dove mettere gli esercizi del Java Gently.
progetto nome: javagentlyexamples
Packages
com.sg.javagentlye.ch1
com.sg.javagentlye.ch2
...

2) mettere questo file sul index.md (home del progetto)







