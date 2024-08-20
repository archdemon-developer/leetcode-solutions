package com.leetcode.solutions;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupAnagramsTest {

    @Test
    public void testGroupAnagrams_basicCase() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("tan", "nat"),
                List.of("bat")
        );
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);
        assertTrue(expected.containsAll(result));
    }

    @Test
    public void testGroupAnagrams_emptyInput() {
        String[] input = {};
        List<List<String>> expected = Collections.emptyList();
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);
        assertTrue(expected.containsAll(result));
    }

    @Test
    public void testGroupAnagrams_singleCharacter() {
        String[] input = {"a", "b", "c"};
        List<List<String>> expected = Arrays.asList(
                List.of("a"),
                List.of("b"),
                List.of("c")
        );
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);
        assertTrue(expected.containsAll(result));
    }

    @Test
    public void testGroupAnagrams_sameAnagrams() {
        String[] input = {"abc", "bca", "cab", "xyz", "zyx", "yxz"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("abc", "bca", "cab"),
                Arrays.asList("xyz", "zyx", "yxz")
        );
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);
        assertTrue(expected.containsAll(result));
    }

    @Test
    public void testGroupAnagrams_duplicates() {
        String[] input = {"a", "a", "b", "b"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a", "a"),
                Arrays.asList("b", "b")
        );
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);
        assertTrue(expected.containsAll(result));
    }
}
