package org.prakash.array;

import com.google.common.collect.Lists;

import java.util.*;

/**
 * Reverse array in groups:
 * ------------------------------
 * Given an array arr[] of positive integers of size N. Reverse every
 * sub-array group of size K.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5, K = 3
 * arr[] = {1,2,3,4,5}
 * Output: 3 2 1 5 4
 * Explanation: First group consists of elements
 * 1, 2, 3. Second group consists of 4,5.
 *
 *
 * Example 2:
 *
 * Input:
 * N = 4, K = 3
 * arr[] = {5,6,8,9}
 * Output: 8 6 5 9
 *
 *
 * Your Task:
 * You don't need to read input or print anything. The task is to complete
 * the function reverseInGroups() which takes the array, N and K as input
 * parameters and modifies the array in-place.
 *
 */
public class ReverseArrayInGroups {
    public static void main(String[] args) {
        //int N = 5, K = 3;
        //Integer arr[] = {1,2,3,4,5};
        int N = 4, K = 3;
        Integer arr[] = {5,6,8,9};

        List<Integer> integerList = new ArrayList<Integer>();
        Collections.addAll(integerList, arr);

       reverseInGroups((ArrayList<Integer>) integerList, arr.length, K);
       System.out.println(integerList);
    }

    //Function to reverse every sub-array group of size k.
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i = 0; i < n; i = i+k) {
            int endIndex = java.lang.Math.min(i + k-1, n-1);
            int mid = (i + endIndex)/2;
            for(int left = i, right = endIndex; left <= mid; left++, right--) {
                // swap arr[left] and arr[right]
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
            }
        }
    }
}
