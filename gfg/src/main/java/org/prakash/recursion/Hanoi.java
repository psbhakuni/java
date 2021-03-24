package org.prakash.recursion;

public class Hanoi {

	public static void main(String[] args) {
		System.out.println(toh(3, 1,3, 2));
	}

	public static long toh(int N, int from, int to, int aux) {
		long moves = 0;
		if(N == 1) {
			System.out.println("move disk "+ N +" from rod "+ from +" to rod "+to);
			return 1;
		}
		
		moves = moves + toh(N - 1, from, aux, to);
		System.out.println("move disk "+ N +" from rod "+ from +" to rod "+to);
		moves++;
		moves = moves + toh(N - 1, aux, to, from);
		
		return moves;
	}
}
