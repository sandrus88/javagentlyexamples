# Index
1. Concetto di astrazione
2. Interfacce
3. Ereditarieta'
4. Classi e metodi astratti

# Descrizione

#### 1. Concetto di astrazione
L'`astrazione` e' un meccanismo che schematizza tutto lo scheletro di una classe, il quale dovra' essere implementato nella classe stessa , evitando cosi' ridondamenti. Esistono due costrutti in java le `interfacce` e le `classi astratte`.

#### 2. Interfacce
L'`interfaccia` e' una classe che serve per specificare un insieme di metodi senza implementarli. E' indirettamente `public`. Si dichiara tramite la keyword `interface`.

```
interface nome_interfaccia {
	metodi();
}	
```
la quale andra' implementata dalla classe tramite la keyword `implements` 

```
class nome_classe implements nome_interfaccia {
	metodi();
	altre specifiche;
}
```
Nell'interfaccia non si possono dichiarare variabili ma solo metodi. Pero' si possono dichiarare delle costanti `final`.
Una classe puo' implementare piu' interfacce.
	
#### 3. Ereditarieta'
Esprime il concetto per cui data una classe "padre" e una o piu' classi "figlie", le figlie ereditano tutto cio' che e' presente nel padre. L'`ereditarieta'` e' transitiva, e si esprime con la keyword `extends`.

Date le classi 

```
class A;
class B;
class C;

class B extends A {

}

class C extends B {

}

```

allora 

```
class C extends A {

}
```
Le classi figlie possono modificare il tipo della variabili e sovrascrivere i metodi (`overriding`) ereditati.

```
class A {
	int a;
	void example() {
	System.out.println("A e' il padre");
	}
}

class B extends A {
	double a;
	void example() {
	System.out.println("B e' il figlio di A");
	}
}
```
Una figlia, per inizializzare delle variabili uguali a quelle del padre, puo' invocare il costruttore del padre, se presente, tramite `super()`.</br>
Allo stesso modo puo' accedere alla variabile dichiarata nel padre tramite `super.nomeVariabilePadre`.

```
class Erbivori {
	
	String nome; 
	int erbaMangiata;
	String doveAbito;
	
	Erbivori(String n, int g) {
	nome = n;
	erbaMangiata = g;
	}
}

class Elefanti etxends Erbivori {
	
	int zanne;	
	Elefanti(String n, int w, int z){
	super(n, w)
	zanne = z;
	super.doveAbito;
	}
}
````

#### 4. Classi e metodi astratti
Una classe astratta e' una classe che contiene almeno un metodo astratto. Si dichiara con la keyword `abstract`. Non puo' essere istanziata. Per istanziarla bisogna che tutte le sottoclassi implementino tali metodi.
Un metodo astratto e' un metodo di cui si specifica solo il nome e gli eventuali parametri.

```
public abstract class AbstractClass {
	String nome;
	public abstract String lavora();
	public void astraction() {

	}
	
	public static void main(String[] args) {
		AbstractClass abClass = new ConcreteClass();
	}
}

class ConcreteClass extends AbstractClass {
	public String lavora() {
		// codice da eseguire
		return null;
	}
}
	
