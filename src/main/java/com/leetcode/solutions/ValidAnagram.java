package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String first, String second) {
        if(first == null || second == null) {
            return false;
        }

        if(first.length() != second.length()) {
            return false;
        }

        Map<Character, Integer> tracker = new HashMap<>();

        for(int idx = 0; idx < first.length(); idx++) {
            if(!tracker.containsKey(first.charAt(idx))) {
                tracker.put(first.charAt(idx), 1);
            } else {
                tracker.put(first.charAt(idx), tracker.get(first.charAt(idx)) + 1);
            }
        }

        for(int idx = 0; idx < second.length(); idx++) {
            if(tracker.containsKey(second.charAt(idx))) {
                tracker.put(second.charAt(idx), tracker.get(second.charAt(idx)) - 1);
            }
        }

        for(char character : tracker.keySet()) {
            if(tracker.get(character) != 0) {
                return false;
            }
        }

        return true;
    }
}
