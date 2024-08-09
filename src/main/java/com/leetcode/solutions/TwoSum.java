package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] computeSumToTargetSubArray(int[] numbers, int target) {
        if(numbers == null) {
            return null;
        }

        if(numbers.length < 2) {
            return new int[] {};
        }

        Map<Integer, Integer> tracker = new HashMap<>();
        for (int idx = 0; idx < numbers.length; idx++) {
            if (tracker.containsKey(numbers[idx])) {
                return new int[]{idx, tracker.get(numbers[idx])};
            } else {
                tracker.put(target - numbers[idx],  idx);
            }
        }
        return new int[] {};
    }
}
