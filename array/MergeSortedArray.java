package array;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
		int[] B = new int[] {4, 5, 6};
		merge(A, 3, B, 3);
	}
	public static void merge(int A[], int m, int B[], int n) {
		if ((n > B.length) || (n + m > A.length)){
			return ;
		}
		int i = m - 1, j = n - 1;
		while ((i >= 0) && (j >= 0)){
			if (A[i] > B[j]){
				A[i + j + 1] = A[i--];
			} else {
				A[i + j + 1] = B[j--];
			}
		}
		for (int k = i ;k >= 0;k--){
			A[k + j + 1] = A[k--];
		}
		for (int k = j ;k >= 0;k--){
			A[i + k + 1] = B[k--];
		}
		      
    }
}
