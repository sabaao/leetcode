package charles.lab.longest.common.prefix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {
  LongestCommonPrefix l = new LongestCommonPrefix();
  @Test
  void longestCommonPrefix_flowr_flow_flight() {
    String[] strs = {"flower","flow","flight"};
    String actual = l.longestCommonPrefix(strs);
    assertEquals("fl", actual);
  }
  
  @Test
  void longestCommonPrefix_dog_cat_moon() {
    String[] strs = {"dog","cat","moon"};
    String actual = l.longestCommonPrefix(strs);
    assertEquals("", actual);
  }
}
