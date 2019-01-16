package charles.lab.twosum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import charles.lab.twosum.TwoSum;

public class TwoSumTest {
	
	TwoSum ts = new TwoSum();
	
	@Test
	public void solution_OnlyTwoElement() {
		int[] nums = {0,1};
		
		assertTrue(Arrays.equals(nums, ts.solution(nums, 1))); 
	}
	
	@Test
	public void solution_ThreeElement_FirstTwo() {
		int[] nums = {0,1,2};
		int[] except = {0,1};
		assertTrue(Arrays.equals(except, ts.solution(nums, 1)));
	 
	}
	

}
