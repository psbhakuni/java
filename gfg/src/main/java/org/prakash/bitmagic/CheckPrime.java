package org.prakash.bitmagic;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 5;
        int n1 = 192;

        //System.out.println(isPrime(n));
        // System.out.println(isPrime(n1));

        // getDivisors(33);
        System.out.println();
        //System.out.println("Count of numbers < n with exactly 3 divisors : "+ exactly3Divisors(100));
        System.out.println("Count of numbers < n with exactly 3 divisors : "+ numbersWith3Divisors(100));
        //numbersWith3Divisors(100);
    }

    /*
    private static boolean isPrime(int n) {

         if (n <= 1) {
             return false;
         }

         if (n <= 3) {
             return true;
         }

         if ((n % 2 == 0) || (n % 3 == 0)) {
             return false;
         }
         for (int i = 5; i < n / 2; i = i + 6) {
             if (n % i == 0 || n % (i + 2) == 0) {
                 return false;
             }
         }
         return true;
     }
 */
    private static int getDivisors(int n) {
        int count = 0;
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                // System.out.print(i + " ");
                count++;
            }
        }
        for (int i = (int) Math.sqrt(n);
             i >= 1; i--) {
            if (n % i == 0) {
                // System.out.print(i + " ");
                count++;
            }
        }

        return count;
    }

    private static int exactly3Divisors(int n) {
        int count = 0;

        for (int i = 4; i <= n; i++) {
            int num = getDivisors(i);
            if (num == 3) {
                System.out.println("#" + i);
                count++;
            }
        }
        return count;
    }

    // is less than or equal to
    // the given number
    static int numbersWith3Divisors(int n) {
       int count =0;

        for (int i = 2; i * i <= n; i++) {
            // Check prime
            if (isPrime(i)) {
                if (i * i <= n) {
                    //System.out.print(i * i + " ");
                    count++;
                }
            }
        }

        return count;
    }

    // Check if a number is prime or not
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
