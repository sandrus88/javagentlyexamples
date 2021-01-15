package com.sg.javagently.ch8;

import java.text.DateFormat;
import java.util.Date;

class Batch {

	private double inStock;
	private Date sellByDate;

	Batch(double k, Date d) {
		inStock = k;
		sellByDate = d;
	}

	double available() {
		return inStock;
	}

	DateFormat dF = DateFormat.getDateInstance();

	boolean sell(double k) {
		inStock -= k;
		System.out.println("Venduti " + k + " kg della partita " + dF.format(sellByDate));
		return inStock <= 0; // sold out
	}

	void display() {
		System.out.println("\t\t" + dF.format(sellByDate) + " : " + inStock + " kg");
	}
}
