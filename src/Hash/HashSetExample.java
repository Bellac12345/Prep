package Hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {

	/*
	 * Given an array of integers, find a pair of integers that sums to a number X.
	 * For e.g, if A = [6,3,5,2,1,7]. X = 4, Result= [3,1]
	 */
	public static List<Integer> twoSumHash(int[] a, int x){
		/*
		 * Hash Set Solution
		 * Time Complexity: O(n)
		 * Space Complexity: O(n)
		 */
		HashSet<Integer> set = new HashSet<>();
		
		for(int num: a) {
			if(set.contains(x-num)) {
				return Arrays.asList((x-num), num);
			}else {
				set.add(num);
			}
		}
		return null;
		
	}
	
	public static List<Integer> twoSumBrute(int[] a, int x){
		/*
		 * Brute Force Solution
		 * Time Complexity: O(n^2)
		 * Space Complexity: O(1);
		 */
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]+a[j] == x) {
					return Arrays.asList(a[i], a[j]);
				}
			}
		}
		
		return null;
	}
	public static void main(String [] args) {
		int[] nums = {6,3,5,2,1,7};
		
		int target = 7 ;
		System.out.println(twoSumBrute(nums, target));

		System.out.println(twoSumHash(nums, target));
		
	}
	
	
}
