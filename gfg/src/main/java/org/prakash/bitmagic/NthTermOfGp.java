package org.prakash.bitmagic;

public class NthTermOfGp {
    public static void main(String[] args) {
       /*
        int A = 2;
        int B = 3;
        int N = 6;
        */
        int A = 84;
        int B = 87;
        int N = 3;
        double factor = (double)B / (double)A ;


        System.out.println(A+ A*Math.pow(factor,N-1));

    }
}
