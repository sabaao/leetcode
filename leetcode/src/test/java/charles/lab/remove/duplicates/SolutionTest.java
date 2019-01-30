package charles.lab.remove.duplicates;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  Solution s = new Solution();
  
  @Test
  void removeDuplicates_112() {
    int[] nums = {1,1,2};
    int actual = s.removeDuplicates(nums);
    
    assertEquals(2, actual);
  }

  
  @Test
  void removeDuplicates_0011122334() {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    int actual = s.removeDuplicates(nums);
    
    assertEquals(5, actual);
  }
  
  
}
