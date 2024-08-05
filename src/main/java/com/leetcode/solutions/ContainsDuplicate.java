package com.leetcode.solutions;

import java.util.*;

public class ContainsDuplicate {
    public static boolean checkForDuplicates(int[] elements) {
        Set<Integer> tracker = new HashSet<>();
        return Arrays.stream(elements).anyMatch(element -> !tracker.add(element));
    }
}
