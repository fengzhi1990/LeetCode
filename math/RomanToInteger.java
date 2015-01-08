package math;
/*
 * 20150102 9:40
 */
public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "MM";
//		String s = "F";
//		String s = "MF";
		String s = "MCMCDXLIV ";
		System.out.println(romanToInt(s));
				
	}
	public static int romanToInt(String s) {
        int result = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
        	switch(arr[i]){
        	case 'M' : result += 1000;break;
        	case 'D' : result += 500;break;
        	case 'C' : 
        		if((i < arr.length - 1) && (arr[i + 1] == 'D')){
        			result += 400;
        			i++;
        			break;
        		}if((i < arr.length - 1) && (arr[i + 1] == 'M')){
        			result += 900;
        			i++;
        			break;
        		}else{
        			result += 100;
        			break;
        		}        		
        	case 'L' : result += 50;break;
        	case 'X' : 
        		if((i < arr.length - 1) && (arr[i + 1] == 'L')){
    			result += 40;
    			i++;
    			break;
    		}if((i < arr.length - 1) && (arr[i + 1] == 'C')){
    			result += 90;
    			i++;
    			break;
    		}else{
    			result += 10;
    			break;
    		}   
        	case 'V' : result += 5;break;
        	case 'I' : 
        		if((i < arr.length - 1) && (arr[i + 1] == 'V')){
        			result += 4;
        			i++;
        			break;
        		}if((i < arr.length - 1) && (arr[i + 1] == 'X')){
        			result += 9;
        			i++;
        			break;
        		}else{
        			result += 1;
        			break;
        		}   
        	default : return 0; 
        	}        	
        }
        return result;
    }
}
