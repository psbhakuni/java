package org.prakash.bitmagic;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(" Binary to grey : " + isPowerofTwo(98));
    }

    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        if((n & 1) == 1){
            return false;
        }

        while(n > 1 && ((n & 1) == 0) ){
            System.out.println("n: "+ n);
            n = n/2;
        }
        return n == 1;
    }

}
