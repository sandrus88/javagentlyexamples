package com.sg.javagently.my.giocoDel15;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class GiocoDel15 extends Frame {

	private Label label;
	private Button chiudi;
	private Button nuovaPartita;
	private Button bottoni[];
	private String numeri[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "" };
	private boolean isFinish;

	public GiocoDel15() {
		init();
	}

	public GiocoDel15(String[] a) {
		numeri = a;
		init();
	}

	private void init() {
		Panel titolo = new Panel();
		titolo.setBackground(Color.red);
		label = new Label("Metti i numeri in modo crescente");
		titolo.add(label);
		add("North", titolo);

		Panel pannelloBottoniGioco = new Panel();
		GridLayout layout = new GridLayout(4, 4);
		pannelloBottoniGioco.setLayout(layout);
		bottoni = new Button[16];
		for (int i = 0; i < 16; i++) {
			bottoni[i] = new Button();
			bottoni[i].setLabel(numeri[i]);
			if (i == 15) {
				bottoni[i].setBackground(Color.red);
			} else {
				bottoni[i].setBackground(Color.blue);
			}
			bottoni[i].addActionListener(new ButtonActionListener());
			pannelloBottoniGioco.add(bottoni[i]);
		}
		add("Center", pannelloBottoniGioco);

		Panel pannelloBottoniUscitaENuovaPartita = new Panel();
		pannelloBottoniUscitaENuovaPartita.setBackground(Color.red);
		nuovaPartita = new Button("Nuova Partita");
		pannelloBottoniUscitaENuovaPartita.add(nuovaPartita);
		chiudi = new Button("Esci");
		pannelloBottoniUscitaENuovaPartita.add(chiudi);
		add("South", pannelloBottoniUscitaENuovaPartita);

		nuovaPartita.addActionListener(new NuovaPartitaListener());
		chiudi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
	}

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

	class ButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!isFinish) {
				int indexCliccato = getIndiceCliccato(e);
				if (isAdjacent(indexCliccato)) {
					scambia(indexCliccato);
					updateButtonLabels();
					isFinish = isFinish();
					if (isFinish) {
						label.setText("    H   A   I             V   I   N   T   O  !  !  !");
					}
				}
			}
		}

		private int getIndiceCliccato(ActionEvent e) {
			int indexCliccato = 0;
			for (int i = 0; i < 16; i++) {
				if (e.getSource() == bottoni[i]) {
					bottoni[i].setLabel(numeri[i]);
					indexCliccato = i;
				}
			}
			return indexCliccato;
		}
	}

	class NuovaPartitaListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			isFinish = (false);
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

	public static void main(String[] args) {
		Frame f = new GiocoDel15();
////		String arr[] = { "7", "5", "11", "3", "9", "", "10", "2", "9", "10", "11", "12", "13", "14", "15", "" };
////		Frame f = new GiocoDel15(arr);
		f.setTitle("Gioco del Quindici");
		f.setSize(500, 500);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
