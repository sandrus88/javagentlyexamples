package com.sg.javagently.my;

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

public class GiocoDel15 extends Frame implements ActionListener {

	private Button chiudi;
	private Button nuovaPartita;
	private Button bottoniGioco[];

	public GiocoDel15() {
		Panel titolo = new Panel();
		titolo.setBackground(Color.red);
		Label label = new Label("Metti i numeri in modo crescente");
		titolo.add(label);
		add("North", titolo);

		Panel pannelloBottoniGioco = new Panel();
		GridLayout layout = new GridLayout(4, 4);
		pannelloBottoniGioco.setLayout(layout);
		bottoniGioco = new Button[15];
		for (int i = 0; i < bottoniGioco.length; i++) {
			bottoniGioco[i] = new Button("" + (i + 1));
			bottoniGioco[i].setBackground(Color.blue);
			pannelloBottoniGioco.add(bottoniGioco[i]);
		}
		Button bottoneVuoto = new Button();
		bottoneVuoto.setBackground(Color.red);
		pannelloBottoniGioco.add(bottoneVuoto);
		add("Center", pannelloBottoniGioco);

		Panel pannelloBottoniUscitaENuovaPartita = new Panel();
		pannelloBottoniUscitaENuovaPartita.setBackground(Color.red);
		nuovaPartita = new Button("Nuova Partita");
		pannelloBottoniUscitaENuovaPartita.add(nuovaPartita);
		nuovaPartita.addActionListener(this);
		chiudi = new Button("Esci");
		pannelloBottoniUscitaENuovaPartita.add(chiudi);
		chiudi.addActionListener(this);
		add("South", pannelloBottoniUscitaENuovaPartita);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == chiudi) {
			setVisible(false);
			System.exit(0);
		} else if (e.getSource() == nuovaPartita) {
			for (int i = 0; i < bottoniGioco.length; i++) {
				bottoniGioco[i].setBackground(Color.green);
			}
//			Random rd = new Random();
//			for (int i = 0; i < bottoniGioco.length; i++) {
//				int randomPosition = rd.nextInt(bottoniGioco.length);
//				Button temp = bottoniGioco[i];
//				bottoniGioco[i] = bottoniGioco[randomPosition];
//				bottoniGioco[randomPosition] = temp;
//			}
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
