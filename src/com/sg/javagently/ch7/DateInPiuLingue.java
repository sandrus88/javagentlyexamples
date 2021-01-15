package com.sg.javagently.ch7;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateInPiuLingue {

	static Date today = new Date();

	static void printDates(Locale l) {
		System.out.println("Siamo in " + l.getCountry() + " dove si parla " + l.getLanguage());
		DateFormat d = DateFormat.getDateInstance();
		System.out.println(today);
		d = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(d.format(today));
		System.out.println();
	}

	public static void main(String[] args) throws IOException {

		System.out.println(today);

		Locale genuine = Locale.getDefault();
		printDates(genuine);

		Locale.setDefault(Locale.GERMANY);
		printDates(Locale.getDefault());

		Locale.setDefault(Locale.UK);
		printDates(Locale.getDefault());

		Locale.setDefault(Locale.FRANCE);
		printDates(Locale.getDefault());

		Locale.setDefault(Locale.US);
		printDates(Locale.getDefault());

		Locale.setDefault(Locale.JAPAN);
		printDates(Locale.getDefault());
	}
}
