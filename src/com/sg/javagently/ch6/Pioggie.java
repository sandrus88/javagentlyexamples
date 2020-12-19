package com.sg.javagently.ch6;

class Pioggie {

	static double monthlyAverage(double monthlyRain[], int n) {
		double total = 0;
		for (int y = 0; y < n; y++) {
			total += monthlyRain[y];
		}
		return total / n;
	}

	static double monthlyStdDev(double monthlyRain[], int n, double mean) {
		double total = 0;
		for (int y = 0; y < n; y++) {
			total += (monthlyRain[y]) * (mean - monthlyRain[y]);
		}
		return Math.sqrt(total / (n - 1));
	}

}
