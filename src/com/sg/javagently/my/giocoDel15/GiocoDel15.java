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

	private Button chiudi;
	private Button nuovaPartita;
	private Button bottoniGioco[];
	private String bottoniNumeri[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14",
			"15" };

	public GiocoDel15() {
		Panel titolo = new Panel();
		titolo.setBackground(Color.red);
		Label label = new Label("Metti i numeri in modo crescente");
		titolo.add(label);
		add("North", titolo);

		Panel pannelloBottoniGioco = new Panel();
		GridLayout layout = new GridLayout(4, 4);
		pannelloBottoniGioco.setLayout(layout);
		bottoniGioco = new Button[16];
		for (int i = 0; i < 16; i++) {
			if (i == 15) {
				Button bottoneVuoto = new Button();
				bottoniGioco[i] = bottoneVuoto;
				bottoneVuoto.setBackground(Color.red);
				pannelloBottoniGioco.add(bottoneVuoto);
			} else {
				bottoniGioco[i] = new Button();
				bottoniGioco[i].setLabel(bottoniNumeri[i]);
				bottoniGioco[i].setBackground(Color.blue);
				bottoniGioco[i].addActionListener(new ButtonActionListener());
				pannelloBottoniGioco.add(bottoniGioco[i]);
			}
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

	class NuovaPartitaListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// scambiare i numeri dei bottoni
			// andare a pescare a caso un elemento dell'array bottoniNumeri:
			// 1. prendo un indice a caso tra 0 e 15
			// 2. leggo il valore presente nella posizione del punto 1.
			// e metterlo al label del bottone

			// A) mischiare gli elementi dell'array bottoniNumeri
			// selezionare a caso due indici e scambiarli con gli elementi dell'array
			// 1. prendi due indici a caso tra 0 e 15
			// 2. scambiare i valori dell'array in quei indici
			// 3. ripeti questa operazione 100 volte. Signidìfica che avremo l'array dei
			// numeri
			// mischiati
			// B) popola i bottoni leggendo glie elementi dall'array mischiato

//			for (int i = 0; i < bottoniGioco.length; i++) {
//				Random rd = new Random();
//				int randomPosition = rd.nextInt(15);// valore a caso tra 0 e 15
//				String v = bottoniNumeri[randomPosition];
//				System.out.println("randomposition: " + randomPosition + " valore: " + v);
//				bottoniGioco[i].setLabel(v);
//			}

			for (int i = 0; i < 100; i++) {
				Random rd = new Random();
				int randomPosition = rd.nextInt(15);
				int secondRandomPosition = rd.nextInt(15);
//				System.out.println("randomposition: " + randomPosition + " secondRandomPosition " + secondRandomPosition);
				String temp = bottoniNumeri[randomPosition]; 
	            bottoniNumeri[randomPosition] = bottoniNumeri[secondRandomPosition];
	            bottoniNumeri[secondRandomPosition] = temp;
	            System.out.println("randomposition: " + randomPosition + " valore: " + temp + " secondRandomPosition " + secondRandomPosition + " valore: " + temp);
	            bottoniGioco[randomPosition].setLabel(temp);
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
