package array;

import java.util.*;
public class PascalsTriangleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRow(0));
	}
	public static List<Integer> getRow(int rowIndex) {
		List relList = new ArrayList();
		List<Integer> tempList = new ArrayList<Integer>();
		List<Integer> lastList = new ArrayList<Integer>();
		rowIndex++;
		for (int i = 0; i < rowIndex; i++) {
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

		return relList.size() == 0 ? tempList : (List<Integer>) relList.get(rowIndex - 1);
    }
}
