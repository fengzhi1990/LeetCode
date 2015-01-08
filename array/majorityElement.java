package array;

public class majorityElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 0, 1, 1, 2, 2, 2, 2, 0, 1, 2 };
		System.out.println(majorityElement(num));
	}

	public static int majorityElement(int[] num) {
		if (num.length == 0) {
			System.out.println("input error!");
		}
		int element = num[0];
		int count = 1;
		for (int i = 1; i < num.length; i++) {
			if (count == 0) {
				element = num[i];
				count += 1;
				continue;
			}
			if (element == num[i]) {
				count += 1;
			} else {
				count -= 1;
			}
		}
		return element;
	}
}
