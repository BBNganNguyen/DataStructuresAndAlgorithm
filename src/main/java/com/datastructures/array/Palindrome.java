package com.datastructures.array;

public class Palindrome {

    /**
     * Solution 1: loop for str and compare first index and last index
     * @param str
     * @return true if input sttr is palindrome
     */
    public static boolean isPalindrome(String str) {
        if(str.isEmpty()) {
            return false;
        }
        int lowIndex = 0;
        int highIndex = str.length();
        while (lowIndex < highIndex) {
            if (str.charAt(lowIndex) != str.charAt(highIndex-1)) {
                return false;
            }
            --highIndex;
            ++lowIndex;
        }
        return true;
    }
}
