# Index
1. While e do-while
2. Switch

# Descrizione

#### 1. While e do-while
I cicli condizionali son quelli che si verificano finche' la condizione e' `true`.</br>
L'istruzione `while`, verifica la condizione e poi esegue il blocco di codice. Esempio:

```
while(condizione) {
	blocco codice da eseguire
}
```

L'istruzione `do-while` prima esegue il blocco di codice e poi verifica la condizione. Esempio:

```
do {
	blocco codice da eseguire
} while(condizione);
```

#### 2. Switch
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
Lo `switch` si usa solo in presenza di una condizione che dia `int`, `char`, `String` o `Enum`. `case` definisce il caso che si vuole gestire.</br>
La keyword `default` non e' obbligatoria ma di solito viene considerato come l'ultimo caso da gestire.

Esempio pratico:

```
String mese = "02";
String nome;

switch (mese) {
	case "01": 
		nome = "Gennaio";
		break;
	case "02": 
		nome = "Febbraio";
		break;
	case "03": 
		nome = "Marzo";
		break;
	default: 
		nome = "Altri mesi";
}
System.out.print.ln("fascia = " + nome);

```
- Il `break` come ultima istruzione del blocco `case` permette al blocco di esecuzione di uscire dallo `switch`. La mancanza della keyword `break` in uno dei `case`, fa si che l'esecuzione prosegua in tutti i casi sottostanti fino al case di `default`.
- Se dovessimo rappresentare la stessa logica dello switch con if-else, sarebbe la seguente:

```
int mese = 3;
String nome;
		
if (mese == 1) {
	nome = "Gennaio";
} else if (mese == 2) {
	nome = "Febbraio";
} else if (mese == 3) {
	nome = "Marzo";
} else {
	nome = "Altri mesi";
}
```
	