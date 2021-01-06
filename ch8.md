# Index
1. Oggetti e modificatori
2. Proprieta' degli oggetti
3. Liste concatenate
4. Classi interne

# Descrizione

#### 1. Oggetti e modificatori
Un oggetto si puo' dichiarare come segue:

```
[modificatore] [nome_classe] nomeOggetto = new [nome_classe]();//crea spazio in memoria
[modificatore] [nome_classe] nomeOggetto = new [nome_classe]([parametri]);//crea spazio in memoria e aggiunge dei parametri
[modificatore] [nome_classe] nomeOggetto;//non crea spazio in memoria ma per poterlo utilizzare bisogna creare l'oggetto 

```
I modificatori, non tutti, possono essere attribuiti sia a classi che ai membri di una classe e sono:

`nessuno (chiamato di package)`, sia la classe che i membri sono accessibili dal package a cui appartengono;</br>
`public`, e' accessibile ovunque;</br>
`private`, puo' essere riferito solo ai membri di una classe, e sono accessbili solo dalla classe a cui appartengono;</br>
`protected`, puo' essere riferito solo ai membri di una classe, e sono accessibili solo dal package e dalle sottoclassi;</br>
`abstract`, riferito alla classe significa che non puo' essere istanziata, riferito ai membri significa che devono essere implementati in una sottoclasse;</br>
`final`, riferito alla classe significa che non puo' avere sottoclassi, riferito ai membri significa che non si possono sovrascrivere (`override`);</br>
`static`, puo' essere riferito a classi di primo livello e non alle classi interne (vedi punto 5), riferito ai membri significa che sono accessibili mediante il nome della classe.

#### 2. Proprieta' degli oggetti
Un oggetto, una volta creato, occupa un determinato spazio in memoria. Esso, a differenza delle variabili create che sono memorizzate con il loro valore effettivo, rappresenta solo un riferimento (`reference`) di tutto cio' che e' incapsulato nella classe, di cui l'oggetto e' istanza.</br>
A riguardo dati due oggetti:

```
class MyObject{

	public static void main(String[] args) {
	
	MyObject obj = new MyObject();
	MyObject object = new MyObject();
	}
}	
```

per comparare i valori dell'oggetto istanziato si usa il metodo `equals()`, metodo implementato dalla superclasse `Object`, perche' utilizzando `==`, confrontera' i riferimenti. Se puntano alla stessa cella di mememoria allora hanno lo stesso riferimento.

```
obj == object;//confronta il riferimento
obj.equals(object);//confronta il valore
```
Allo stesso modo, se si vuole assegnare il valore di un oggetto ad un altro oggetto, si usera' il metodo `clone()`, implementando l'interfaccia `Clonable`, perche' utilizzando `=`, copiera' solo i riferimenti.

```
obj = object;//assegna il riferimento di object a obj, ovvero puntano alla stessa parte di memoria 
obj.clone(object);//assegna il valore di object a obj
```
#### 3. Liste concatenate
Le liste concatenate sono dei particolari array ma che possono essere cambiate dinamicamente (rimuovere, aggiungere, spostare etc). Ogni elemento all'interno non occupa un posto preciso ma sono collegati tra di loro tramite `link`, che sono dei riferimenti.</br>
Gli oggetti che formano una lista concatenata prendono il nome di `nodi`. Ogni nodo possiede due link, il primo un riferimento `element` a un elemento, il secondo un riferimento `next` che accede al successivo nodo.
Ecco un modo di implementazione di una classe Nodo.

```
public class Node<E> {
	private E element;
	private Node<E> next;

	public Node(E e, Node<E> n){
	element = e;
	next = n;
	}
	
	public Node(){
	this(null,null);
	}

	public E getElement(){
	return element;
	}

	public Node<E> getNext(){
	return next;
	}
	
	public void setElement(E newElem) {
	element = newElem;
	}
	
	public void setNext(Node<E> newNext){
	next = newNext;
	}
}
```
#### 4. Classi interne
Esistono 3 tipi di classi interne:

`Classi annidate` o `InnerClass`, sono delle normali classi definite all'interno di un'altra classe;

```
class MyClass  {
	// codice
	class Inner {
		// codice
	} 
```
`Classi locali`, sono classi definite all'interno di un blocco specifico (metodo etc);

```
class MyClass  {
	public void method() {
	// codice
		class LocalClass {
			// codice
		}
	}	
}		
```
`Classi anonime`, sono delle particolari classi locali che vengono definite ed istanziate nello stesso istante tramite la keyword `new`;

```
class MyClass  {
	public void metodo(new MyNewClass) {
	// codice
	}	
}		
```
