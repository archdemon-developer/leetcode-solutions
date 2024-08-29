package com.leetcode.solutions;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramStore = new HashMap<>();
        for (String word : words) {
            char[] wordAsChars = word.toCharArray();
            Arrays.sort(wordAsChars);
            String sortedString = new String(wordAsChars);
            anagramStore.computeIfAbsent(sortedString, key -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(anagramStore.values());
    }
}
