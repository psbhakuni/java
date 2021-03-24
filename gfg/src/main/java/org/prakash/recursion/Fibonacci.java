package org.prakash.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacci(20));

	}

	static long fibonacci(int n) {
		if(n == 1 || n == 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
