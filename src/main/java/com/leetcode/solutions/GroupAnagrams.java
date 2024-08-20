package com.leetcode.solutions;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramStore = new HashMap<>();
        for (String word : words) {
            char[] wordAsChars = word.toCharArray();
            Arrays.sort(wordAsChars);
            String sortedString = new String(wordAsChars);
            List<String> anagramGroup = new ArrayList<>();
            if (anagramStore.containsKey(sortedString)) {
                anagramGroup = anagramStore.get(sortedString);
            }
            anagramGroup.add(word);
            anagramStore.put(sortedString, anagramGroup);
        }
        return new ArrayList<>(anagramStore.values());
    }
}
