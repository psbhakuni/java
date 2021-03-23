package org.prakash.bitmagic;

public class GreyToBinary {
    public static void main(String[] args) {
        System.out.println(" Binary to grey : " + grayToBinary(150));
    }

    // function to convert a given Gray equivalent n to Binary equivalent.
    static int grayToBinary(int n) {

        int binaryEquivalent = 0;

        // Do n>>1 and greyEquivalent ^ n until n becomes 0.
        for (; n != 0; n = n >> 1)
            binaryEquivalent ^= n;

        return binaryEquivalent;

    }

}
