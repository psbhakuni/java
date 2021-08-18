package org.prakash.array;

import java.util.Arrays;

/**
 * Given n integer ranges, the task is to find the maximum occurring integer in
 * these ranges. If more than one such integer exits, find the smallest one. The
 * ranges are given as two arrays L[] and R[].  L[i] consists of starting point of
 * range and R[i] consists of corresponding end point of the range.
 *
 * For example consider the following ranges.
 * L[] = {2, 1, 3}, R[] = {5, 3, 9)
 * Ranges represented by above arrays are.
 * [2, 5] = {2, 3, 4, 5}
 * [1, 3] = {1, 2, 3}
 * [3, 9] = {3, 4, 5, 6, 7, 8, 9}
 * The maximum occurred integer in these ranges is 3.
 *
 * Example 1:
 *
 * Input:
 * n = 4
 * L[] = {1,4,3,1}
 * R[] = {15,8,5,4}
 * Output: 4
 * Explanation: The given ranges are [1,15]
 *  [4, 8] [3, 5] [1, 4]. The number that
 * is most common or appears most times in
 * the ranges is 4.
 * Example 2:
 *
 * Input:
 * n = 5
 * L[] = {1,5,9,13,21}
 * R[] = {15,8,12,20,30}
 * Output: 5
 * Explanation: The given ranges are
 * [1,15] [5, 8] [9, 12] [13, 20]
 * [21, 30]. The number that is most
 * common or appears most times in
 * the ranges is 5.
 *
 * Your Task:
 * The task is to complete the function maxOccured() which returns the maximum
 * occurred integer in all ranges.
 *
 * Expected Time Complexity: O(n+maxx).
 * Expected Auxiliary Space: O(maxx).
 * -maxx is maximum element in R[]
 *
 */
public class MaximumOccurredInteger {
    public static void main(String[] args) {

        int n = 4;
        int L[] = {1,4,3,1};
        int R[] = {15,8,5,4};
        int maxx = 15;

        /*
        int n = 5;
        int L[] = {1,5,9,13,21};
        int R[] = {15,8,12,20,30};
        int maxx = 30;
        */

        /*
        int n = 2;
        int L[] = {0, 0};
        int R[] = {1, 1};
        int maxx = 1;
        */

        System.out.println(maxOccured(L, R, n, Arrays.stream(R).max().getAsInt()+1));
    }

    public static int maxOccured(int L[], int R[], int n, int maxx) {
        int maxOccured = -1;
        int arr[] = new int[maxx+1];
        int indexWithMaxOccurrences = -1;
        int maxSum = -1;

        for(int i = 0; i < n; i++ ) {
            arr[L[i]]++;
            arr[R[i]+1]--;
        }

        //Create prefix sum array
        for( int i = 0; i < maxx + 1; i++) {
            if(i > 0 ) {
                arr[i] = arr[i] + arr[i - 1];
            }
            if(maxSum < arr[i]) {
                maxSum = arr[i];
                indexWithMaxOccurrences = i;
            }
        }

        return indexWithMaxOccurrences;
    }
}
