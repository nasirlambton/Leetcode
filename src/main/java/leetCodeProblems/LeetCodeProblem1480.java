package leetCodeProblems;

public class LeetCodeProblem1480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCodeProblem1480.Solution obj = new LeetCodeProblem1480().new Solution();

		int[] nums = { 1,2,3,4};
		int[] numsoutput = obj.runningSum(nums);
		for (int i = 0; i < numsoutput.length; i++)
			System.out.println(numsoutput[i]);

	}
	
	class Solution {
	    public int[] runningSum(int[] nums) {
	        int[] return_val = new int[nums.length];
	        return_val[0]=nums[0];
	        for(int i=1;i<nums.length;i++){
	            return_val[i] = nums[i]+return_val[i-1];
	        }
	        return return_val;
	    }
	}

}
