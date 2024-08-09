package com.leetcode.solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TwoSumTest {

    @Test
    public void testNoElementsPassed() {
        int[] output = TwoSum.computeSumToTargetSubArray(new int[] {}, 0);
        assertEquals(0, output.length);
    }

    @Test
    public void testSubArrayFound() {
        int[] output = TwoSum.computeSumToTargetSubArray(new int[]{1, 2, 7, 3}, 9);
        Arrays.sort(output);
        assertEquals(2, output.length);
        assertEquals(1, output[0]);
        assertEquals(2, output[1]);
    }

    @Test
    public void testSubArrayNotFound() {
        int[] output = TwoSum.computeSumToTargetSubArray(new int[] { 1, 2, 7, 3}, 1000);
        assertEquals(0, output.length);
    }

    @Test
    public void testNullArray() {
        assertNull(TwoSum.computeSumToTargetSubArray(null, 0));
    }
}
