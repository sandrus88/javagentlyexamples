package com.sg.javagently.ch6;

import java.io.BufferedReader;
import java.io.IOException;

import com.sg.javagently.ch4.Text;

public class Studenti {

	static final int nMarks = 6;
	String name;
	int[] marks = new int[nMarks];
	int finalMark;
	int[] weights = { 5, 10, 5, 15, 15, 50 };

	public Studenti() {

	}

	void setMarks(BufferedReader in) throws IOException {
		for (int i = 0; i < nMarks; i++) {
			marks[i] = Text.readInt(in);
		}
	}

	void setName(BufferedReader in) throws IOException {
		name = Text.readLine(in) + " " + Text.readLine(in);
	}

	void calculateFinal() {
		finalMark = 0;
		for (int i = 0; i < nMarks; i++) {
			finalMark += marks[i] * weights[i];
		}
		finalMark = finalMark / 100;
	}
}