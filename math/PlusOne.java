package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PlusOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = new int[] { 6, 1, 6, 9, 9 };
		System.out.println(Arrays.toString(plusOne(digits)));
	}

	public static int[] plusOne(int[] digits) {
		List plusOne = new ArrayList();
		int carryFlag = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (i == digits.length - 1) {
				plusOne.add(0, (digits[i] + carryFlag + 1) % 10);
				if ((digits[i] + carryFlag + 1) > 9) {
					carryFlag = 1;
				} else {
					carryFlag = 0;
				}
			} else {
				plusOne.add(0, (digits[i] + carryFlag) % 10);
				if ((digits[i] + carryFlag) > 9) {
					carryFlag = 1;
				} else {
					carryFlag = 0;
				}
			}
		}
		if (carryFlag == 1) {
			plusOne.add(0, 1);
		}
		final int size = plusOne.size();
		int[] plusOneInt = new int[size];
		Iterator<Integer> itr = plusOne.iterator();
		int i = 0;
		while (itr.hasNext()) {
			plusOneInt[i++] = itr.next().intValue();
		}
		return plusOneInt;
	}
}
