package com.datastructures.array;

public class IntegerReversion {
    /**
     * Solution 1:
     * - Modules input number by 10 to get reminder
     * - Then input will be inputNumber/10
     * @param inputNumber
     * @return revers input Number in string.
     * For example: 1234 will return 4321
     */
    public static String reverseInteger(int inputNumber) {
        int outPut = 0;
        while (inputNumber > 0) {
            int reminder = inputNumber % 10;
            inputNumber = inputNumber / 10;
            outPut = outPut * 10 + reminder;
        }
        return String.valueOf(outPut);
    }

    /**
     * Solution 2:
     * Convert input to string and
     * @param inputNumber
     * @return revers input Number in string.
     * For example: 1234 will return 4321
     */
    public static String reverseInteger2(int inputNumber) {
        StringBuilder input = new StringBuilder(String.valueOf(inputNumber));
        StringBuilder outPut = new StringBuilder();
        while (input.length() > 0) {
            outPut = outPut.append(String.valueOf(input.charAt(input.length() -1)));
            input.deleteCharAt(input.length() -1);

        }
        return outPut.toString();
    }
}
