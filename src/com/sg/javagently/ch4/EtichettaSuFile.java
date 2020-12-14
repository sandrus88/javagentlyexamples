package com.sg.javagently.ch4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class EtichettaSuFile {

	public static void main(String[] args) throws IOException {
		
		PrintWriter fout = new PrintWriter(new FileWriter("label.txt"));
		fout = Text.create("label.txt");
		System.out.println("Stampa dell'etichetta su label.txt");
		fout.println("---------------------");
		fout.println("|                   |");
		fout.println("| Ms Mary Brown     |");
		fout.println("| 33 Charles Street |");
		fout.println("| Brooklyn          |");
		fout.println("|                   |");
		fout.println("---------------------");
		fout.close();
		System.out.println("Fine del programma");
	}
}
