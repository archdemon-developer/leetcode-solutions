package com.leetcode.solutions;

import com.leetcode.solutions.EncodeDecodeStrings;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodeDecodeStringsTest {

    @Test
    public void testEncodeDecodeBasic() {
        List<String> input = Arrays.asList("hello", "world");
        String encoded = EncodeDecodeStrings.encode(input);
        List<String> decoded = EncodeDecodeStrings.decode(encoded);
        assertEquals(input, decoded, "Decoded output should match the original input");
    }

    @Test
    public void testEncodeDecodeWithEmptyStrings() {
        List<String> input = Arrays.asList("", "test", "", "");
        String encoded = EncodeDecodeStrings.encode(input);
        List<String> decoded = EncodeDecodeStrings.decode(encoded);
        assertEquals(input, decoded, "Decoded output should match the original input with empty strings");
    }

    @Test
    public void testEncodeDecodeWithSpecialCharacters() {
        List<String> input = Arrays.asList("hello!", "what's up?", "this is a test");
        String encoded = EncodeDecodeStrings.encode(input);
        List<String> decoded = EncodeDecodeStrings.decode(encoded);
        assertEquals(input, decoded, "Decoded output should handle special characters correctly");
    }

    @Test
    public void testEncodeDecodeWithSingleCharacterStrings() {
        List<String> input = Arrays.asList("a", "b", "c");
        String encoded = EncodeDecodeStrings.encode(input);
        List<String> decoded = EncodeDecodeStrings.decode(encoded);
        assertEquals(input, decoded, "Decoded output should handle single character strings correctly");
    }

    @Test
    public void testEncodeDecodeWithMixedContent() {
        List<String> input = Arrays.asList("123", "!@#", " ", "\t", "\n");
        String encoded = EncodeDecodeStrings.encode(input);
        List<String> decoded = EncodeDecodeStrings.decode(encoded);
        assertEquals(input, decoded, "Decoded output should handle mixed content correctly");
    }

    @Test
    public void testEncodeDecodeWithOnlyEmptyStrings() {
        List<String> input = Arrays.asList("", "", "");
        String encoded = EncodeDecodeStrings.encode(input);
        List<String> decoded = EncodeDecodeStrings.decode(encoded);
        assertEquals(input, decoded, "Decoded output should match the original input with only empty strings");
    }

    @Test
    public void testEncodeDecodeWithLongStrings() {
        List<String> input = Arrays.asList("a".repeat(1000), "b".repeat(2000));
        String encoded = EncodeDecodeStrings.encode(input);
        List<String> decoded = EncodeDecodeStrings.decode(encoded);
        assertEquals(input, decoded, "Decoded output should handle long strings correctly");
    }

    @Test
    public void testEncodeDecodeWithEmptyList() {
        List<String> input = Collections.emptyList();
        String encoded = EncodeDecodeStrings.encode(input);
        List<String> decoded = EncodeDecodeStrings.decode(encoded);
        assertEquals(input, decoded, "Decoded output should match the original empty list input");
    }
}
