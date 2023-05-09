package com.jamison.leetCode75;

import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    static public String reverseWords(String s) {
        String sTrim = s.trim();
        String[] strings = sTrim.split("\\s+");
        List<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, strings);
        Collections.reverse(wordList);
        return  String.join(" ", wordList);
    }
}
