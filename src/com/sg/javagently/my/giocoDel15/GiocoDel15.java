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
import java.util.Arrays;
import java.util.Random;

import com.sg.javagently.my.SGUtil;

public class GiocoDel15 extends Frame {

	private Button chiudi;
	private Button nuovaPartita;
	private Button bottoni[];
	private String numeri[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "" };

	public GiocoDel15() {
		Panel titolo = new Panel();
		titolo.setBackground(Color.red);
		Label label = new Label("Metti i numeri in modo crescente");
		titolo.add(label);
		add("North", titolo);

		Panel pannelloBottoniGioco = new Panel();
		GridLayout layout = new GridLayout(4, 4);
		pannelloBottoniGioco.setLayout(layout);
		bottoni = new Button[16];
		for (int i = 0; i < 15; i++) {
			bottoni[i] = new Button();
			bottoni[i].setLabel(numeri[i]);
			bottoni[i].setBackground(Color.blue);
			bottoni[i].addActionListener(new ButtonActionListener());
			pannelloBottoniGioco.add(bottoni[i]);
		}
		Button bottoneVuoto = new Button();
		bottoni[15] = bottoneVuoto;
		bottoneVuoto.setBackground(Color.red);
		pannelloBottoniGioco.add(bottoneVuoto);

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

	private void mixNumbers() {
		for (int i = 0; i < 100; i++) {
			Random rd = new Random();
			int firstIndex = rd.nextInt(16);
			int secondIndex = rd.nextInt(16);

			String temp = numeri[firstIndex];
			numeri[firstIndex] = numeri[secondIndex];
			numeri[secondIndex] = temp;
		}
		SGUtil.printArray(numeri);
	}

	class NuovaPartitaListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			mixNumbers();

			for (int i = 0; i < 16; i++) {
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
			System.out.println("Ho cliccato il bottone " + e);
		}

	}

	public static void main(String[] args) {
		Frame f = new GiocoDel15();
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
