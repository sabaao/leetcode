package org.example;

public class Solution {
    private int aNumber = 'a';

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstWorldInt = getWordNumber(firstWord);
        int secondWorldInt = getWordNumber(secondWord);
        int targetWordInt = getWordNumber(targetWord);
        if((firstWorldInt + secondWorldInt)==targetWordInt){
            return true;
        }else
            return false;

    }

    public int getWordNumber(String str){
        String tmp_result_str ="";
        for(char c : str.toCharArray()){
            int i = c;
            tmp_result_str += (i-aNumber);
        }

        int result = Integer.parseInt(tmp_result_str);
        return result ;
    }
}
