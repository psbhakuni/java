package org.prakash.bitmagic;

public class SwapEvenAndOddBits {
    public static void main(String[] args) {
        int x = 23; // 00010111

        // Output is 43 (00101011)
        System.out.println(swapBits(x));
    }

    // Function to swap odd and even bits
    public static int swapBits(int n) {

        // Odd bits
        int evenBits = n & 0xAAAAAAAA;

        // Odd bits
        int oddBits = n & 0x55555555;

        // Right shift even bits;
        evenBits >>= 1;

        oddBits <<= 1;

        // Merge and return;
        return evenBits | oddBits;

    }
}
