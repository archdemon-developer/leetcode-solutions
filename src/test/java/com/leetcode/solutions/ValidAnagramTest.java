package com.leetcode.solutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramTest {

    @Test
    public void testAnagrams() {
        ValidAnagram checker = new ValidAnagram();
        assertTrue(checker.isAnagram("racecar", "carrace"));
        assertFalse(checker.isAnagram("jar", "jam"));
        assertTrue(checker.isAnagram("listen", "silent"));
        assertFalse(checker.isAnagram("hello", "billion"));
        assertTrue(checker.isAnagram("a", "a"));
        assertFalse(checker.isAnagram("a", "b"));
        assertTrue(checker.isAnagram("anagram", "nagaram"));
        assertFalse(checker.isAnagram("rat", "car"));
    }

    @Test
    public void testEmptyStrings() {
        ValidAnagram checker = new ValidAnagram();
        assertTrue(checker.isAnagram("", ""));
    }

    @Test
    public void testDifferentLengths() {
        ValidAnagram checker = new ValidAnagram();
        assertFalse(checker.isAnagram("abcd", "abc"));
    }
}
