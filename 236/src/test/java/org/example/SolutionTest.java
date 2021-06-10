package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void should1234()
    {

        int[] nums = {1,2,3,4};
        Solution s = new Solution();
        int[] actual = s.productExceptSelf(nums);
        assertArrayEquals(new int[]{24, 12, 8, 6},actual);
    }
}
