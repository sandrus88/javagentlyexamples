package com.sg.javagently.ch5;

public class Date {

	public class DateException extends Exception {
		DateException(String s) {
			super(s);
		}
	}

	public Date() {

	}

	public Date(int y, int m, int d) throws DateException {
		checkDate(y, m, d);
	}

	private int year, month, day;

	private void checkDate(int y, int m, int d) throws DateException {
		if ((m < 1) | (m > 12))
			throw new DateException("Mese non valido");
		else if ((d < 1) | (d > 31))
			throw new DateException("Giorno non valido");
		else {
			year = y;
			month = m;
			day = d;
		}
	}

	public String toString() {
		String s = String.valueOf(day) + " ";
		switch (month) {
		case 1:
			s = s + "Gen";
			break;
		case 2:
			s = s + "Feb";
			break;
		case 3:
			s = s + "Mar";
			break;
		case 4:
			s = s + "Apr";
			break;
		case 5:
			s = s + "Mag";
			break;
		case 6:
			s = s + "Giu";
			break;
		case 7:
			s = s + "Lug";
			break;
		case 8:
			s = s + "Ago";
			break;
		case 9:
			s = s + "Set";
			break;
		case 10:
			s = s + "Ott";
			break;
		case 11:
			s = s + "Nov";
			break;
		case 12:
			s = s + "Dic";
			break;
		}
		s = s + " " + String.valueOf(year);
		return s;
	}

	public boolean lessThan(Date D) {
		boolean b = year < D.year;
		b = b || year == D.year && month < D.month;
		b = b || year == D.year && month == D.month && day < D.day;
		return b;
	}
}
