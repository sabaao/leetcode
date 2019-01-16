package charles.lab.romantoint;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
  private Map<Character,Integer> map = new HashMap<Character,Integer>(){{
    put('I',1);
    put('V', 5);
    put('X', 10);
    put('L', 50);
    put('C', 100);
    put('D', 500);
    put('M', 1000);
  }};
  
  public int romainToInt(String s) {
    int result = 0;
    char[] charArray = s.toCharArray();
    char prev = '0';
    for(int i = charArray.length-1;i>=0;i--) {
      Integer add = map.get(charArray[i]);
      if(prev!='0' && map.get(prev)>add) {
        add = -add;
      }
      result +=add;
      prev = charArray[i]; 
    }
    
    return result;
  }
}
