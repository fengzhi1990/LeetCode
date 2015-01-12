package string;

import java.util.*;
public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(}{)";
		System.out.println(isValid(str));
	}
	public static boolean isValid(String s) {
	        boolean flag = false;
	        Stack<Character> st = new Stack<Character>();
	        char[] ch = s.toCharArray();
	        for (int i = 0; i < ch.length; i++) {
	        	if (!st.empty()){	        		
				if ((st.peek() == '[' && ch[i] == ']')
						|| (st.peek() == '{' && ch[i] == '}')
						|| (st.peek() == '(' && ch[i] == ')')) {
					st.pop();
				} else {
					st.push(ch[i]);
				}
	        	}else{
	        		st.push(ch[i]);
	        	}
	        }
	        if (st.empty()){
	        	flag = true;
	        }
	        return flag;
	    }
}
