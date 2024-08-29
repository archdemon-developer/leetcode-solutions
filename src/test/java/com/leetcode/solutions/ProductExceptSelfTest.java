package com.leetcode.solutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductExceptSelfTest {

    ProductExceptSelf solution = new ProductExceptSelf();

    @Test
    void testProductExceptSelf_AllPositiveNumbers() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, solution.findProductExceptSelf(input), "Failed on all positive numbers");
    }

    @Test
    void testProductExceptSelf_ContainsZero() {
        int[] input = {1, 2, 0, 4};
        int[] expected = {0, 0, 8, 0};
        assertArrayEquals(expected, solution.findProductExceptSelf(input), "Failed on input containing zero");
    }

    @Test
    void testProductExceptSelf_ContainsMultipleZeros() {
        int[] input = {0, 0, 3, 4};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, solution.findProductExceptSelf(input), "Failed on input containing multiple zeros");
    }

    @Test
    void testProductExceptSelf_SingleElement() {
        int[] input = {10};
        int[] expected = {1};  // With one element, the product of all except self is 1
        assertArrayEquals(expected, solution.findProductExceptSelf(input), "Failed on single element input");
    }

    @Test
    void testProductExceptSelf_EmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, solution.findProductExceptSelf(input), "Failed on empty array input");
    }

    @Test
    void testProductExceptSelf_NullArray() {
        int[] expected = {0};
        assertArrayEquals(expected, solution.findProductExceptSelf(null));
    }


    @Test
    void testProductExceptSelf_NegativeNumbers() {
        int[] input = {-1, 2, -3, 4};
        int[] expected = {-24, 12, -8, 6};
        assertArrayEquals(expected, solution.findProductExceptSelf(input), "Failed on negative numbers input");
    }

    @Test
    void testProductExceptSelf_ContainsOne() {
        int[] input = {1, 2, 3, 1};
        int[] expected = {6, 3, 2, 6};
        assertArrayEquals(expected, solution.findProductExceptSelf(input), "Failed on input containing one");
    }
}
