package com.example.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer with minimum of 11 digits:");
		long number = scanner.nextLong();
		System.out.println("Choose an algorithm. Enter 1 for 'brute-force' and 2 for 'smart'");
		int algoNumber = scanner.nextInt();
		scanner.close();
		boolean result = false;
		long currentTime = System.currentTimeMillis();
		if (algoNumber == 1) {
			result = isPrimeBruteForce(number);
		} else {
			result = isPrimeSmart(number);
		}
		long newTime = System.currentTimeMillis();
		System.out.println("is " + number + " Prime? = " + result);
		System.out.println("Time taken to check if " + number + " is prime = " + (newTime - currentTime) + " ms");
	}

	private static boolean isPrimeBruteForce(long n) {
		if (n == 1) {
			return false;
		} else {
			for (int i = 2; i < n - 1; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isPrimeSmart(long n) {
		if (n == 1) {
			return false;
		} else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
