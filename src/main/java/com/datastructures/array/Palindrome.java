package com.datastructures.array;

import java.awt.desktop.ScreenSleepEvent;

public class Palindrome {

    /**
     * Solution 1: loop for str and compare first index and last index
     *
     * @param str
     * @return true if input sttr is palindrome
     */
    public static boolean isPalindrome(String str) {
        if (str.isEmpty()) {
            return false;
        }
        int lowIndex = 0;
        int highIndex = str.length();
        while (lowIndex < highIndex) {
            if (str.charAt(lowIndex) != str.charAt(highIndex - 1)) {
                return false;
            }
            --highIndex;
            ++lowIndex;
        }
        return true;
    }

    /**
     * Palindrome number
     * @param x
     * @return true if x is Palindrome
     */
    public static boolean isPalindrome(int x) {
        int xCopy = x;
        if (x == 0) {
            return true;
        }
        if (xCopy < 10) {
            return false;
        }
        //reverse order of x
        int carry = 1;
        int reverseNumber = 0;
        while (xCopy > 0) {
            reverseNumber = (xCopy % 10) + reverseNumber * 10;
            xCopy = xCopy / 10;
            carry = carry * 10;
        }
        return x == reverseNumber ? true : false;
    }
}
