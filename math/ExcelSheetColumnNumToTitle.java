package math;

public class ExcelSheetColumnNumToTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(52));
	}

	public static String convertToTitle(int n) {
		if (n < 1)
			return "";
		String str = "";
		while (n != 0) {
			if (n % 26 == 0) {
				str = "Z" + str;
				n = n / 26 - 1;
			} else {
				str = (char) (n % 26 + 'A' - 1) + str;
				n = n / 26;
			}

		}
		return str;
	}
}
