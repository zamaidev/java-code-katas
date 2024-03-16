package hackerrank;

import java.util.List;

public class DiagonalDifference {
	public static int diagonalDifference(List<List<Integer>> arr) {
		int leftSum=0;
		int rightSum=0;
		int n = arr.size();

		for(int i=0;i<arr.size();i++){
			rightSum+=arr.get(i).get(n-1-i);

			for(int j=0;j<arr.size();j++){
				if(i==j) {
					leftSum+=arr.get(i).get(j);
				}
			}
		}

		return Math.abs(rightSum-leftSum);
	}
}
