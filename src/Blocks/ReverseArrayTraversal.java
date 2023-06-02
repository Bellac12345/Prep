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
	
	/*
	 * Given a sentence, reverse the words of the sentence. For example, "i live in a house" becomes "house a in live i".
	 */
	
	public static String reverseSentence(String s) {
		/*
		 * Time Complexity: O(n)
		 * Space Complexity: O(n)
		 */
		
		// reverse through string stopping at spaces
		// add each word 
		// add first word
		StringBuilder reverse = new StringBuilder();
		
		int pos=s.length();
		for(int i=s.length()-1; i>=0;i--) {
			if(s.charAt(i) == ' ') {
				reverse.append(s.substring(i+1, pos));
				reverse.append(" ");
				pos = i;
			}
			
		}
		
		if(reverse.length() > 0 ) {
			reverse.append(s.substring(0, pos));
			return reverse.toString();

		}else {
			return s;
		}
		
	}
	
	
	public static void main(String [] args) {
//		int[] nums = {1,2,5,6,8,-1,-1,-1};
		int[] nums = {1,3};

		nums = replaceReverse(nums);
		
		for(int x:nums) {
			//System.out.print(x+",");
		}
		
		
		String test = "hi im isa";
		
	
		System.out.println(reverseSentence(test));
	}
	
	

}
