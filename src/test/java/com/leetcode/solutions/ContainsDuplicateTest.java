package com.leetcode.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {

    @Test
    public void testNoElements() {
        assertFalse(ContainsDuplicate.checkForDuplicates(new int[] {}));
    }

    @Test
    public void testForContainsDuplicate() {
        int[] elements = { 1, 2, 2, 4 };
        assertTrue(ContainsDuplicate.checkForDuplicates(elements));
    }

    @Test
    public void testDoesNotContainDuplicate() {
        int[] elements = { 1, 2, 3, 4};
        assertFalse(ContainsDuplicate.checkForDuplicates(elements));
    }

    @Test
    public void testIfOneElementPresent() {
        int[] elements = { 1 };
        assertFalse(ContainsDuplicate.checkForDuplicates(elements));
    }
}
