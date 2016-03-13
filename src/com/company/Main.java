
package com.company;
import java.util.*;

//Given two strings, write a method to decide if one is a permutation of the other

public class Main {

    public static void main(String[] args) {
        System.out.println(isPermutation("cat", "tac"));
    }

    public static boolean isPermutation(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }

        return sort(s).equals(sort(t));
    }

    public static String sort(String s)
    {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

}
