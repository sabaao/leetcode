package org.example;

import java.util.Arrays;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length==0) return temperatures;

        int[] ans = new int[temperatures.length];
        Arrays.fill(ans,0);
        for(int i =0;i<ans.length;i++){
            for(int j = i+1;j<ans.length;j++){
                if(temperatures[i]<temperatures[j]){
                    ans[i] = j - i;
                    break;
                }
            }
        }

        return ans;
    }
}
