package Blocks;

public class ReverseArrayTraversal {
	
	/*
	 * Given an array of numbers, replace each even number with two of the same number.
	 * e.g, [1,2,5,6,8] -> [1,2,2,5,6,6,8,8]. 
	 * Assume that the array has enough space to accommodate the result.
	 * empty element is a -1
	 */
	public static int[] replaceReverse(int[] nums) {
		/*
		 * Time Complexity: O(n)
		 * Space Complexity: O(1)
		 */
		
		// two pointers end and current position
		
		int end = nums.length-1;
		int pos = findEnd(nums);
		
		for(int i=pos; i>=0; i--) {
			nums[end--]= nums[i];
			if(nums[i] %2 == 0) {
				nums[end--]= nums[i];
			}
		}
	
		return nums;
		
	}
	
	public static int findEnd(int[] nums) {
		/*
		 * example [1,2,5,6,8] is [1,2,5,6,8,-1,-1,-1]
		 */
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == -1) {
				return i-1;
			}
		}
		return -1;
	}
	
	public static void main(String [] args) {
//		int[] nums = {1,2,5,6,8,-1,-1,-1};
		int[] nums = {1,3};

		nums = replaceReverse(nums);
		
		for(int x:nums) {
			System.out.print(x+",");
		}
	}
	
	

}
