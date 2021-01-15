package com.sg.javagently.ch8;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import com.sg.javagently.ch4.Text;

class Coffee {

	Coffee() {

	}

	Coffee(String s) {
		name = new String(s);
	}

	void prepareToStock(BufferedReader bufferedReader) throws IOException {
		name = Text.readLine(bufferedReader);
		price = Text.readDouble(bufferedReader);
		reorder = Text.readInt(bufferedReader);
		batches = 0;
		stock = 0;
	}

	DateFormat dF = DateFormat.getDateInstance();

	boolean newBatchIn(BufferedReader bufferedReader) throws IOException {
		double a = Text.readDouble(bufferedReader);
		if (a == 0) {
			return false;
		} else {
			stock += a;
			Date d = new Date();
			String s = Text.readLine(bufferedReader);
			try {
				d = dF.parse(s);
			} catch (ParseException e) {
				System.out.println("Errore nella data " + s);
			}
			batch[batches] = new Batch(a, d);
			batches++;
			return true;
		}
	}

	void display() {
		System.out.println(name + " @ G" + Text.writeDouble(price, 1, 2) + " per kg");
		for (int i = 0; i < batches; i++) {
			batch[i].display();
		}
		System.out.println("\t" + stock + " kg in magazzino. Livello di riordino: " + reorder + " kg\n");
	}

	private String name;
	private double price;
	private double stock;
	private double reorder;
	private Batch batch[] = new Batch[10];
	private int batches = 0;
}
