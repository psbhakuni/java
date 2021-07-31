package org.prakash.recursion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PowerUsingRecursion {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        String delim = ", ";

        String res = list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(delim));

        System.out.println(res);
        //System.out.println(RecursivePower(9, 9));
    }
    static int RecursivePower(int n,int p) {
        if( p == 0) {
            return 1;
        }
        return n * RecursivePower(n, p - 1);
    }
}
