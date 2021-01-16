package com.sg.javagently.ch10;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class LightsCanvas extends Canvas {
	public void paint(Graphics g) {
		g.drawOval(97, 10, 30, 68);
		g.setColor(Color.red);
		g.fillOval(105, 15, 15, 15);
		g.setColor(Color.yellow);
		g.fillOval(105, 35, 15, 15);
		g.setColor(Color.green);
		g.fillOval(105, 55, 15, 15);
		g.fillOval(105, 85, 15, 15);
		g.setColor(Color.black);
		g.drawString("ROSSO", 15, 28);
		g.drawString("GIALLO", 15, 48);
		g.drawString("VERDE", 15, 68);
		g.drawString("Avanti", 15, 98);
	}
}
