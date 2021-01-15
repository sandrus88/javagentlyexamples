package com.sg.javagently.ch7;

import java.util.Date;
import java.util.TimeZone;

public class VerificaFusiOrari {

	public static void main(String[] args) {

		TimeZone here = TimeZone.getDefault();
		Date today = new Date();
		System.out.println(today);
		System.out.println("Siamo nella zona di nome " + here.getID() + " time zone con un offset di "
				+ here.getRawOffset() / 3600000 + " rispetto all'Orario Universale.");
		System.out.println("L'ora legale e' in uso qui? " + here.useDaylightTime());
		System.out.println("In questo momento l'ora legale e' in uso? " + here.inDaylightTime(today));
	}
}
