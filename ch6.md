# Index
1. Array semplici
2. Matrici

# Descrizione

#### 1. Array semplici
Gli `array` sono dei "contenitori" di elementi dello stesso tipo ( primitivi o oggetti ).
Si possono dichiarare in due modi.</br> 
Il primo utilizzando un limite che fornisce il numero di elementi dell'array:

```
tipo nomeArray[] = new tipo[limite];
```
Esempio:

```
int numeri[] = new int[20];
String strs[] = new String[5];
```
Il secondo dichiarando ogni singolo elemento dell'array, e si deduce che la lunghezza dell'array e' data dal numero di elementi inseriti:

```
tipo nomeArray[] = {valori};
```
Esempio:

```
char vocali[] = {'a','e','i','o','u'};
```
Per accedere o dichiarare ogni singolo elemento si utilizza come indice il numero di posizione. Ricorda che si parte sempre da 0, quindi l'elemento della posizione 1 avra' come indice 0, quello della posizione 2 avra' indice 1 e cosi' via.

```
numeri[3] = 4; // alla posizione 4 assegno il numero 4
strs[4] = "ciao"; // alla posizione 5 assegno la stringa "ciao"
vocali[0] = 'a'; // alla posizione 1 e' presente il char 'a'
```
La lunghezza dell'array, una volta impostata, non puo' piu' essere modificata "dinamicamente".</br> 
Nel caso si voglia accedere ad un elemento "oltre" il limite imposto, il programma lancera' un eccezione `ArrayIndexOutOfBoundsException`, che se non gestita, fara' terminare il programma.</br>
Per ricavare la lunghezza di un array si puo' utilizzare la proprieta' `length` cosi':

```
System.out.print(vocali.length); //stampera' 5
```

#### 2. Matrici
Sono degli array a due dimensioni, la prima indica il numero di righe, la seconda il numero di colonne.

```
int matrix[][] = new int[valore righe][valore colonne];
```
Esempio:

```
int matrix[][] = new int[4][5]; // si creera' una matrice di interi con 4 righe e 5 colonne
```
Si potra' accedere ad ogni singola riga oppure ad ogni singolo elemento cosi':

```
matrix [3][]; // accedera' alla quarta riga
matrix [3][1]; // accedera' al secondo elemento della quarta riga
``` 
