package org.prakash.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSetUsingRecursion {
    public static void main(String[] args) {
        List str = powerSet("abc");
        System.out.println(str.stream().map(Object::toString).collect(java.util.stream.Collectors.joining(", ")));
    }

    private static ArrayList<String> powerSet(String str) {
        // System.out.println("--- str: "+str);

        if(str.length() < 2) {
            return new ArrayList<String>(Arrays.asList(str));
        }

        int endIndex = str.length() - 1;
        //System.out.println("endIndex : "+ endIndex);

        ArrayList<String> powerSetWithoutLastChar  = powerSet(str.substring(0, endIndex));
        //System.out.println("1. powerSetWithoutLastChar : " + powerSetWithoutLastChar);
        char lastChar = str.charAt(str.length()-1);

        assert powerSetWithoutLastChar != null;
        ArrayList<String> powerSetWithoutLastCharPlusLastChar = (ArrayList<String>) powerSetWithoutLastChar
                .stream()
                .map(s -> s + lastChar)
                .collect(java.util.stream.Collectors.toList());

        //System.out.println("# powerSetWithoutLastCharPlusLastChar : " + powerSetWithoutLastCharPlusLastChar);
        powerSetWithoutLastChar.addAll(powerSetWithoutLastCharPlusLastChar);
        //System.out.println("2. powerSetWithoutLastChar : " + powerSetWithoutLastChar);

        powerSetWithoutLastChar.add(lastChar+"");
        //System.out.println("3. powerSetWithoutLastChar : " + powerSetWithoutLastChar);

        return powerSetWithoutLastChar;
    }
}
