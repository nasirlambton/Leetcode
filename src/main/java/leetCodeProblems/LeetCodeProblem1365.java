package leetCodeProblems;

public class LeetCodeProblem1365 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeetCodeProblem1365.Solution obj = new LeetCodeProblem1365().new Solution();
		
		int [] nums = {8,1,2,2,3};
		int[] numsoutput = obj.smallerNumbersThanCurrent(nums);
		for(int i=0; i<numsoutput.length;i++)
		System.out.println(numsoutput[i]);

	}
	
	 class Solution {
	    public  int[] smallerNumbersThanCurrent(int[] nums) {
	        int count[] = new int [nums.length];
	        int counter ;
	        for(int i=0;i<nums.length;i++){
	        	counter =0;
	            for(int j=0;j<nums.length;j++){
                    System.out.println("i : "+ i + " i value:" + nums[i]);
                    System.out.println("j value : "+ j + " j value:" + nums[j]);
	                if(nums[i]>nums[j]){
	                    counter++;
	                    System.out.println("counter:"+counter);   
	                    count[i] = counter; 
	                }
	                
                    System.out.println("counter array value at "+ i +":"+count[i]);
	            }
	        }
	        return count;
	    }
	}

}
