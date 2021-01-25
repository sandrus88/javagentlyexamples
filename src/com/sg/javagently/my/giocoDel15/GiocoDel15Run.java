package com.sg.javagently.my.giocoDel15;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GiocoDel15Run {

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
