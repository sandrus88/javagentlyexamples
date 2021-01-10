package com.sg.javagently.my;

public class Person {
	String nome;
	String cognome;

	Person(String n, String c) {
		nome = n;
		cognome = c;
	}
	
	public String toString() {
		return  "Person[" + nome + ", " + cognome + "]";
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Sandro", "Gargano");
		Person p2 = new Person("Ermal", "Aliraj");
		Person p3 = new Person("Aida", "Xhaxho");
		Person p4 = new Person("Armela", "Xhaxho");

		System.out.println("p1 " + p1);
		System.out.println("p2 " + p2);
		System.out.println("p3 " + p3);
		System.out.println("p4 " + p4);
		
	}
}