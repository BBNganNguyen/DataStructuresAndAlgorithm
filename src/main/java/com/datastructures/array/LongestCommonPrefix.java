package com.datastructures.array;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < prefix.length() && j < strs[1].length() && strs[i].charAt(j) == prefix.charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);
        }
        if (prefix == "") {
            return "";
        }
        return prefix;
    }
}
