package org.prakash.bitmagic;

public class BinaryToGrey {
    public static void main(String[] args) {
        System.out.println(" Binary to grey : " + greyConverter(10));
    }

    //  Function to find the gray code of given number n
    public static int greyConverter(int n) {
        return n ^ (n >> 1);
    }
}
