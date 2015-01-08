package math;

import java.util.*;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "  +1";
//		String str = "  -1";
//		String str = "  +-1";
//		String str = "  s1";
//		String str = "  #1";
		String str = "2147483647";
		System.out.println(atoi(str));
	}

	public static int atoi(String str) {
		final int INT_MAX = 2147483647;
		final int INT_MIN = -2147483648;
		int signsNextIndex = -1 ;
		int numberFlagIndex = -1;
		int charFlagIndex = -1;
		int numberFlag = 0;
		
		long result = 0;
		char[] strArr = str.toCharArray();
		for (int i = 0; i < strArr.length; i++) {	
			
			if((strArr[i] == '-') || (strArr[i] == '+')){				
				if(signsNextIndex == -1){
					signsNextIndex = i;
				}
			}
			if((strArr[i] != '-') && (strArr[i] != '+')
					&&(strArr[i] != ' ')){				
				if(charFlagIndex == -1){
					charFlagIndex = i;
				}
			}
			if ((strArr[i] >= '0') && (strArr[i] <= '9')) {
				if(numberFlagIndex == -1){
					numberFlagIndex = i;
				}
				numberFlag = 1;
			}else{
				numberFlag = 0;
			}
			if((charFlagIndex != numberFlagIndex) || ((signsNextIndex != -1) && (numberFlagIndex - signsNextIndex > 1))){
				return 0;
			}
			if(numberFlagIndex != -1){
				if(numberFlag == 1 ){					
					result = result * 10 + strArr[i] - '0';
					if (result > INT_MAX) {	
						if ((signsNextIndex != -1) && (strArr[signsNextIndex] == '-') && ((numberFlagIndex - signsNextIndex == 1))) {
							return INT_MIN;
						}
						return INT_MAX;
					}
				}else{
					break;
				}
			}
		}
		if ((signsNextIndex != -1) && (strArr[signsNextIndex] == '-') && ((numberFlagIndex - signsNextIndex == 1))) {
			result = -result;
		}
		return (int) result;
	}
}
