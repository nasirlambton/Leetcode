package leetCodeProblems;

import leetCodeProblems.LeetCodeProblem1480.Solution;

public class leetCodeProblem2114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leetCodeProblem2114.Solution obj = new leetCodeProblem2114().new Solution();

		String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
		int numsoutput = obj.mostWordsFound(sentences);
		System.out.println(numsoutput);

	}

	class Solution {
		public int mostWordsFound(String[] sentences) {
			int return_val = 0;
			int n = sentences.length;
			
			for (int i = 0; i < n; i++) {
				 String[] sentence = sentences[i].split(" ");
				 int len = sentence.length;
				 return_val = Math.max(return_val, len);
			}
			return return_val;
		}
	}

}
