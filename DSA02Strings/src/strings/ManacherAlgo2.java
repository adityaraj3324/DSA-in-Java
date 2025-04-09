package strings;
import java.util.*;

public class ManacherAlgo2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        int strlen = 0;
	        String str3 = "";

	        for (int i = 0; i < s.length(); i++) {
	            for (int j = i + 1; j <= s.length(); j++) {
	                String sub = s.substring(i, j);
	                if (isPalindrome(sub)) {
	                    if (sub.length() > strlen) {
	                        strlen = sub.length();
	                        str3 = sub;
	                    }
	                }
	            }
	        }

	        System.out.println(str3);
	    }
	    public static boolean isPalindrome(String str) {
	        int l = 0, r = str.length() - 1;
	        while (l < r) {
	            if (str.charAt(l) != str.charAt(r))
	                return false;
	            l++;
	            r--;
	        }
	        return true;
	    }
}
