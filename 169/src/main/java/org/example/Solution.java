package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int index = nums.length/2;
        int result = nums[index];
        return result;
    }
}
