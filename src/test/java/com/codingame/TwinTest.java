package com.codingame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwinTest {

    @Test
    public void testIsTwin_SameLettersDifferentOrder() {
        assertTrue(Twin.isTwin("Marion", "Romain"));
    }

    @Test
    public void testIsTwin_SameLettersSameOrder() {
        assertTrue(Twin.isTwin("abc", "abc"));
    }

    @Test
    public void testIsTwin_DifferentLetters() {
        assertFalse(Twin.isTwin("abc", "def"));
    }

    @Test
    public void testIsTwin_DifferentLengths() {
        assertFalse(Twin.isTwin("abc", "abcd"));
    }

    @Test
    public void testIsTwin_DifferentCase() {
        assertTrue(Twin.isTwin("Marion", "romain"));
    }

    @Test
    public void testIsTwin_EmptyStrings() {
        assertTrue(Twin.isTwin("", ""));
    }

    @Test
    public void testIsTwin_OneEmptyString() {
        assertFalse(Twin.isTwin("abc", ""));
    }

    @Test
    public void testIsTwin_NullStrings() {
        assertFalse(Twin.isTwin(null, "abc"));
        assertFalse(Twin.isTwin("abc", null));
        assertFalse(Twin.isTwin(null, null));
    }
}
