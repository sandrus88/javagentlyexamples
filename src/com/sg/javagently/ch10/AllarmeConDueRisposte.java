package com.sg.javagently.ch10;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AllarmeConDueRisposte extends Frame implements ActionListener {

	private static final int horigap = 15;
	private static final int vertigap = 10;
	private Button waitButton;
	private Button rebootButton;

	public AllarmeConDueRisposte(String[] message, int n) {
		setBackground(Color.cyan);
		setForeground(Color.black);
		setLayout(new FlowLayout(FlowLayout.CENTER, horigap, vertigap));
		for (int i = 0; i < n; i++) {
			add(new Label(message[i]));
		}
		waitButton = new Button("Attendi");
		add(waitButton);
		waitButton.addActionListener(this);
		rebootButton = new Button("Riavvia");
		add(rebootButton);
		rebootButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rebootButton) {
			setVisible(false);
			dispose();
			System.exit(0);
		} else if (e.getSource() == waitButton) {
			setForeground(Color.white);
			setBackground(Color.red);
		}
	}

	public static void main(String[] args) {
		String message[] = { "ATTENZIONE", "Possibile virus", "Riavviare ed eseguire", "un anti-virus!" };

		Frame f = new AllarmeConDueRisposte(message, 4);
		f.setTitle("Prova pulsanti");
		f.setSize(160, 200);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
