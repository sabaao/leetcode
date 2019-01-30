package charles.lab.remove.duplicates;

public class Solution {
  public int removeDuplicates(int[] nums) {
    
    if(nums.length==0) {
      return 0;
    }
    
    if(nums.length==1) {
      return nums[0];
    }
    
    int index = 0;
    
    for(int i =1;i<nums.length;i++) {
      if(nums[index]!=nums[i]) {
        index++;
        nums[index] = nums[i];
      }
    }
    
    return ++index;
  }
}
