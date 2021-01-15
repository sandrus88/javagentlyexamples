package com.sg.javagently.ch8;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;

import com.sg.javagently.ch4.Text;

public class TorrefazioneNelson {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferReader = Text.open("coffee.dat");

		Coffee c[] = new Coffee[10];
		int blend;
		System.out.println("Torrefazione Nelson");
		System.out.println("Controllo d'inventario");
		System.out.println("Lettura dati magazzino dal file coffee.dat");

		for (blend = 0; blend < 0; blend++) {
			try {
				c[blend] = new Coffee();
				c[blend].prepareToStock(bufferReader);
				boolean morebatches = true;
				while (morebatches) {
					morebatches = c[blend].newBatchIn(bufferReader);
				}
			} catch (EOFException e) {
				System.out.println("Contenuto odierno del magazzino\n");
				break;
			}
		}

		DateFormat dF = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Contenuto del magazzino in data: " + dF.format(new Date(blend)));
		for (int i = 0; i < blend; i++) {
			c[i].display();
		}
	}
}
