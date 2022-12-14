package com.bridgelabz;

/*
 * Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
 */

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Welcome to Prime Numbers Program!");
		System.out.println("\nGenerating Prime numbers between 0 and 1000:\n");
		PrimeNumber call = new PrimeNumber();
		call.generatePrime(0, 1000);
	}

	public void generatePrime(int low, int high) {
		for (int counter = 2; counter <= high; counter++) {
			int flag = 0;
			for (int factor = 2; factor < counter; factor++) {
				if (counter % factor == 0)
					flag++;
			}
			if (flag == 0)
				System.out.println(counter);
		}
	}
}
