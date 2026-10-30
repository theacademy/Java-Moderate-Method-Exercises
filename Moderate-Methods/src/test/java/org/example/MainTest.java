package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void secondLargestReturnsSecondDistinctValue() {
        assertEquals(7, Main.secondLargest(new int[]{3, 5, 7, 2, 8, 1}));
        assertEquals(4, Main.secondLargest(new int[]{5, 5, 4}));
        assertEquals(-5, Main.secondLargest(new int[]{-5, -2, -8}));
    }

    @Test
    void removeDuplicatesPreservesFirstOccurrenceOrder() {
        assertArrayEquals(
                new int[]{9, 2, 3, 4},
                Main.removeDuplicates(new int[]{9, 2, 3, 2, 4, 9})
        );
        assertArrayEquals(new int[0], Main.removeDuplicates(new int[0]));
    }

    @Test
    void countOccurrencesCountsEachDistinctValue() {
        Map<Integer, Integer> expected = Map.of(2, 3, 4, 1, 7, 2);

        assertEquals(expected, Main.countOccurrences(new int[]{2, 7, 2, 4, 7, 2}));
        assertEquals(new HashMap<>(), Main.countOccurrences(new int[0]));
    }

    @Test
    void findMissingNumberReturnsMissingNaturalNumber() {
        assertEquals(3, Main.findMissingNumber(new int[]{1, 2, 4, 5}));
        assertEquals(1, Main.findMissingNumber(new int[]{2, 3, 4}));
    }

    @Test
    void firstUniqueCharacterFindsFirstUniqueOrReturnsNullCharacter() {
        assertEquals('w', Main.firstUniqueCharacter("swiss"));
        assertEquals('\0', Main.firstUniqueCharacter("aabb"));
    }

    @Test
    void isAnagramComparesCharacterCounts() {
        assertTrue(Main.isAnagram("listen", "silent"));
        assertTrue(Main.isAnagram("aabb", "baba"));
        assertFalse(Main.isAnagram("listen", "lister"));
        assertFalse(Main.isAnagram("aab", "abb"));
    }

    @Test
    void bubbleSortSortsArrayInPlace() {
        int[] values = {5, -1, 3, 3, 0};
        Main.bubbleSort(values);

        assertArrayEquals(new int[]{-1, 0, 3, 3, 5}, values);

        int[] empty = new int[0];
        Main.bubbleSort(empty);
        assertArrayEquals(new int[0], empty);
    }

    @Test
    void reverseWordsReversesWordOrder() {
        assertEquals("test a is This", Main.reverseWords("This is a test"));
        assertEquals("word", Main.reverseWords("word"));
        assertEquals("", Main.reverseWords(""));
    }

    @Test
    void isStrongPasswordRequiresEveryCriterion() {
        assertTrue(Main.isStrongPassword("MyPassword123!"));
        assertFalse(Main.isStrongPassword("Aa1!abc"));
        assertFalse(Main.isStrongPassword("lowercase123!"));
        assertFalse(Main.isStrongPassword("UPPERCASE123!"));
        assertFalse(Main.isStrongPassword("Password!!!!"));
        assertFalse(Main.isStrongPassword("Password123"));
    }

    @Test
    void compressStringEncodesRunsAndHandlesEmptyInput() {
        assertEquals("a2b1c5a3", Main.compressString("aabcccccaaa"));
        assertEquals("x1", Main.compressString("x"));
        assertEquals("", Main.compressString(""));
    }
}

