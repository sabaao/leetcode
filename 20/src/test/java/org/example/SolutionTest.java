package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void shouldCase1WithTrue()
    {
        String input = "()";
        Solution s = new Solution();
        boolean actual = s.isValid(input);
        assertEquals(true,actual);
    }

    @Test
    public void shouldCase2WithTrue()
    {
        String input = "()[]{}";
        Solution s = new Solution();
        boolean actual = s.isValid(input);
        assertEquals(true,actual);
    }

    @Test
    public void shouldCase3WithFalse()
    {
        String input = "(]";
        Solution s = new Solution();
        boolean actual = s.isValid(input);
        assertEquals(false,actual);
    }

    @Test
    public void shouldCase4WithFalse()
    {
        String input = "]";
        Solution s = new Solution();
        boolean actual = s.isValid(input);
        assertEquals(false,actual);
    }
}
