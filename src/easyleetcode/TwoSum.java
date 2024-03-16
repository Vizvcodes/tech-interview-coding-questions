package easyleetcode;

/*
 * 
 * 1. Two sum: https://leetcode.com/problems/two-sum/description/
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 */
public class TwoSum {

	public static void main(String[] args) {

		// ctrl+d to delete a line in eclipse, Spring tool suite

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		twoSum(nums, target);
	}

	static void twoSum(int numbers[], int target) {
//		System.out.println("");
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			if (numbers[left] + numbers[right] == target) {
				System.out.println(left + " " + right);
			}
			if (numbers[left] + numbers[right] < target) {
				left++;
			} else {
				right--;
			}

		}
	}
}
