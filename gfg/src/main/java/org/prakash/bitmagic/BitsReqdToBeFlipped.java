package org.prakash.bitmagic;

public class BitsReqdToBeFlipped {
    public static void main(String[] args) {
        //int a = 10, b = 20; // Ans 4
        //int a = 20;
        //int b = 25; // Ans 3
        int a = 34, b = 7; // Ans 3

        System.out.println("## : "+ (a | b));
        System.out.println("Bits to flip :  " + countBitsFlip(a, b));
    }

    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b) {
        int num = (a ^ b);
        System.out.println("(a, b) : ("+a + ", "+b +")");
        System.out.println("a|b : "+ (a | b));
        System.out.println("Binary String   a: "+ Integer.toBinaryString(a));
        System.out.println("Binary String   b: "+ Integer.toBinaryString(b));
        System.out.println("Binary String num: "+ Integer.toBinaryString(num));
        return countSetBits(num);
    }

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}
