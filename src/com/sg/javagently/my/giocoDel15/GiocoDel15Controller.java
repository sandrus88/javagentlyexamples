package com.sg.javagently.my.giocoDel15;

import java.util.Random;

public class GiocoDel15Controller {
	private String numeri[] = new String[16];
	private boolean isFinish;

	public GiocoDel15Controller() {
		for (int i = 0; i < 16; i++) {
			numeri[i] =  (i + 1) + "";
			if (i==15) {
				numeri[i] =  "";
			}
		}
	}

	public GiocoDel15Controller(String[] a) {
		numeri = a;
	}

	public void setNumeri(String[] arrStr) {
		this.numeri = arrStr;
	}

	public String[] getNumeri() {
		return numeri;
	}

	public void setIsFinish(boolean b) {
		this.isFinish = b;
	}

	public boolean getIsFinish() {
		return isFinish;
	}

	void mixNumbers() {
		for (int i = 0; i < 100; i++) {
			Random rd = new Random();
			int firstIndex = rd.nextInt(16);
			int secondIndex = rd.nextInt(16);

			String temp = numeri[firstIndex];
			numeri[firstIndex] = numeri[secondIndex];
			numeri[secondIndex] = temp;
		}
	}

	/**
	 * Ritorna un intero che rappresenta l'indice del bottone vuoto dentro l'array
	 * numeri
	 * 
	 * @return l'indice del bottone vuoto
	 */
	int getVuoto() {
		int indexVuoto = 0;
		for (int i = 0; i < 16; i++) {
			if (numeri[i].equals("")) {
				indexVuoto = i;
			}
		}
		return indexVuoto;
	}

	/**
	 * Scambia il valore presente nell'indice passato come parametro con quello
	 * vuoto
	 * 
	 * @param index, indice da scambiare con il valore vuoto
	 */
	void scambia(int index) {
		for (int i = 0; i < 16; i++) {
			int valoreVuoto = getVuoto();
			String temp = numeri[index];
			numeri[index] = numeri[valoreVuoto];
			numeri[valoreVuoto] = temp;
		}
	}

	/**
	 * Ritorna true se il valore presente all'indice passato come parametro e'
	 * adiacente al valore vuoto.
	 * 
	 * {"7", "6", "15", "13", "3", "5", "12", "" , "11", "14", "8", "4", "9", "2",
	 * "10", "1"}
	 * 
	 * @param index, indice da verificare se e' adiacente al valore vuoto
	 * @return true se l'indice passato come parametro e' adiacente all'indice del
	 *         valore vuoto.
	 */
	boolean isAdjacent(int index) {
		int indexVuoto = getVuoto();
		if (index % 4 == 0) {
			if (indexVuoto == index - 4 || indexVuoto == index + 1 || indexVuoto == index + 4) {
				return true;
			}
		} else if (index % 4 == 3) {
			if (indexVuoto == index - 4 || indexVuoto == index - 1 || indexVuoto == index + 4) {
				return true;
			}
		} else {
			if (indexVuoto == index - 4 || indexVuoto == index + 4 || indexVuoto == index - 1
					|| indexVuoto == index + 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Verifica se il gioco e' finito o meno
	 * 
	 * @return true quando l'array che contiene i labels dei bottoni e' ordinato in
	 *         maniera crescente
	 */
	public boolean isFinish() {
		final String finalNumeri[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
				"" };

		for (int i = 0; i < 16; i++) {
			if (!numeri[i].equals(finalNumeri[i])) {
				return false;
			}
		}
		return true;
	}
}
