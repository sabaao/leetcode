package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void should123_321_true()
    {
        int[][] accounts = {{1,2,3},{3,2,1}};
        Solution s = new Solution();
        int actual = s.maximumWealth(accounts);
        assertEquals(6,actual);
    }
}
