package com.sg.javagently.ch7;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import com.sg.javagently.ch4.Text;

public class FormattazioneParsingDate {

	FormattazioneParsingDate() {

	}

	static BufferedReader bufferReader = Text.open(System.in);
	static Date d = new Date();
	static Date my = new Date();

	static void echoDate(String style, DateFormat din, DateFormat dout) throws IOException {
		System.out.println(style + "\t" + din.format(d));
		String s = bufferReader.readLine();
		System.out.println("\t\t\t" + s);
		try {
			my = din.parse(s);
		} catch (ParseException e) {
			System.out.println("Data " + s + " non valida");
		}
		System.out.println("\t\t\t" + dout.format(my));
	}

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.UK);
		DateFormat dS = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat dM = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat dL = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat dF = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat dD = DateFormat.getDateInstance(DateFormat.DEFAULT);

		echoDate("SHORT", dS, dF);
		echoDate("MEDIUM", dM, dF);
		echoDate("LONG", dL, dF);
		echoDate("FULL", dF, dF);
		echoDate("DEFAULT", dD, dF);
	}
}
