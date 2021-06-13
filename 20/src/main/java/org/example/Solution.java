package org.example;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()==true){
            return true;
        }

        Stack<String> stack = new Stack<String>();
        for(String str: s.split("")){
            if("(".equals(str) || "[".equals(str) || "{".equals(str)){
                stack.push(str);
            }else if(stack.isEmpty()){
                return false;
            } else{
                String lastStr = stack.pop();
                if(")".equals(str) && !"(".equals(lastStr)){
                    return false;
                }else if("]".equals(str) && !"[".equals(lastStr)){
                    return false;
                }else if("}".equals(str) && !"{".equals(lastStr)){
                    return false;
                }
            }
        }

        if(stack.isEmpty()==false){
            return false;
        }else{
            return true;
        }

    }
}
