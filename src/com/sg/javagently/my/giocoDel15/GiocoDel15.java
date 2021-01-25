package com.sg.javagently.my.giocoDel15;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiocoDel15 extends Frame {

	private Label label;
	private Button chiudi;
	private Button nuovaPartita;
	private Button bottoni[];
	private GiocoDel15Controller controller = new GiocoDel15Controller();

	public GiocoDel15() {
		controller.getNumeri();
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
			bottoni[i].setLabel(controller.getNumeri()[i]);
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

	public void updateButtonLabels() {
		int indexVuoto = controller.getVuoto();
		for (int i = 0; i < 16; i++) {
			bottoni[i].setLabel(controller.getNumeri()[i]);
			if (i == indexVuoto) {
				bottoni[i].setBackground(Color.red);
			} else {
				bottoni[i].setBackground(Color.blue);
			}
		}
	}

	class ButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (!controller.getIsFinish()) {
				int indexCliccato = getIndiceCliccato(e);
				if (controller.isAdjacent(indexCliccato)) {
					controller.scambia(indexCliccato);
					updateButtonLabels();
					controller.setIsFinish(controller.isFinish());
					if (controller.getIsFinish()) {
						label.setText("    H   A   I             V   I   N   T   O  !  !  !");
					}
				}
			}
		}

		private int getIndiceCliccato(ActionEvent e) {
			int indexCliccato = 0;
			for (int i = 0; i < 16; i++) {
				if (e.getSource() == bottoni[i]) {
					bottoni[i].setLabel(controller.getNumeri()[i]);
					indexCliccato = i;
				}
			}
			return indexCliccato;
		}
	}

	class NuovaPartitaListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			controller.setIsFinish(false);
			controller.getIsFinish();
			controller.mixNumbers();
			label.setText("Metti i numeri in modo crescente");

			for (int i = 0; i < 16; i++) {
				bottoni[i].setEnabled(true);
				bottoni[i].setLabel(controller.getNumeri()[i]);
				if (controller.getNumeri()[i].equals("")) {
					bottoni[i].setBackground(Color.red);
				} else {
					bottoni[i].setBackground(Color.blue);
				}
			}
		}
	}
}
