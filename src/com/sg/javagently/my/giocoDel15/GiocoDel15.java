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

	private Label label;
	private Button chiudi;
	private Button nuovaPartita;
	private Button bottoni[];
	private String[] numbers;
	

	public GiocoDel15(String[] a) {
		numbers = a;
		init();
	}

	public GiocoDel15() {
		init();
	}

	private void init() {
		Panel titolo = new Panel();
		titolo.setBackground(Color.red);
		label = new Label("Metti i numeri in modo crescente");
		titolo.add(label);
		add("North", titolo);

		GiocoDel15Controller controller = new GiocoDel15Controller();
		controller.setNumeri(numbers);
		controller.getNumeri();
		Panel pannelloBottoniGioco = new Panel();
		GridLayout layout = new GridLayout(4, 4);
		pannelloBottoniGioco.setLayout(layout);
		bottoni = new Button[16];
		for (int i = 0; i < 16; i++) {
			bottoni[i] = new Button();
			bottoni[i].setLabel(numbers[i]);
			if (i == 15) {
				bottoni[i].setBackground(Color.red);
			} else {
				bottoni[i].setBackground(Color.blue);
			}
			bottoni[i].addActionListener(new GiocoDel15Controller.ButtonActionListener());
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

		nuovaPartita.addActionListener(new GiocoDel15Controller.NuovaPartitaListener());
		chiudi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
	}
}
