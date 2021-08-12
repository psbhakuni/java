package org.prakash.array;

/**
 * Minimum adjacent difference in a circular array
 * ---------------------------------------------------
 *
 * Given an array Arr of n integers arranged in a circular fashion. Your
 * task is to find the minimum absolute difference between adjacent elements.
 *
 * Example 1:
 *
 * Input:
 * n = 7
 * Arr[] = {8,-8,9,-9,10,-11,12}
 * Output: 4
 * Explanation: The absolute difference
 * between adjacent elements in the given
 * array are as such: 16 17 18  19 21 23 4
 * (first and last). Among the calculated
 * absolute difference the minimum is 4.
 * Example 2:
 *
 * Input:
 * n = 8
 * Arr[] = {10,-3,-4,7,6,5,-4,-1}
 * Output: 1
 * Explanation: The absolute difference
 * between adjacent elements in the given
 * array are as such: 13 1 11 1 1 9 3 11
 * (first and last).  Among the calculated
 * absolute difference, the minimum is 1.
 * Your Task:
 * The task is to complete the function minAdjDiff() which returns the
 * minimum difference between adjacent elements in circular array.
 *
 * Expected Time Complexity: O(n).
 * Expected Auxiliary Space: O(1).
 *
 */
public class MinimumAdjacentDifferenceInCircularArray {
    public static void main(String[] args) {
        //int n = 7;
        //int arr[] = {8,-8,9,-9,10,-11,12};

        int n = 8;
        int arr[] = {10,-3,-4,7,6,5,-4,-1};

        System.out.println(minAdjDiff(arr, n));
    }

    //method to find minimum adjacent difference in a circular array.
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        int minimumDiff = -1;
        for(int i=0; i < n ; i++) {
            final int currentDiff = Math.abs(arr[i] - arr[(i + 1) % n]);
            //System.out.print("currentDiff : " + currentDiff + "; minimumDiff : "+ minimumDiff);
            if(minimumDiff == -1 || currentDiff < minimumDiff) {
                minimumDiff = currentDiff;
            }
            //System.out.println(";  minimumDiff updated to: "+ minimumDiff);
        }
        return minimumDiff;
    }
}
