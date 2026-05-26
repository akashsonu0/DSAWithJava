package pwskills.com;

import java.util.Arrays;
import java.util.Scanner;

public class practise {
	public static void main(String[] args) {	
		int[] nums = {30,10,40,23};
		for(int ele : nums) {
			System.out.println(ele+" ");
		}
		int[] arr = nums;
		arr[0] = 70;
		System.out.println();
		System.out.println(nums[0]);
		
		System.out.println();
		int[] brr = Arrays.copyOf(nums, nums.length);
		brr[0] = 70;
		System.out.println(nums[0]);
		
	}
	
}



	
