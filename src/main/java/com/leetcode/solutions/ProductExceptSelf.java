package com.leetcode.solutions;

public class ProductExceptSelf {

    public int[] findProductExceptSelf(int[] nums) {

        if(nums == null) {
            return new int[] {0};
        }

        if(nums.length == 0) {
            return new int[] {};
        }

        if(nums.length == 1) {
            return new int[] {1};
        }

        int len = nums.length, prefSuf = 1;
        int[] result = new int[len];

        for(int idx = 0; idx < nums.length; idx++) {
            result[idx] = prefSuf;
            prefSuf = prefSuf * nums[idx];
        }

        prefSuf = 1;

        for(int idx = nums.length - 1; idx >= 0; idx--) {
            result[idx] = result[idx] * prefSuf;
            prefSuf = prefSuf * nums[idx];
        }

        return result;
    }
}
