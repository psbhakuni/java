package org.prakash.array;

/**
 * Given an array arr[] of size N and two elements x and y,
 * use counter variables to find which element appears most
 * in the array, x or y. If both elements have the same frequency,
 * then return the smaller element.
 * Note:  We need to return the element, not its count.
 *
 * Example 1:
 *
 * Input:
 * N = 11
 * arr[] = {1,1,2,2,3,3,4,4,4,4,5}
 * x = 4, y = 5
 * Output: 4
 * Explanation:
 * frequency of 4 is 4.
 * frequency of 5 is 1.
 *
 *
 * Example 2:
 *
 * Input:
 * N = 8
 * arr[] = {1,2,3,4,5,6,7,8}
 * x = 1, y = 7
 * Output: 1
 * Explanation:
 * frequency of 1 is 1.
 * frequency of 7 is 1.
 * Since 1 < 7, return 1.
 *
 *
 * Your Task:
 * You don't need to read input or print anything. Complete
 * the function majorityWins() that takes array, n, x, y as
 * input parameters and return the element with higher frequency.
 */
public class WhoHasTheMajority {
    public static void main(String[] args) {
        /*int N = 11;
        int arr[] = {1,1,2,2,3,3,4,4,4,4,5};
        int x = 4, y = 5;
*/
        int N = 8;
        int arr[] = {5,22, 29, 12, 1, 32, 69, 1, 75};
        int x = 29, y = 96;
        System.out.println(majorityWins(arr, N, x, y));

    }

    // Function to find element with more appearances between two elements in an
    // array.
    public static int majorityWins(int arr[], int n, int x, int y) {
        int xCount = 0;
        int yCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                xCount++;
            } else if (arr[i] == y) {
                yCount++;
            }
        }

        if (xCount == yCount) {
            return java.lang.Math.min(x, y);
        } else {
            return (xCount > yCount ? x : y);
        }
    }

}
