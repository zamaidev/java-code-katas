package leetcode.arrays;

/*
[1,2,3
 4,5,6
 7,8,9]

[7,8,9
 4,5,6
 1,2,3]

[3,6,9
 3,5,8
 1,4,7]
*/
class RotateImage {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		int j = 0;

		while (j<n) {
			reverse(matrix, 0, j, n-1, j);
			j++;
		}

		int i1 = 0, j1 = 0, i2 = 0, j2 = 0;
		while (i1 < n) {
			diagonais(matrix, i1,i2,j1,j2);
			i1++;
			j2++;
		}
		j2--;
		i1--;
		while (i2<n) {
			i2++;
			j1++;
			if (i2>=n){
				break;
			}
			diagonais(matrix, i1, i2, j1, j2);
		}
	}

	public void diagonais (int[][] matrix, int i1, int j1, int i2, int j2) {
		while (i2<i1){
			swap(matrix, i1, i2, j1, j2);
			i1--;
			j1++;
			i2++;
			j2--;
		}
	}

	public void reverse (int[][] matrix, int i1, int j1, int i2, int j2) {
		while (i1<i2) {
			swap(matrix, i1, i2, j1,j2);
			i1++;
			i2--;
		}
	}

	public void swap (int[][] matrix, int i1, int i2, int j1, int j2) {
		int temp = matrix[i1][j1];

		matrix[i1][j1] = matrix[i2][j2];
		matrix[i2][j2] = temp;
	}
}