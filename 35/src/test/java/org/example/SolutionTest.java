package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void searchInsert_input1356_5()
    {
        Solution s = new Solution();
        int[] input = {1,3,5,6};
        int actual = s.searchInsert(input,5);
        assertEquals(2,actual);
    }

    @Test
    public void searchInsert_input1356_2()
    {
        Solution s = new Solution();
        int[] input = {1,3,5,6};
        int actual = s.searchInsert(input,2);
        assertEquals(1,actual);
    }
}
