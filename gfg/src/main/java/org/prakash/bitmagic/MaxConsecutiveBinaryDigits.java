package org.prakash.bitmagic;

public class MaxConsecutiveBinaryDigits {
    public static void main(String[] args) {
       // int n = 14; // Ans 3
        //int n = 222; // Ans 4
        //int n 11; // Ans 2;
        //int n = 251; // 11111011  Ans 5
        int n = 215; // 11010111  Ans 3
        System.out.println("maxConsecutiveOnes : "+ maxConsecutiveOnes(n));
    }

    /*  Function to calculate the longest consecutive ones
     *   N: given input to calculate the longest consecutive ones
     */
    public static int maxConsecutiveOnes(int n) {
        int prevCount = 0;
        int currCount = 0;
        while(n > 0){
            // If If n is even
            if((n & 1) == 1){
                currCount++;
            } else {
                currCount =0;
            }

            if(currCount > prevCount){
                prevCount = currCount;
            }

            System.out.println(" n , prevOCunt, CurrCOunt"+n + ", "+ prevCount + ", "+ currCount );

            n = n/2;
        }

        return prevCount;

    }
}
