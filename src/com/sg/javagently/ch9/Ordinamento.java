package com.sg.javagently.ch9;

public class Ordinamento {

	public static void selectionOrdinamento(OrdinamentoI a[], int n) {
		OrdinamentoI temp;
		int chosen;

		for (int leftmost = 0; leftmost < n - 1; leftmost++) {
			chosen = leftmost;
			for (int j = leftmost + 1; j < n; j++) {
				if (a[j].lessThan(a[chosen])) {
					chosen = j;
				}
				temp = a[chosen];
				a[chosen] = a[leftmost];
				a[leftmost] = temp;
			}
		}
	}
}
