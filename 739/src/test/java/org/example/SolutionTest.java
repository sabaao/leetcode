package org.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void shouldCase1()

    {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        Solution s = new Solution();
        int[] actual = s.dailyTemperatures(temperatures);
        int[] expect = {1,1,4,2,1,1,0,0};
        assertArrayEquals(expect,actual);
    }
}
