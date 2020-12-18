package com.sg.javagently.my;

public class IsDoubleIsInt {
	public static void main(String[] args) {
		String valoreInserito = "32.4";
		System.out.println("valore valoreInserito: '" + valoreInserito + "'");

		boolean isInt = false;
		boolean isDouble = false;

		try {
			Integer.parseInt(valoreInserito);
			isInt = true;
		} catch (Exception e) {
			isInt = false;
		}

		if (!isInt) {
			try {
				Double.parseDouble(valoreInserito);
				isDouble = true;
			} catch (Exception e) {
				isDouble = false;
			}
		}
		System.out.println("isInt ? " + isInt + ", isDouble ? " + isDouble);

	}

}
