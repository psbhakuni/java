package org.prakash.array;

/**
 * Strongest Neighbour
 * ------------------------
 * Given an array arr[] of n positive integers. The task is to
 * find the maximum for every adjacent pairs in the array.
 *
 * Example 1:
 *
 * Input:
 * n = 6
 * arr[] = {1,2,2,3,4,5}
 * Output: 2 2 3 4 5
 * Explanation: Maximum of arr[0] and arr[1]
 * is 2, that of arr[1] and arr[2] is 2, ...
 * and so on. For last two elements, maximum
 * is 5.
 * Example 2:
 *
 * Input:
 * n = 2
 * arr[] = {5, 5}
 * Output: 5
 * Explanation: We only have two elements
 * so max of 5 and 5 is 5 only.
 * Your Task:
 * The task is to complete the function maximumAdjacent(), which takes
 * sizeOfArray (n) and array(arr) as parameters and prints the maximum
 * of all adjacent pairs (space separated).
 */
public class StrongestNeighbour {
    public static void main(String[] args) {
        //int n = 6;
        //int[] arr = {1,2,2,3,4,5};

        // int n = 2;
        //int[] arr = {5, 5 };

        int n = 3;
        int[] arr = {89, 89, 60};

        maximumAdjacent(n, arr);
    }

    /**
     * Function to find maximum for every adjacent pairs in the array.
     * <p>
     * Function should print max adjacent for all pairs
     * Use string buffer for fast output
     *
     * @param sizeOfArray
     * @param arr
     */
    static void maximumAdjacent(int sizeOfArray, int arr[]) {
        StringBuffer buffer = new StringBuffer("");

        for (int i = 1; i < sizeOfArray; i++) {
            buffer.append(java.lang.Math.max(arr[i - 1], arr[i]));
            if (i != sizeOfArray - 1) {
                buffer.append(" ");
            }
        }

        System.out.println(buffer);
    }

    // Function to find maximum for every adjacent pairs in the array.
    static void maximumAdjacentCompact(int sizeOfArray, int arr[]) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < sizeOfArray - 1; i = i + 1) {
            buffer.append(Math.max(arr[i], arr[i + 1])).append(" ");
        }
        System.out.print(buffer);

    }
}
