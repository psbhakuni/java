package org.prakash.recursion;

public class PowerOfNumbers {
    public static void main(String[] args) {
        System.out.println(power(12, 21)/1000000007);
    }

    static long power(int N,int R)
    {
        if (R == 0)
            return 1;
        else if (R % 2 == 0)
            return (power(N, R / 2) * power(N, R / 2));
        else
            return N * (power(N, R / 2) * power(N, R / 2));

    }
}
