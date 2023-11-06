package com.datastructures.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @Test
    public void testIsPalindrome(){
        assertTrue(Palindrome.isPalindrome("radar"));
        assertTrue(Palindrome.isPalindrome("madam"));
        assertFalse(Palindrome.isPalindrome(""));
        assertFalse(Palindrome.isPalindrome("baby one more time"));

        assertTrue(Palindrome.isPalindrome(0));
        assertFalse(Palindrome.isPalindrome(-2));
        assertTrue(Palindrome.isPalindrome(121));
        assertFalse(Palindrome.isPalindrome(123));

    }
}
