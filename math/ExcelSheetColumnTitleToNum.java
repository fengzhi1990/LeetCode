package math;

public class ExcelSheetColumnTitleToNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AB";
		System.out.println(titleToNumber(s));
	}
	
	public static int titleToNumber(String s) {
		int num = s.length();
		char[] ch = s.toCharArray();
		int result = 0;
		for(int i = 0; i < num; i++){
			result += (ch[i] - 'A' + 1) * Math.pow(26, num - i - 1);
		}
        return result;
    }

}
