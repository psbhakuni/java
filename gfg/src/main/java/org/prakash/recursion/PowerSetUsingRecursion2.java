package org.prakash.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PowerSetUsingRecursion2 {
    static void printSub(String str, String curr, int index)
    {
        if(index == str.length())
        {
            System.out.print(curr+" ");
            return;
        }

        printSub(str, curr, index + 1);
        printSub(str, curr+str.charAt(index), index + 1);
    }
    public static void main(String [] args)
    {
        String str = "ABC";

        printSub(str, "", 0);

    }
}
