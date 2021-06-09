package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        List<int[]> list;
        list = Arrays.asList(accounts);
        for(int[] account:list){
            int sum = IntStream.of(account).sum();
            max = sum>max? sum:max;
        }
        return max;
    }
}
