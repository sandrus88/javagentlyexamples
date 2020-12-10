package com.sg.javagently.ch2;

import java.awt.*;
import java.awt.event.*;

/*
 * Illustra un semplice output grafico raffigurante un pupazzo di neve
 */

class PupazzoDiNeve extends Frame {

	public PupazzoDiNeve() {
		setTitle("Pupazzo di Neve");
	}

	public static void main(String[] args) {
		Frame f = new PupazzoDiNeve();

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setSize(400, 400);
		f.setVisible(true);
	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawOval(135, 135, 120, 120);
		g.setColor(Color.black);
		g.drawOval(187, 160, 15, 15);
		g.setColor(Color.black);
		g.drawOval(187, 185, 15, 15);
		g.setColor(Color.black);
		g.drawOval(187, 210, 15, 15);
		g.setColor(Color.black);
		g.drawOval(240, 135, 30, 30);
		g.setColor(Color.black);
		g.drawOval(120, 135, 30, 30);
		g.setColor(Color.black);
		g.drawOval(160, 66, 70, 70);
		g.setColor(Color.black);
		g.drawOval(205, 90, 10, 10);
		g.setColor(Color.black);
		g.drawOval(175, 90, 10, 10);
		g.setColor(Color.black);
		g.drawOval(185, 110, 20, 13);
		g.setColor(Color.black);
		g.fillOval(175, 60, 50, 13);
		g.setColor(Color.black);
		g.fillOval(175, 50, 30, 13);

		g.drawString("Questo è un pupazzo di neve", 120, 300);
	}

}
