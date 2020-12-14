# Index
1. Input interattivo
2. File di input e di output
3. Selezione con if-else
4. Eccezioni
5. Creazione e uso dei package

# Descrizione

#### 1. Input interattivo
Per ricevere valori dal mondo esterno, usando la tastiera, si usa il seguente codice:

```
import java.io.*;
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in);
```
Il seguente metodo legge un'intera riga dalla tastiera fin quando non viene premuto il tasto Invio (carattere `new line`):

```
String line = bufferedReader.readLine();
System.out.println("Ho inserito: " + line);
```

#### 2. File di input e di output
Se la mole di dati, da gestire in input, è grande, si preferisce immagazzinarli dentro un file.
Per dare in input un file si usa il seguente codice:

```
import java.io.*;
BufferedReader bufferedReader = new BufferedReader(new FileReader("nomeFile");
```
Se invece si vuole inviare in output ad un file, dei dati etc. Si usa il seguente codice:

```
import java.io.*;
PrintWriter printWriter = new PrintWriter(new FileWriter("nomeFile");
```
Per i file di output è obbligatorio chiuderli prima della fine del programma per non perdere i dati. Si usa il metodo `fout.close();`

#### 3. Selezione con if-else
Con l'istruzione `if` si pone la condizione e può essere o true o false, se e' true, viene eseguita l'istruzione seguente; se invece e' false, salta direttamente all'altra istruzione preceduta da `else`. Quest'ultima e' opzionale, cioe' non deve essere per forza presente.

```
if (condizione)
	istruzione;
else istruzione2;
```

Esempio:

```
if (number>=0)
System.out.println("Postitivo")
else System.out.println("Postitivo");
```
Avvolte possono esserci più condizioni e dunque si utilizzeranno piu' sequenze di `else if`.

Esempio:

```
int marks;
char grade;
if 		(marks >= 80)
	grade = 'A';
else if	(marks >= 70)
	grade = 'B';
else if	(marks >= 60)
	grade = 'C';
else if	(marks >= 50)
	grade = 'D';
else 
	grade = 'E';
```
#### 4. Eccezioni
#### 5. Creazione e uso dei package