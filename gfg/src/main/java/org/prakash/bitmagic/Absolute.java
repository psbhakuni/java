package org.prakash.bitmagic;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.math.BigDecimal.valueOf;

public class Absolute {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter the number: ");
        int number = 32; //scanner.nextInt();
        System.out.println(Math.abs(number));
        System.out.println(((9 * number) / 5) + 32);
        //System.out.println(quadraticRoots(1, -2, 1));
       // System.out.println(quadraticRoots(1, -7, 12));
        System.out.println(quadraticRoots(752, 904, 164));

    }

    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // Roots of equation x2-2x+1 are 1 and 1.
        ArrayList<Integer> roots = new ArrayList<Integer>();

        BigDecimal big_a = valueOf(a);
        BigDecimal big_b = valueOf(b);
        BigDecimal big_c = valueOf(c);


        BigDecimal discriminator = big_a.multiply(big_b).subtract(valueOf(4).multiply(big_a.multiply(big_c)));
        if (discriminator.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Imaginary");
        } else if( discriminator.equals(BigDecimal.ZERO)) {
            roots.add(-b / (2 * a));
            roots.add(-b / (2 * a));
        } else if (discriminator.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal root1 = (BigDecimal.valueOf(-b).add(discriminator.sqrt(new MathContext(10)))).divide(BigDecimal.valueOf(2).multiply(big_a), 2, RoundingMode.HALF_DOWN);
            BigDecimal root2 = (BigDecimal.valueOf(-b).subtract(discriminator.sqrt(new MathContext(10)))).divide(BigDecimal.valueOf(2).multiply(big_a), 2, RoundingMode.HALF_DOWN);
            roots.add(root1.intValue());
            roots.add(root2.intValue());
        }

        return roots;
    }
}
