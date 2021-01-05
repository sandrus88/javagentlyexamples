# Index
1. Stringhe
2. Tokens
3. Formattazione numeri tramite java.text
4. Date, calendari e orari

# Descrizione

#### 1. Stringhe
Le `stringhe` sono oggetti e non di tipo primitivo. Si possono dichiarare cosi':</br>

```
String s; //ha un valore null finche' non verra' assegnato un valore
String s1 = ""; //e' una stringa vuota
String s2 = "ciao"; //e' una stringa con valore ciao
```
Come tutti gli oggetti di java, la classe `String` possiede diversi costruttori e metodi.</br>
Una volta creato l'oggetto `String`, non puo' essere piu' modificato. Per questo esistono due classi particolari `StringBuffer` e `StringBuilder`.</br>
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
#### 2. Tokens
Data una stringa, i `tokens` sono parti della stringa (compresi anche i caratteri di spazio, tabulazione e fine riga). Per gestirli esiste la classe `StringTokenizer` del package `java.util`.</br> 
Il seguente codice dividera' la stringa, in piu' stringhe tante quante sono le parole che formano la stringa originale.

```
String s4 = "Questo e' l'ombellico del mondo";
		StringTokenizer token = new StringTokenizer(s4);
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
```
che stampera' a video

```
Questo
e'
l'ombellico
del
mondo
```
#### 3. Formattazione numeri tramite java.text
Nel package `java.text` ci sono diverse classi che servono a formattare un determinato dato come `NumberFormat` e la sua sottoclasse `DecimalFormat` per la formattazione di dati numerici. Essendo classi astratte per la creazione si usano metodi di classe.

```
NumberFormat getInstance();
NumberFormat getCurrencyInstance();//per formattare la valuta
NumberFormat getNumberInstance();
NumberFormat getPercentInstance();//per formattare la percentuale

```

Esempio:

```
NumberFormat n = NumberFormat.getInstance();
System.out.println(Math.PI + " " + 10000);
System.out.println(n.format(Math.PI) + " " + n.format(10000));
```
stampera' a video 

```
3.141592653589793 10000
3.141 10,000
```
oppure 

```
NumberFormat c = NumberFormat.getCurrencyInstance();
System.out.println(c.format(10000));
```
stampera' a video

```
10000€ // java formattera' la valuta in base alla localizzazione del computeru
```#### 4. Date, calendari e orarii
Per creare date, calendari e orari si usano le classi `Date` e `Calendar`, la quale possiede valori costanti per giorni, mesi, anni ma anche per ore, minuti e secondi.</br>
La formattazione delle date avviene tramite la classe `DateFormat` del package `java.text` e puo' essere `DEFAULT`, `FULL`, `LONG`, `MEDIUM`, `SHORT`.

```
Date today = new Date();
DateFormat dFull = DateFormat.getDateInstance(DateFormat.FULL);
System.out.println("Oggi e' il giorno " + dFull.format(today.getTime()));
System.out.println();
		
DateFormat dDefault = DateFormat.getDateInstance(DateFormat.DEFAULT);
System.out.println("Oggi e' il giorno " + dDefault.format(today.getTime()));
System.out.println();
		
DateFormat dLong = DateFormat.getDateInstance(DateFormat.LONG);
System.out.println("Oggi e' il giorno " + dLong.format(today.getTime()));
System.out.println();
		
DateFormat dMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
System.out.println("Oggi e' il giorno " + dMedium.format(today.getTime()));
System.out.println();
		
DateFormat dShort = DateFormat.getDateInstance(DateFormat.SHORT);
System.out.println("Oggi e' il giorno " + dShort.format(today.getTime()));
System.out.println();
```
che stampera' a video

```
Oggi e' il giorno martedì 5 gennaio 2021

Oggi e' il giorno 5-gen-2021

Oggi e' il giorno 5 gennaio 2021

Oggi e' il giorno 5-gen-2021

Oggi e' il giorno 05/01/21
``` 
