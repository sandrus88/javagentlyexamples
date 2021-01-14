package com.sg.javagently.ch9;

public class Country implements OrdinamentoI {
	private String name;

	Country(String s) {
		name = s;
	}

	@Override
	public boolean lessThan(OrdinamentoI a) {
		Country b = (Country) a;
		return (name.compareTo(b.name) < 0);
	}

	public String toString() {
		return name;
	}
}
