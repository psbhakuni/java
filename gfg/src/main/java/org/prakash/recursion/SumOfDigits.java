package org.prakash.recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(sumOfDigits(12345));
	}

	// complete the function
	public static int sumOfDigits(int n) {
		if (n == 0) {
			return 0;
		}

		return n % 10 + sumOfDigits(n / 10);
	}
}
