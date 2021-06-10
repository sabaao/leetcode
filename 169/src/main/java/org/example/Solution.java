package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> result = new HashMap<Integer, Integer>();
        for(int num: nums){
            if(result.get(num)!=null){
                result.put(num,result.get(num)+1);
            }else{
                result.put(num,1);
            }
        };
        int acutal = 0;
        int times = 0;

        for(Map.Entry<Integer,Integer> entry: result.entrySet()){
            if(entry.getValue()>times){
                acutal = entry.getKey();
                times = entry.getValue();
            }
        }

        return acutal;
    }
}
