package com.datastructures.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static int removeDuplicates1(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
    }
}
