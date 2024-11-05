package com.leetcode;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {
        List<Integer> integers = Arrays.stream(nums).boxed().distinct().toList();
        return integers.size();
    }
}
