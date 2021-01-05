# Index
1. Stringhe
2. Analizzatori lessicali
3. Formattazione numeri tramite java.text
4. Date, calendari e orari

# Descrizione

#### 1. Stringhe
Le `stringhe` sono oggetti e non variabili. Si possono dichiarare cosi':</br>

```
String s; //ha un valore null finche' non verra' assegnato un valore
String s1 = ""; //e' una stringa vuota
String s2 = "ciao"; //e' una stringa con valore ciao
```
Come tutti gli oggetti di java, la classe `String` possiede diversi costruttori e metodi.</br>
Una volta creato l'oggetto `String`, non puo' piu' essere modificato dinamicamente. Per questo esistono due classi particolari `StringBuffer` e `StringBuilder`.</br>
Tra tutti i metodi quelli piu' usati sono quelli di comparazione `equals()`, che restituisce un booleano, e `compareTo()`, che restituisce un intero.

```
String s = "ciao";
String s1 = "hello";
String s2 = "ciao";
String s3 = "addio";
System.out.println(s.equals(s1));//stampera' false perche' hanno una valore diverso
System.out.println(s.equals(s2));//stampera' true perche' hanno lo stesso valore 
System.out.println(s.compareTo(s1));//stampera' un numero negativo perche' alfabeticamente il valore di s viene prima del valore di s1
System.out.println(s.compareTo(s2));//stampera' 0 perche' hanno lo stesso valore
System.out.println(s.compareTo(s3));//stampera' un numero positivo perche' alfabeticamente il valore di s viene dopo il valore di s3

```
#### 2. Analizzatori lessicali

#### 3. Formattazione numeri tramite java.text
#### 4. Date, calendari e orari
