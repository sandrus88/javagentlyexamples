package com.sg.javagently.my;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

	public static void main(String[] args) {

		Date now = new Date();
		System.out.println("Now: " + now);
		System.out.println("Now + 2 giorni: " + addDaysToDate(now, 2));
		System.out.println("Now + 2 mesi: " + addMonthsToDate(now, 2));
		System.out.println("Se la data del metodo e' <= now: " + isFutureOrTodayDate(now));
		System.out.println("Se la data del metodo e' = now: " + isTodayDate(now));
		System.out.println("Se la data del metodo e' < now: " + isFutureDate(now));
		System.out.println("Se la data del metodo e' > now: " + isEarlierDate(now));
		System.out.println("Se la data del metodo e' >= now: " + isEarlierOrTodayDate(now));
		System.out.println("Now allo scoccare della mezzanotte: " + getDateAsDDMMYYYY(now));
		System.out.println("Now nel formato dd/mm/yyyy: " + getDateAsStringAsDDMMYYYY(now));
		System.out.println("Now nel formato dd/mm/yyyy hh:mm:ss: " + getDateAsString(now));

	}

	public static Date addDaysToDate(Date date, int dayDelta) {
		if (date == null)
			return new Date();

		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, dayDelta);
		return cal.getTime();
	}

	public static Date addMonthsToDate(Date date, int monthDelta) {
		if (date == null) {
			return new Date();
		}

		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.MONTH, monthDelta);
		return cal.getTime();
	}

	/**
	 * Returns true if the date passed as parameter is greater or equals to today.
	 * 
	 * @param d date to check if is valid
	 * @return true, if the date is today date or a future date.
	 */
	public static boolean isFutureOrTodayDate(Date d) {
		Date today = getDateAsDDMMYYYY(new Date());
		Date compareDate = getDateAsDDMMYYYY(d);
		return today.compareTo(compareDate) <= 0;
	}

	public static boolean isTodayDate(Date d) {
		Date today = getDateAsDDMMYYYY(new Date());
		Date compareDate = getDateAsDDMMYYYY(d);
		return today.compareTo(compareDate) == 0;
	}

	/**
	 * Returns true id the date passed as parameter is greater or equals to today.
	 * 
	 * @param d date to check if is valid
	 * @return true, if the date is today date or a future date.
	 */
	public static boolean isFutureDate(Date d) {
		Date today = getDateAsDDMMYYYY(new Date());
		Date compareDate = getDateAsDDMMYYYY(d);
		return today.compareTo(compareDate) < 0;
	}

	public static boolean isEarlierDate(Date d) {
		Date today = getDateAsDDMMYYYY(new Date());
		Date compareDate = getDateAsDDMMYYYY(d);
		return today.compareTo(compareDate) > 0;
	}

	/**
	 * Returns true if the date passed as parameter is greater or equals to today.
	 * 
	 * @param d date to check if is valid
	 * @return true, if the date is today date or a future date.
	 */
	public static boolean isEarlierOrTodayDate(Date d) {
		Date today = getDateAsDDMMYYYY(new Date());
		Date compareDate = getDateAsDDMMYYYY(d);
		return today.compareTo(compareDate) >= 0;
	}

	public static boolean isTodayWithinRange(Date startDate, Date endDate) {
		return (isEarlierOrTodayDate(startDate) && isFutureOrTodayDate(endDate));
	}

	/**
	 * TODO getDateAsDDMMYYYY seems to return the new formated date, but do not do
	 * that! see getDateAsStringAsDDMMYYYY()
	 * 
	 * Format the given date as dd/MM/yyyy
	 * 
	 * @param d date to format
	 * @return new formated date
	 */
	public static Date getDateAsDDMMYYYY(Date d) {
		Date retDate = null;
		try {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			String str = df.format(d);
			retDate = df.parse(str);
		} catch (ParseException e) {
			System.out.println("Can not truncate date +" + d + " in format dd/MM/yyyy");
		} catch (Exception e2) {
			System.out.println("General error converting date +" + d + " in format dd/MM/yyyy");
		}
		return retDate;
	}

	/**
	 * Format the given date as dd/MM/yyyy
	 * 
	 * @param d date to format
	 * @return new formated date as string
	 */
	public static String getDateAsStringAsDDMMYYYY(Date d) {
		String rv = "";
		try {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			rv = df.format(d);
		} catch (Exception e) {
			System.out.println("Error converting Date as String:" + e.getMessage());
		}
		return rv;
	}

	/**
	 * Format the given date as dd/MM/yyyy HH:mm:ss
	 * 
	 * @param d date to format
	 * @return new formated date as string
	 */
	public static String getDateAsString(Date d) {
		String rv = "";
		try {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			rv = df.format(d);
		} catch (Exception e) {
			System.out.println("Error converting Date as String:" + e.getMessage());
		}
		return rv;
	}
}
