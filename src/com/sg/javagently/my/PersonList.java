package com.sg.javagently.my;

public interface PersonList {
	
	public void addFirst(Person element);
	
	public void addLast(Person element);
	
	public Person findElement(String nomePersona);
	
	public boolean removeElement(String removePersona);
	
	public int size();

	public void printList();
}
