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

