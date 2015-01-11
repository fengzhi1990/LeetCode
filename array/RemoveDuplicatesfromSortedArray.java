package array;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{1, 1, 1, 1};
		System.out.println(removeDuplicates(A));
	}
	 public static int removeDuplicates(int[] A) {
		 int temp, count = 0;
		 if (A.length == 0) {
			 return 0;
		 }
		 temp = A[0];
		 count++;
		 for (int i = 0; i < A.length ; i++){
			 if (A[i] != temp) {
				 temp = A[i];
				 count++;
			 }
		 }
		 for (int j = 0, indexN = 0; j < A.length && indexN < count; j++){
			 if (A[j] != A[indexN]){
				 A[++indexN] = A[j];
			 }
		 }
		 
		 return count;
	 }
	 // Time Limit Exceeded
	 public static int removeDuplicates1(int[] A) {
		 	int front, after, end;
		 	int temp;
		 	if(A.length == 0 || A.length == 1){
		 		return A.length;
		 	}
		 	after = end = A.length - 1;
		 	front = after - 1;
		 	while (front >= 0){
		 		if (A[front] == A[after]){
		 			temp = A[front];
		 			for (int i = front; i < end; i++){
		 				A[i] = A[i + 1];		 				
		 			}
		 			A[end--] = temp;
		 		}
		 		
		 		front--;
		 		after--;		 		
		 	}
	        return end + 1;
	    }
}
