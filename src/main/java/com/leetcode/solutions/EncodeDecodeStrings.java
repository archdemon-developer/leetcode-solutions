package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {

    public static String encode(List<String> strings) {
        StringBuilder encodedString = new StringBuilder();
        for(String string : strings) {
            encodedString.append(string.length()).append("$").append(string);
        }
        return encodedString.toString();
    }

    public static List<String> decode(String string) {
        List<String> output = new ArrayList<>();
        int i = 0;
        while(i < string.length()) {
            int idxOfHash = string.indexOf("$", i);
            int length = Integer.parseInt(string.substring(i, idxOfHash));
            String currentString = string.substring(idxOfHash + 1, idxOfHash + length + 1);
            output.add(currentString);
            i = length + idxOfHash + 1;
        }
        return output;
    }
}
