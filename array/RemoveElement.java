package array;

import List.removeNthFromEndList;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{4, 4};
		System.out.println(removeElement(A, 4));
	}
	public static int removeElement(int[] A, int elem) {
		int start = 0;
		int end = A.length -1;
		while (start <= end){
			if (A[start] == elem){
				if(A[end] == elem){
					A[end--] = 0;
				}else{
					A[start++] = A[end];
					A[end--] = 0;
				}
				
			}else{
				start++;
			}
		}
        return end + 1;
    }
}
