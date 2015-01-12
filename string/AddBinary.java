package string;

import java.util.Arrays;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strA = "11";
		String strB = "1";
		System.out.println(addBinary(strA, strB));
	}
	public static String addBinary(String a, String b) {
        String s = null;
		int carryFlag = 0;        
        
        char[] cha = a.toCharArray();
        char[] chb = b.toCharArray();
        int length = cha.length > chb.length ? 
        		cha.length + 1 : chb.length + 1;
        char[] chRel = new char[length];
        int i = cha.length - 1, j = chb.length - 1;
        for (;i >= 0 && j >= 0; i--, j--) {
        	if (cha[i]  - '0' + chb[j] - '0' + carryFlag >= 2){        		
        		chRel[--length] = (char) ((cha[i]  - '0' + chb[j] - '0' + carryFlag) % 2 + '0');
        		carryFlag = 1;        		
        	} else {
        		chRel[--length] = (char) ((cha[i]  - '0' + chb[j] - '0' + carryFlag) % 2 + '0');
        		carryFlag = 0; 
        	}
        }
        while (i >= 0) {
        	if (cha[i]  - '0' + carryFlag >= 2){        		
        		chRel[--length] = (char) ((cha[i--] + carryFlag - '0') % 2 + '0');
        		carryFlag = 1;        		
        	} else {
        		chRel[--length] = (char) ((cha[i--] + carryFlag - '0') % 2 + '0');
        		carryFlag = 0;
        	}
        }
        while (j >= 0) {
        	if (chb[j] + carryFlag - '0' >= 2){        		
        		chRel[--length] = (char) ((chb[j--] + carryFlag - '0') % 2 + '0');
        		carryFlag = 1;        		
        	} else {
        		chRel[--length] = (char) ((chb[j--] + carryFlag - '0') % 2 + '0');
        		carryFlag = 0;
        	}
        }
        if (carryFlag == 1) {
        	chRel[--length] = '1';
        } else {
        	chRel[--length] = '0';
        }
        s = String.valueOf(chRel);
        return chRel[0] == '0' ? s.substring(1) : s;
    }

}
