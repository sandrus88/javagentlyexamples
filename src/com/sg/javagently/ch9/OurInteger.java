package com.sg.javagently.ch9;


public class OurInteger implements OrdinamentoI {
	int val;

	public OurInteger(int i) {
		val = i;
	}

	@Override
	public boolean lessThan(OrdinamentoI a) {
		OurInteger i = (OurInteger) a;
		return val < i.val;
	}

	public String toString() {
		return String.valueOf(val);
	}

}
