package com.sg.javagently.my;

public class SwitchExample {

	public static void metodoIf() {
		int mese = 3;
		String nome;

		if (mese == 1) {
			nome = "Gennaio";
		} else if (mese == 2) {
			nome = "Febbraio";
		} else if (mese == 3) {
			nome = "Marzo";
		} else {
			nome = "Altri mesi";
		}
	}

	public static void main(String[] args) {
		int mese = 3;
		String nome;

		switch (mese) {
		case 1:
			nome = "Gennaio";
			break;
		case 2:
			nome = "Febbraio";
			break;
		case 3:
			nome = "Marzo";
			break;
		default:
			nome = "Altri mesi";
		}
		System.out.println("fascia = " + nome);

		metodoIf();
	}

}
