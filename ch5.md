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
}	while(condizione);
```

#### 2. Istruzione switch
L'istruzione `switch` e' una struttura condizionale che permette di eseguire diversi blocchi di istruzioni, a seconda del valore dell'espressione di controllo.

Esempio:

```
switch (condizione) { 
	case 1: istruzione1; 
				break; 
	case 2: istruzione2; 
				break; 
	... 
	default: istruzione_default; 
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
	case "01":	nome = "Gennaio" ;
				break;
	case "02":	nome = "Febbraio" ;
				break;
	case "03":	nome = "Marzo";
				break;
	default: 	nome = "Altri mesi";
	}
	System.out.print.ln("fascia = " + nome);
	}
}
```
#### 3. Case Study 2: il gioco della morra cinese