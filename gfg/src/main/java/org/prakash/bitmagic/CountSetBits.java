package org.prakash.bitmagic;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 17;
        //System.out.println(countSetBits(n));
        //int count =0;
        //for (int i = 1; i <= n; i++){
        // count+=countSetBits(i);
        //}
        //System.out.println("Count: " + countSetBits(n));
        System.out.println("Count_new:" + countSetBitsEfficient(n));
    }

    static int countSetBits(int n) {
        System.out.println("n: " + n);
        int count = 0;
        if (n == 0) {
            return 0;
        }
        int num = n;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count + countSetBits(num - 1);
    }

    static int countSetBitsEfficient(int n) {

        // Ignore 0 as all the bits are unset
        n++;

        // To store the powers of 2
        int powerOf2 = 2;

        // To store the result, it is initialized
        // with n/2 because the count of set
        // least significant bits in the integers
        // from 1 to n is n/2
        int count = n / 2;

        // Loop for every bit required to represent n
        while (powerOf2 <= n) {

            // Total count of pairs of 0s and 1s
            int totalPairs = n / powerOf2;

            // totalPairs/2 gives the complete
            // count of the pairs of 1s
            // Multiplying it with the current power
            // of 2 will give the count of
            // 1s in the current bit
            count += (totalPairs / 2) * powerOf2;

            // If the count of pairs was odd then
            // add the remaining 1s which could
            // not be grouped together
            count += (totalPairs % 2 == 1) ?
                    (n % powerOf2) : 0;

            // Next power of 2
            powerOf2 <<= 1;
        }

        // Return the result
        return count;
    }

}
