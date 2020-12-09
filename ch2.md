1. Idientificatore
2. dichiarazione
3. metodi 
4. invocare un metodo
5. costruttore
6. Variabili, metodi di classe o di instanza. 
7. Tipi di dati primitivi.
8. Assegnamento 
9. Package
10. Localizzazione Locale

##### Identificatore 
tipo della variabile, primitivo oppure oggetto.

##### Dichiarazione
Una variabile si  _dichiara_  nel seguente modo:
 
`tipoVariabile nomeVariabile;`

Esempio: 

```
int a;   
String s;  
MyObject obj;
```
Una variabile si dichiara e si  _inizializza_  nel seguente modo:
 
`tipoVariabile nomeVariabile = valoreVariabile;`

Esempio:

```
int a = 4;   
String s = new String("hello");  
MyObject obj = new MyObject();

```
##### Definizione metodo  

Un metodo e' definito da una serie di istruzioni e di dichiarazioni a cui viene assegnato un nome.	

```
[visibilita] [staticNonStatic] [tipoRitorno] nomeMetodo([tipoInput in1] [tipoInput in2] ){
		// blocco codice da eseguire
	}
```	

private String stampaArray(String[] arr){ codice da eseguire; }
int somma(int a, int b){ codice da eseguire; }
public static void main(String[] args){ codice da eseguire; }

visibilita: public, private, niente (di package)
staticNonStatic: static => metodo di classe, "niente" metodo di oggetto/instanza)
tipoRitorno: void, int, String, MyObject, etc
tipoInput: "niente", int, String, MyObject, etc

Se il [tipoRitorno] è void il metodo non deve ritornare nessun valore. 
Se il il [tipoRitorno] è diverso da void, come ultima istruzione del metodo deve essere essere presente l'istruzione return che ritorna un valore dello stesso tipo [tipoRitorno].
int getCelcius(){
  return 28;
}		

4) invocare un metodo

Se il metodo è del oggetto, creare prima l'oggetto e poi accedere usando obj.nomeMetodo();
Se il metodo è di classe, accedere usando nomeClasse.nomeMetodo();

class MyObject{
	metodo();
	static metodoStatico();
}

class TestObject{
	MyObject obj = new Object();
	obj.metodo();
	MyObject.metodoStatico();
}

Se chiami un metodo e gli passi un oggetto, se il metodo cambia lo stato dell'oggetto, questo si rifletterà anche all'oggetto dichiarato nel chiamante.
Il chiamante in realtà ha passato al metodo non l'oggetto reale ( istanza ) ma solo la referenza.
Esempio:

Chiamata con tipo primitivo:
void metodo1(int valore){ // 5
	valore = 20;
}
main(){
	int x = 5;
	metodo1(x);
	// System.out.println(x); => 5
}

Chiamata con oggetto

void metodo2(MyObj obj2){  //1, 2 
	obj2.x = 5;
	obj2.y = 8;
}
main(){
	MyObject obj = new MyObject(1, 2);
	metodo2(obj);
	// System.out.println(obj); => 5, 8
}
class MyObject{
	int x;
	int y;
}

Se un oggetto viene istanziato dentro una classe, un metodo può cambiare il suo stato senza bisogno di passarlo come parametro. 
class MainClass{
MyObject obj = new MyObject(20, 20);

void metodo3(){
obj.x = 1;
obj.y = 2;
}
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







