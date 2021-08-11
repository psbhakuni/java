package org.prakash.array;

import java.util.ArrayList;

/**
 * Given an array arr[] of size N of positive integers which may
 * have duplicates. The task is to find the maximum and second
 * maximum from the array, and both of them should be distinct,
 * so If no second max exists, then the second max will be -1.
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * arr[] = {2,1,2}
 * Output: 2 1
 * Explanation: From the given array
 * elements, 2 is the largest and 1
 * is the second largest.
 * Example 2:
 *
 * Input:
 * N = 5
 * arr[] = {1,2,3,4,5}
 * Output: 5 4
 * Explanation: From the given array
 * elements, 5 is the largest and 4
 * is the second largest.
 * Your Task:
 * The task is to complete the function largestAndSecondLargest(),
 * which should return maximum and second maximum element from the
 * array with first element as maximum element and second element as
 * second maximum(if there is no second maximum the  second element should be -1)
 *
 */
public class MaxAndSecondMax {
    public static void main(String[] args) {
       // int N = 3;
       // int arr[] = {2,1,2};

        int N = 5;
        int arr[] = {5,5,5,5,5};

        System.out.println(largestAndSecondLargest(N, arr));
    }

    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] != largest &&  arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return new ArrayList<Integer>(java.util.Arrays.asList(new Integer[]{largest, secondLargest}));

    }
}
