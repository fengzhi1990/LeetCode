package array;

import java.util.*;
public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		List relList = generate(n);
		System.out.println(relList);
		
	}
	public static List<List<Integer>> generate(int numRows) {
		List relList = new ArrayList();
		List<Integer> tempList = new ArrayList<Integer>();
		List<Integer> lastList = new ArrayList<Integer>();
		for (int i = 0; i < numRows; i++) {
			if (0 == i) {
				tempList.add(1);
			}
			if (1 == i) {
				tempList.add(1);
				tempList.add(1);
			}
			if (i >= 2) {
				tempList.add(1);
				for (int k = 1; k < i; k++) {
					tempList.add(lastList.get(k - 1) + lastList.get(k));
				}
				tempList.add(1);
			}
			relList.add(tempList);
			lastList = tempList;
			tempList = new ArrayList();
		}

		return relList;
    }
}
