package com.sg.javagently.my.giocoDel15;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GiocoDel15Controller {
	private String numeri[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "" };
	private boolean isFinish;

	public void setNumeri(String[] arrStr) {
		this.numeri = arrStr;
	}

	public String[] getNumeri() {
		return numeri;
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
	 * Aggiorna i labels dei bottoni riportando i valori dell'array numeri
	 */
	void updateButtonLabels() {
		int indexVuoto = getVuoto();
		for (int i = 0; i < 16; i++) {
			bottoni[i].setLabel(numeri[i]);
			if (i == indexVuoto) {
				bottoni[i].setBackground(Color.red);
			} else {
				bottoni[i].setBackground(Color.blue);
			}
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
//	      {"7", "6", "15", "13",
//		   "3", "5", "12", "" ,
//		   "11", "14", "8", "4",
//		   "9", "2", "10", "1"};
	boolean isAdjacent(int index) {
		int indexVuoto = getVuoto();// posizione 7 dara' true se index sara' l' indice dei valori 13 o 12 o
		if (index % 4 == 0) {
			if (indexVuoto == index - 4 || indexVuoto == index + 1 || indexVuoto == index + 4) {// 0, 4, 8, 12, colonna
																								// sinistra
				return true;
			}
		} else if (index % 4 == 3) {
			if (indexVuoto == index - 4 || indexVuoto == index - 1 || indexVuoto == index + 4) {// 3, 7, 11 ,15, colonna
																								// destra
				return true;
			}
		} else {
			if (indexVuoto == index - 4 || indexVuoto == index + 4 || indexVuoto == index - 1
					|| indexVuoto == index + 1) { // altrimenti i valori degli indici in mezzo
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
			if (numeri[i] != finalNumeri[i]) {
				return false;
			}
		}
		return true;
	}

	class NuovaPartitaListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			isFinish = false;
			mixNumbers();
			label.setText("Metti i numeri in modo crescente");

			for (int i = 0; i < 16; i++) {
				bottoni[i].setEnabled(true);
				bottoni[i].setLabel(numeri[i]);
				if (numeri[i].equals("")) {
					bottoni[i].setBackground(Color.red);
				} else {
					bottoni[i].setBackground(Color.blue);
				}
			}
		}
	}

	class ButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!isFinish) {
				int indexCliccato = getIndiceCliccato(e);
				if (isAdjacent(indexCliccato)) {
					scambia(indexCliccato);
					updateButtonLabels();
					isFinish = isFinish();
					if (isFinish()) {
						label.setText("    H   A   I             V   I   N   T   O  !  !  !");
					}
					// questo modo non ci piace invece di disattivare tutti i bottoni quando sono
					// in questo punto del sistema salverei questo stato in una variabile isFinish
					// quindi farei la logica dell actionperformed ( dei bottoni) solo se isFinish
					// e' false

					// una volta stabilito che sei nello stato isFinish (218) oltre a cambiare il
					// label
					// dovresti fare in modo che da questo momento in poi a ogni click del bottone
					// non accada nulla
				}
			}
		}

		private int getIndiceCliccato(ActionEvent e) {
			int indexCliccato = 0;
			for (int i = 0; i < 16; i++) {
				if (e.getSource() == bottoni[i]) {
					bottoni[i].setLabel(numeri[i]);
					indexCliccato = i;// prendere dalla e l'indice cliccato
				}
			}
			return indexCliccato;
		}

	}
}
