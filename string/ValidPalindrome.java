package string;

import java.util.*;
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "0k.;r0.k;";
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
		boolean flag = true;
        List<Character> listCh = new ArrayList<Character>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++){
        	if (ch[i] >= 'A' && ch[i] <= 'Z') {
        		listCh.add((char)(ch[i] + 32));
        	}
        	if (ch[i] >= 'a' && ch[i] <= 'z') {
        		listCh.add(ch[i]);
        	}
        	//没看清题目，以为是字母而已~
        	if (ch[i] >= '0' && ch[i] <= '9') {
        		listCh.add(ch[i]);
        	}
        }
                
        for (int i = 0, j = listCh.size() - 1; i < j; i++, j--){
        	
        	if (listCh.get(i) != listCh.get(j)) {
        		flag = false;
        		break;
        	}
        }        
        return flag;
    }
}
