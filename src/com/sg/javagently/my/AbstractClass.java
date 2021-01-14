package com.sg.javagently.my;

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

	@Override
	public String lavora() {
		// TODO Auto-generated method stub
		return null;
	}

}