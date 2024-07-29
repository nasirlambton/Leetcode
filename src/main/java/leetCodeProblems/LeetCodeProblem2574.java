package leetCodeProblems;

import leetCodeProblems.LeetCodeProblem1480.Solution;

public class LeetCodeProblem2574 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCodeProblem2574.Solution obj = new LeetCodeProblem2574().new Solution();

		int[] nums = { 10, 4, 8, 3 };
		int[] numsoutput = obj.leftRightDifference(nums);
		for (int i = 0; i < numsoutput.length; i++)
			System.out.println(numsoutput[i]);

	}

	class Solution {
	    public int[] leftRightDifference(int[] nums) {
	    	int n =nums.length;
	        int[] left_sum= new int[n]; // [0,10,14,22]
	        int[] right_sum= new int[n]; //[15,11,3,0]
	        int[] return_val = new int[n]; //[15,1,11,22]
	        for(int i=1;i<n;i++){
	            left_sum[i] = left_sum[i-1]+nums[i-1];
	        }
	        for(int i=n-2;i>=0;i--){
	        right_sum[i]= right_sum[i+1]+nums[i+1];
	        }
	        for(int i=0;i<left_sum.length;i++){
				System.out.println("left_sum: "+left_sum[i]);
	        }
	        for(int i=0;i<right_sum.length;i++){
				System.out.println("right_sum: "+i+" value "+right_sum[i]);
	        }
	        for(int i=0;i<nums.length;i++){
	            return_val[i] = Math.abs(left_sum[i]-right_sum[i]);
	        }

	        return return_val;
	    }
	}

}
