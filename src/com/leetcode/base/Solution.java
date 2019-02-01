package com.leetcode.base;

/**
 * @author cx
 * @date 1/31/2019
 **/
public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int [] results = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    results[0] = i;
                    results[1] = j;
                    break;
                }
            }
        }

        if (results[1] != 0) {
            return results;
        } else {
            return new int[0];
        }
    }
}
