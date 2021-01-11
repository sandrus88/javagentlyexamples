package com.sg.javagently.my;

/**
 * Creare una lista di persone rappresentsta nella classe PersonList. Una
 * persona viene identificato dal Nome e Cognome. Usare una classe ausiliaria
 * Node per rapperesentare la lista. La classe deve: 1) Aggiungere elemento in
 * fondo alla lista 2) Aggiungere elemento in cima alla lista 3) Stama elementi
 * della lista 4) Ricerca un elemento nella lista 5) rimuovere un elemento dalla
 * lista
 * 
 * 
 * PersonList list = new PersonList();
 * list.addElementAsLast(newvPerson("Andrea")); //aggiunge coem ultimo elemento
 * list.addElementOnTop(newvPerson("Giulia")); //aggiunge come primo elemento
 * list.findElement(newvPerson("sandro")); // ritorno l'oggetto trovato, oppure
 * suo indice. list.removeElement(new Person("sandro")); //rimuove elemnto dalal
 * lista list.printList();
 * 
 * 
 * PersonList { Node startingElement;
 * 
 * // metodi della lista }
 * 
 * private class Node { private Person element; private Node next; }
 * 
 * Person{
 * 
 * }
 */

public class PersonList {

	Node firstElement;

	PersonList(Node node) {
		this.firstElement = node;
	}

	public void addLast(Person element) {
		Node newNode = new Node(element, null);// nuovo nodo da inserire alla lista

		if (firstElement.next == null) { // se la lista contiene un solo elemento
			firstElement.next = newNode;
			return;
		}

		Node actual = firstElement;// crea un puntatore che punta al primo elemento della lista
		while (actual.next != null) {
			actual = actual.next; // Sposta il puntatore al prossimo elemento
			if (actual.next == null) { // se actual e' l'ultimo elemento della lista
				actual.next = newNode; // fa puntare actual.next al nuovo nodo creato ( nuovo nodo piazzato come ultimo
										// elemento )
				break;
			}
		}
	}

	public void addFirst(Person element) {
//		Node newNode = new Node(element, null);// nuovo nodo da inserire alla lista
//		newNode.next = list;
//		list = newNode;
		Node newNode = new Node(element, firstElement);
		firstElement = newNode;
	}

	public Person findElement(String nomePersona) {
		Node actual = firstElement;
		while (actual != null) {

			if ((actual.element.nome.equals(nomePersona)) || (actual.element.cognome.equals(nomePersona))) {
				return actual.element;

			} else {
				actual = actual.next;
			}
		}
		if (actual == null) {
			System.out.println("Non hai trovato nessuna persona. Riprova!");
		}
		return null;
	}

	public boolean removeElement(String removePersona) {
		Node actual = firstElement;
		Node prec = firstElement;
		while (actual != null) {
			if ((actual.element.nome.equals(removePersona)) || (actual.element.cognome.equals(removePersona))) {
				prec = actual;
				break;
			} else {
				actual = actual.next;
			}

		}
		return true;
	}

	public int size() {
		Node actual = firstElement;
		int size = 0;
		while (actual != null) {
			size++;
			actual = actual.next;
		}
		return size;
	}

	public String printList() {
		Node actual = firstElement;
		String s = "";
		while (actual != null) {
			String s1 = actual.element.nome + ", " + actual.element.cognome + " -> ";
			s = s.concat(s1);
			actual = actual.next;
		}
		return s;

	}

	public String toString() {
		return firstElement.toString();
	}

	static class Node {
		private Person element;
		private Node next;

		Node(Person el, Node n) {
			element = el;
			next = n;
		}

		public String toString() {
			return "Node[" + element.toString() + ", " + next + "]";
		}

	}

	public static void main(String[] args) {

//		Person p1 = new Person("Sandro", "Gargano");
//		Person p2 = new Person("Ermal", "Aliraj");
//		Person p3 = new Person("Aida", "Xhaxho");
//		Person p4 = new Person("Armela", "Xhaxho");
//
//		Node n1 = new Node(p1, null);
//		Node n2 = new Node(p2, n1);
//		Node n3 = new Node(p3, n2);
//		Node n4 = new Node(p4, n3);
//
//		System.out.println(n4);

		PersonList list = new PersonList(new Node(new Person("Sandro", "Gargano"), null));
		System.out.println("Creazione di una lista " + list);
		System.out.println();

		list.addLast(new Person("Andrea", "Ruggieri"));
		System.out.println("Primo nodo aggiunto alla fine della lista " + list);
		System.out.println();

		list.addLast(new Person("Ermal", "Aliraj"));
		System.out.println("Secondo nodo aggiunto alla fine della lista " + list);
		System.out.println();

		list.addFirst(new Person("Aida", "Xhaxho"));
		System.out.println("Terzo nodo aggiunto in testa lista " + list);
		System.out.println();

		list.addFirst(new Person("Armela", "Xhaxho"));
		System.out.println("Quarto nodo aggiunto in testa lista " + list);
		System.out.println();

		list.findElement("Ermal");
		System.out.println("Hai trovato la persona " + list.findElement("Ermal"));
		System.out.println();
		
//		list.removeElement("Aida");
//		System.out.println();

		list.printList();
		System.out.println("La lista aggiornata e' " + list.printList());
		System.out.println();
		
		list.size();
		System.out.println("Attualmente la lista e' formata da " + list.size() + " nodi");

	}
}
