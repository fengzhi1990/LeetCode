package string;
/*
 * ²âÊÔÓÃÀı£º
 * 0.1 0.2
 * 1.1 0.2
 * 1. 1
 * 1.1.1 1.1.0
 * 1.1.1 1.1
 * 1.2 1.3
 * 
 */

public class CompareVersionNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareVersion("1.", "1.1"));
	}

	public static int compareVersion(String version1, String version2) {
		String[] ver1 = version1.split("\\.");
		String[] ver2 = version2.split("\\.");
		int i = 0, j = 0;
		for (; i < ver1.length 
				&& j < ver2.length; i++, j++){
			if (Integer.parseInt(ver1[i]) < Integer.parseInt(ver2[j])) {
				return -1;
			} 
			if (Integer.parseInt(ver1[i]) > Integer.parseInt(ver2[j])) {
				return 1;
			} 
		}
		while (i < ver1.length) {
			if (Integer.parseInt(ver1[i]) > 0) {
				return 1;
			}
			i++;
		}
		while (j < ver2.length) {
			if (Integer.parseInt(ver2[j]) > 0) {
				return -1;
			}
			j++;
		}
		return 0;			
	}
	//²âÊÔÓÃÀı²»Çå³ş~
//	public static int compareVersion(String version1, String version2) {
//		String[] ver1 = version1.split("\\.");
//		String[] ver2 = version2.split("\\.");
//		if (Integer.parseInt(ver1[0]) < Integer.parseInt(ver2[0])) {
//			return -1;
//		} else if (Integer.parseInt(ver1[0]) > Integer.parseInt(ver2[0])) {
//			return 1;
//		} else {
//			if	(ver1.length == 1 && ver2.length == 1) {
//				return 0;
//			}
//			if	(ver1.length == 2 && ver2.length == 1 ) {
//				if (Integer.parseInt(ver1[1]) > 0) {
//					return 1;
//				} else {
//					return 0;
//				}
//			}
//			if	(ver1.length == 1 && ver2.length == 2) {
//				if (Integer.parseInt(ver2[2]) > 0) {
//					return -1;
//				} else {
//					return 0;
//				}
//			}
//			if (Integer.parseInt(ver1[1]) < Integer.parseInt(ver2[1])) {
//				return -1;
//			} else if (Integer.parseInt(ver1[1]) > Integer.parseInt(ver2[1])) {
//				return 1;
//			} else {
//				return 0;
//			}
//		}		
	
}
