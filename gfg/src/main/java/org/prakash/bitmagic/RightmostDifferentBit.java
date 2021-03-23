package org.prakash.bitmagic;

public class RightmostDifferentBit {
    public static void main(String[] args) {
        int m = 11;
        int n = 9;
        int count =0;
        m = m^n;
        while(m>=1) {
            int k = m >> 1;
            count++;
            if (k == m / 2 && (m - m / 2 == k + 1)) {
                System.out.println("count : " + count);
                break;
            }
            m = k;
        }
    }
}
