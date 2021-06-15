package org.example;

import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;

        int[] sortedNum = nums;
        Arrays.sort(sortedNum);

        int preNum = sortedNum[0];
        int maxContinue = 1 ;
        int tmpCountinue = 1;
        for(int i =1;i<sortedNum.length;i++){
            if(sortedNum[i]==preNum)
                continue;;

            if((sortedNum[i]-preNum) == 1){
                tmpCountinue++;

            }else{
                maxContinue = maxContinue > tmpCountinue?maxContinue:tmpCountinue;
                tmpCountinue = 1;
            }
            preNum = sortedNum[i];
        }

        maxContinue = maxContinue > tmpCountinue?maxContinue:tmpCountinue;

        return maxContinue;
    }
}
