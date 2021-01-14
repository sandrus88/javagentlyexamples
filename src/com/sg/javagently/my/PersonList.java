package com.sg.javagently.my;

public interface PersonList {
	
	boolean isEmpty();
	
	void addFirst(Person element);
	
	void addLast(Person element);
	
	Person findElement(String nomePersona);
	
	boolean removeElement(String removePersona);
	
	int size();

	void printList();

	Person get(int index);
}
