package org.prakash.bitmagic;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1, N = 19;

        for(int i = 2; i <= N; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        System.out.println((fact+"").length());

        System.out.println("digits: " + getNumberOfDigitsInfactorial(N));
    }

    private static int getNumberOfDigitsInfactorial(long n) {
        double count = 0;
        for(int i = 2; i <= n;  i++) {
            count+=Math.log10(i);
        }

        System.out.println(Math.floor(count) + 1);
        return ((int)Math.floor(count) + 1);
    }

    public int digitsInFactorial(int n){
        if (n < 0)
            return 0;

        // base case
        if (n <= 1)
            return 1;

        // else iterate through n and calculate the
        // value
        double digits = 0;
        for (int i=2; i<=n; i++)
            digits += Math.log10(i);

        return (int)(Math.floor(digits)) + 1;
    }
}
