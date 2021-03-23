package org.prakash.bitmagic;

public class IsKthBitSet {
    public static void main(String[] args) {
       //Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter the number: ");
         //scanner.nextInt();

        int n = 4;       int k = 0;


       // int n = 4;      int k = 2;

        //int n = 500;  int k = 3;
        System.out.println(checkKthBit(n, k));
    }

    static boolean checkKthBit(int n, int k){
        System.out.println("(n, k) : ("+ n + ", "+ k+")");
        long twoPowerK = (long)Math.pow(2,k);
        System.out.println("twoPowerK : "+ twoPowerK);
        System.out.println("(n|twoPowerK) : "+ (n|twoPowerK));

        if((n|twoPowerK) > n) {
            return false;
        }
        return true;

    }
}
