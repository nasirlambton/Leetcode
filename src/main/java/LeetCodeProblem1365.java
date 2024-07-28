
public class LeetCodeProblem1365 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	
	class Solution {
	    public int[] smallerNumbersThanCurrent(int[] nums) {
	        int count[] = new int [nums.length];
	        int counter=0;
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                
	                if(nums[i]>nums[j]){
	                    counter++;
	                    System.out.print(counter);                    
	                    count[i] = counter; 
	                    System.out.print(count[i]);
	                }
	            }

	        }
	        return count;
	    }
	}

}
