# INDEX
1. Identificatore
2. Dichiarazione
3. Metodo 
4. Invocare un metodo
5. Costruttore
6. Variabili, metodi di classe o di instanza. 
7. Tipi di dati primitivi.
8. Assegnamento 
9. Package

#### 1. Identificatore 
Tipo della variabile, primitivo oppure oggetto.

#### 2. Dichiarazione
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
#### 3. Metodo  
Un metodo e' definito da una serie di istruzioni e di dichiarazioni a cui viene assegnato un nome.    

```
[visibilita'] [staticNonStatic] [tipoRitorno] nomeMetodo([tipoInput in1] [tipoInput in2] ){
    // blocco codice da eseguire
}
```
Esempio:

```
private String stampaArray(String[] arr){ codice da eseguire; }
int somma(int a, int b){ codice da eseguire; }
public static void main(String[] args){ codice da eseguire; }
```
`[visibilita']` : public, private, niente (di package)<br/>
`[staticNonStatic]` : static => metodo di classe, "niente"=> metodo di oggetto/instanza<br/>
`[tipoRitorno]` : void, int, String, MyObject, etc<br/>
`[tipoInput]` : "niente", int, String, MyObject, etc<br/>

Se il `[tipoRitorno]` e' `void` il metodo non deve ritornare nessun valore.<br/> 
Se il il `[tipoRitorno]` e' diverso da `void`, come ultima istruzione del metodo deve essere presente l'istruzione `return` che ritorna un valore dello stesso tipo `[tipoRitorno]`.

Esempio:

```
int getCelcius(){
    return 28;
}        
```
#### 4. Invocare un metodo
Se il metodo e' dell' oggetto, creare prima l'oggetto e poi accedere usando `obj.nomeMetodo();`
Se il metodo e' di classe, accedere usando `nomeClasse.nomeMetodo();`

Esempio:

```
class MyObject {
    metodo();
    static metodoStatico();
}

class TestObject{
    MyObject obj = new Object();
    
    obj.metodo();
    MyObject.metodoStatico();
}
```
Se chiami un metodo e gli passi un oggetto, se il metodo cambia lo stato dell'oggetto, questo si riflettera'  anche all'oggetto dichiarato nel chiamante.
Il chiamante in realta'  ha passato al metodo non l'oggetto reale ( _istanza_ ) ma solo la referenza.

Esempio chiamata con tipo primitivo:

```
void metodo1(int valore) { // 5
    valore = 20;
}

main(){
    int x = 5;
    metodo1(x);
    // System.out.println(x); => 5
}
```
Esempio chiamata con oggetto:

```
void metodo2(MyObj obj2) { // 1, 2
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
```
Se un oggetto viene istanziato dentro una classe, un metodo puo' cambiare il suo stato senza bisogno di passarlo come parametro. 

Esempio:

```
class MainClass {
    MyObject obj = new MyObject(20, 20);
    
    void metodo3() {
        obj.x = 1;
        obj.y = 2;
    }
}

```

#### 5. Costruttore
Il costruttore e' un  metodo "speciale" che non ha valore di ritorno e prende il nome della classe.

Esempio di una classe con 3 costruttori: 

```
class MyObject {
    MyObject();

    MyObject(int a);

    MyObject(String s1, String s2);
}
```

Quando crei un oggetto di una classe per cui non e' stato definito nessun costruttore, java automaticamente chiama il costrutture di default.

Esempio:

```
class ObjectSenzaCostrutore{
    // no constructor
}

ObjectSenzaCostrutore obj = new ObjectSenzaCostrutore(); // java chiama il costruttore di default.
```
La visibilita' del costruttore puo' essere private, public o "niente" di package.<br/>
Non puo' essere  _static_ ; non puo' essere  _final_ .

#### 6. Variabili, metodi di classe o di instanza
Le variabili e metodi di classe sono quelli preceduti da  _static_ . 

Esempio:

``` 
class MyObject {
    int a1; // variabile di istanza
    int a2; // variabile di istanza
    static String x1; // variabile di classe
    static final String x2; // variabile di classe, costante.

    metodo1(){} // metodo di instanza

    static metodo2(){} // metodo di classe

    public static void main(String[] args) {
    } // metodo di classe
}
```
Ogni variabile dichiarata  _final_ , non si puo' piu' cambiare, quindi e' una  _costante_ ;<br/> 
Ogni metodo dichiarato  _final_ , non si puo' piu' cambiare, ovvero non si puo' riscrivere nelle sottoclassi.

#### 7. Tipi di dati primitivi
Sono i dati semplici che non possono essere decomposti. Si misurano in  _bit_ che e' l' unita' piu' piccola del compilatore ( puo' valere 0 oppure 1; true oppure false).

- `boolean b;` vale 1 bit (true o false)<br/>
- `byte b;` vale 8 bit, 2^8 = 256 [-128, 127]<br/>
- `short sh;` vale 16 bit, 2^16 = 65536 [-32768, 32767] (numeri interi)<br/>
- `char c;` vale 16 bit, 2^16 = 65536 [-32768, 32767] (singolo carattere di una Stringa)<br/>
- `int i;` vale 32 bit, 2^32 = 4_294_967_296 [-2_147_483_648, 2_147_483_647] (numeri interi)<br/>
- `float f;` vale 32 bit, 2^32 = 4_294_967_296 [-2_147_483_648, 2_147_483_647] (numeri reali)<br/>
- `double d;` vale 64 bit, 2^64 = 18_446_744_073_709_551_616 [-9_223_372_036_854_775_808, 9_223_372_036_854_775_808] (numeri reali)<br/>
- `long l;` vale 64 bit, 2^64 = 18_446_744_073_709_551_616 [-9_223_372_036_854_775_808, 9_223_372_036_854_775_808] (numeri interi)

#### 8. Assegnamento
L'assegnamento avviene tramite il simbolo =, e viene utilizzato per dare un valore a una variabile o a un oggetto.

Esempio:

```
class MyObject {
    int x = 5;
    double y = 2.3;
    char x = 'x';
    String s = "Ciao";
    boolean b = true;
}
```

#### 9. Package
Un package e' una collezione di classi logicamente connesse, che possono interagire tra di loro. Per accedere ad un package da altro package si utilizza la seguente formula<br/>
`import [nomePackage].*`

Esempio:

```
package com.sg.mypackage;
class MyObject{

}
```
Esempio altro package:

```
package anotherpackage;
import com.sg.mypackage.*;
class MyObject{

}
```