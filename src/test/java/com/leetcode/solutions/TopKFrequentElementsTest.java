package com.leetcode.solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.leetcode.solutions.TopKFrequentElements.findTopKFrequentElements;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TopKFrequentElementsTest {
    @Test
    public void testTopKFrequent_withMultipleFrequencies() {
        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;
        int[] expected = {2, 3};
        int[] result = findTopKFrequentElements(nums, k);
        Arrays.sort(expected);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTopKFrequent_withSingleElement() {
        int[] nums = {7, 7};
        int k = 1;
        int[] expected = {7};
        int[] result = findTopKFrequentElements(nums, k);
        Arrays.sort(expected);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTopKFrequent_withAllUniqueElements() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int[] result = findTopKFrequentElements(nums, k);
        List<Integer> resultList = Arrays.asList(result[0], result[1], result[2]);
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(expectedList.containsAll(resultList));
    }

    @Test
    public void testTopKFrequent_withNegativeElements() {
        int[] nums = {-1, -1, -2, -2, -2, -3};
        int k = 2;
        int[] expected = {-2, -1};
        int[] result = findTopKFrequentElements(nums, k);
        Arrays.sort(expected);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTopKFrequent_withLargeKValue() {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int k = 3;
        int[] expected = {2, 3, 4};
        int[] result = findTopKFrequentElements(nums, k);
        Arrays.sort(result);
        Arrays.sort(expected);
        assertArrayEquals(expected, result);
    }
}
