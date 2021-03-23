package org.prakash.bitmagic;

public class GetFirstSetBit {
    public static void main(String[] args) {
        int n = 12;
        int count =0;
        while(n>=1){
            int k = n>>1;
            count++;
            if(k == n/2 && (n - n/2 == k+1)){
                System.out.println("count : "+ count);
                break;
            }
            n = k;
        }
    }
}
