package com.sg.javagently.ch6;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.sg.javagently.ch4.Text;

class Oro {

	Oro(int r, int c) {
		rowmax = r;
		colmax = c;

		data = new double[rowmax][colmax];
		map = new char[rowmax][colmax];
	}

	void readIn(DataInputStream in ) throws IOException {
		for (int i = 0; i < rowmax; i++) {
			for (int j = 0; j < colmax; j++) {
				data[i][j] = Text.readDouble(in);
			}
		}
	}

	void asses() {
		double point, average;
		for (int i = 0; i < rowmax; i++) {
			for (int j = 0; j < colmax; j++) {
				map[i][j] = blank;
			}
		}
		for (int i = 1; i < rowmax - 1; i++) {
			for (int j = 1; j < colmax - 1; j++) {
				point = data[i][j];
				average = (data[i - 1][j] + data[i + 1][j] + data[i][j - 1] + data[i][j + 1]) / 4;
				if (point > average) {
					map[i][j] = cover;
				}
			}
		}

	}

	void print() {
		System.out.println("Mappa dei possibili filoni auriferi");
		System.out.println("======================================================\n");

		for (int j = 0; j < colmax; j++) {
			System.out.println(j + " ");
		}
		System.out.println();
		for (int i = 0; i < rowmax; i++) {
			{
				System.out.println(i + " ");
			}
			for (int j = 0; j < colmax; j++) {
				System.out.println(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Buona fortuna!");

	}

	private int rowmax, colmax;
	private double data[][];
	private char map[][];
	private static final char blank = ' ';
	private static final char cover = '*';
}
