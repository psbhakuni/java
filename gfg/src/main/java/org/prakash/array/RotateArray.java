package org.prakash.array;

import java.util.Arrays;
import java.util.stream.Stream;


/**
 * Rotate Array
 * ----------------------
 * Given an unsorted array arr[] of size N, rotate it by D elements in
 * the counter-clockwise direction.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5, D = 2
 * arr[] = {1,2,3,4,5}
 * Output: 3 4 5 1 2
 * Explanation: 1 2 3 4 5  when rotated
 * by 2 elements, it becomes 3 4 5 1 2.
 * Example 2:
 *
 * Input:
 * N = 10, D = 3
 * arr[] = {2,4,6,8,10,12,14,16,18,20}
 * Output: 8 10 12 14 16 18 20 2 4 6
 * Explanation: 2 4 6 8 10 12 14 16 18 20
 * when rotated by 3 elements, it becomes
 * 8 10 12 14 16 18 20 2 4 6.
 *
 *
 * Your Task:
 * Complete the function rotateArr() which takes the array, D and N as
 * input parameters and rotates the array by D elements. The array must
 * be modified in-place without using extra space.
 *
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 *
 */
public class RotateArray {
    public static void main(String[] args) {
        int N = 10, D = 3;
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        rotateArr(arr, D, N);

        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    }

    //Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n){
        int[] temporaryArr = new int[d];

        for(int i = 0; i < d; i ++ ) {
            temporaryArr[i] = arr[i];
        }

        for(int i = d; i < n; i ++ ) {
            arr[i-d] = arr[i];
        }

        for(int i = n-d; i < n; i++) {
            arr[i] = temporaryArr[i-(n-d)];
        }
    }
}