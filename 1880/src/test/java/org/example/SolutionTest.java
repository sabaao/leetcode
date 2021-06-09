package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test_acb_cba_cdb_true(){
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";
        Solution s = new Solution();
        boolean actual = s.isSumEqual(firstWord,secondWord,targetWord);
        assertEquals(true,actual);
    }
}
