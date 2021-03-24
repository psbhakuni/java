package org.prakash.recursion;

public class PringOneToNWithoutLoop {

	private static void print(int n, int k) {
		if(k > n ) {
			return;
		}
		System.out.print(k + " ");
		print(n, k+1);
	}

	public static void main(String[] args) {
		print(64, 1);
	}

}
