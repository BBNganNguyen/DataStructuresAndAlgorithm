package com.datastructures.array;

public class StringReversion {
    /**
     * Solution 1:
     * Loop for the half of string and swap the position of first index and last index
     * @param inputStr
     * @return reverseString of an inputString
     */
    public static String reverseString(String inputStr) {
        if (inputStr.isEmpty()) {
            return "";
        }
        char[] str = inputStr.toCharArray();
        for (int i = 0; i < str.length / 2; i++) {
            swap(str, i, str.length - 1);
        }
        return String.valueOf(str);
    }

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

}
