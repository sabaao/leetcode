package charles.lab.longest.common.prefix;

public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    if(strs==null || strs.length==0) {
      return "";
    }
    
    String same = strs[0];
    for(int i =1;i<strs.length;i++) {
      
      while(strs[i].indexOf(same)!=0) {
        same = same.substring(0, same.length()-1);
        if(same.length()==0) {
          return "";
        }
      }
    }
    
    return same;
  }
}
