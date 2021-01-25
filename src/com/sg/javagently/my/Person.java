package com.sg.javagently.my;

public class Person implements Cloneable {
	String nome;
	String cognome;

	Person(String n, String c) {
		nome = n;
		cognome = c;
	}
	
	
	public String toString() {
		return  "Person[" + nome + ", " + cognome + "]";
	}
	
	public Person clone() {
		Person clone = new Person(this.nome, this.cognome);
		return clone;
	}
	
	public boolean equals(Object o) {
		Person p = (Person) o;
        return this.nome.equals(p.nome) && this.cognome.equals(p.cognome);
    }
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Sandro", "Gargano");
		Person p1_ref = p1;
		Person p1_clone = p1.clone();
		System.out.println("p1==p1_ref? " + (p1==p1_ref) + ", ref==p1_clone?" + (p1==p1_clone));
		System.out.println("p1.equals(p1_ref)? " + (p1.equals(p1_ref)) + ", p1.equals(p1_clone)?" + (p1.equals(p1_clone)));
		p1.cognome = "Xhaxho";
		System.out.println("p1: " + p1 + ", ref: " + p1_ref + ", clone: " + p1_clone);
		
//		Person p2 = new Person("Ermal", "Aliraj");
//		Person p3 = new Person("Aida", "Xhaxho");
//		Person p4 = new Person("Armela", "Xhaxho");
//
//		System.out.println("p1 " + p1);
//		System.out.println("p2 " + p2);
//		System.out.println("p3 " + p3);
//		System.out.println("p4 " + p4);
//		
	}
}