package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SolutionTest {
    @Test
    public void should323_3()
    {
        int[] nums = {3,2,3};
        Solution s = new Solution();
        int actual = s.majorityElement(nums);
        assertEquals(3,actual);

    }
}
