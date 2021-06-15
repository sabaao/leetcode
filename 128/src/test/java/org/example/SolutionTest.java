package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void shouldAnswerWithFour()

    {
        int[] nums = {100,4,200,1,3,2};
        Solution s = new Solution();
        int actual = s.longestConsecutive(nums);
        assertEquals(4,actual);

    }

    @Test
    public void shouldAnswerWithNine()

    {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        Solution s = new Solution();
        int actual = s.longestConsecutive(nums);
        assertEquals(9,actual);

    }

    @Test
    public void shouldAnswerWithThree()

    {
        int[] nums = {1,2,0,1};
        Solution s = new Solution();
        int actual = s.longestConsecutive(nums);
        assertEquals(3,actual);

    }
}
