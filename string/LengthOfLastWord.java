package string;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " ss ssss s     ";
		System.out.println(lengthOfLastWord(s));
	}
	public static int lengthOfLastWord(String s) {
		int length = 0;
		int lastCharater = -1;
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] != ' ' && lastCharater == -1) {
				lastCharater = i;
			}
			if (ch[i] == ' ' && lastCharater != -1) {
				return length;				
			} 
			if (ch[i] != ' ') {
				length++;
			}
		}
		return length;
	}
}
