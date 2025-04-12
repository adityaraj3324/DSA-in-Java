package Strings;
import java.util.*;

public class HappyPrefix {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        int n = s.length();
	        String longest = "";
	        for (int i = 1; i < n; i++) {
	            String prefix = s.substring(0, i);
	            String suffix = s.substring(n - i, n);
	            if (prefix.equals(suffix)) {
	                longest = prefix;
	            }
	        }
	        System.out.println(longest);
	    }
}
