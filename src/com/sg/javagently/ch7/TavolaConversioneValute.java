package com.sg.javagently.ch7;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

import com.sg.javagently.ch4.Text;

public class TavolaConversioneValute {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferReader = Text.open("rates.dat");
		System.out.println("Tavola di conversione di valute");
		System.out.println("===============================");
		System.out.println();
		System.out.println("I tassi di cambio sono:");
		System.out.println("graz\tdollari\tsterline\tyen\tmarchi\tfranchi");
		double d = Text.readDouble(bufferReader);
		double s = Text.readDouble(bufferReader);
		double y = Text.readDouble(bufferReader);
		double m = Text.readDouble(bufferReader);
		double f = Text.readDouble(bufferReader);
		System.out.println("1\t" + d + "\t" + s + "\t" + y + "\t" + m + "\t" + f);
		System.out.println();

		NumberFormat Nd = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat Ns = NumberFormat.getCurrencyInstance(Locale.UK);
		NumberFormat Ny = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		NumberFormat Nm = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		NumberFormat Nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		for (int graz = 1000; graz < 10000; graz += 1000) {
			System.out.println('G' + Text.writeInt(graz, 3) + '\t' + Nd.format(graz / d) + '\t' + Ns.format(graz / s)
					+ '\t' + Ny.format(graz / y) + '\t' + Nm.format(graz / m) + '\t' + Nf.format(graz / f));
		}
	}
}
