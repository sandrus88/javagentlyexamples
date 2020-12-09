1) Tipi primitivi nello specifico.

1.BOOLEAN
Come detto boolean può essere 0 o 1, oppure true or false. Quindi vengono utilizzati in presenza di condizioni o espressioni booleane.
Gli operatori di confronto, per comparare espressioni numeriche sono: 
== ( uguale a ), 
!= ( diverso da ), 
> ( maggiore di ), 
< ( minore di ), 
>= ( maggiore di o uguale a ), 
<= ( minore di o uguale a ).
Altri operatori sono:
& ( congiunzione, si legge e (and) ),
| ( disgiunzione, si legge o (or), ),
^ ( disgiunzione esclusiva (xor), ),
! ( negazione (not) ).
 Esempio: A condizione; B condizione; 
A&B ( se una tra A e B o entrambi sono false, allora darà false. Se A e B sono vere darà true ).
A|B ( se una tra A e B o entrambi sono vere darà true. Se A e B sono false darà false ).
A^B ( se A = false e B = false darà false, se A = true e B = false darà true )
    ( se A = false e B = true darà true,   se A = true e B = true darà false )
se A = true ( !A = false ), se A = false ( !A = true ).

Esistono anche && e ||, operano e valutano nello stesso tempo. 
A&&B ( se A è falsa non verifica se B è vera o falsa perchè sarà a prescindere false ),
A||B ( se A è vera non verifica se B è vera o falsa perchè sarà a prescindere true ).

2.CHAR
il char viene rappresentato tra due apici ' '. Esempio char a = 'a';

3.TIPI NUMERICI
Vedi punto 7) del file index.md. Per incrementare o decrementare una variabile numerica esistono questi assegnamenti:
nomeVariabile++; ( incrementa di 1 )
nomeVariabile--; ( decrementa di 1 )
nomeVariabile += nomeAltraVariable; ( addiziona nomeAltraVariable a nomeVariabile )
nomeVariabile -= nomeAltraVariable; ( sottrae nomeAltraVariable a nomeVariabile )
++nomeVariabile; ( prima incrementa e poi la usa )
Generalmente si possono convertire i tipi numerici se uno "entra" nell'altro. Viceversa si può fare "castando" ( forma standard: (tipo) espressione )
Esempio: 
float kilograms;
double estimate;
kilograms = (float) (estimate * 1.2); 

2) Ripetizione con cicli for 
il for è un blocco di codice che viene ripetuto n-volte.
L'istruzione for elementare è:
for (inizializzazione; controllo; incremento) { // si può inizializzare dentro il ciclo for o al di fuori
    //codice da eseguire
}

Esempio:
for (int i = 0; i < 5; i++ ) {
    System.out.println(i);
}	
oppure 

int i;
for ( i = 0; i < 5; i++ ) {
    System.out.println(i);
}




