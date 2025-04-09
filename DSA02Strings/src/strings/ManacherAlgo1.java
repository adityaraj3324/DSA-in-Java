package strings;
import java.util.*;

public class ManacherAlgo1 {
	    static Set<String> set = new HashSet<>();

	    static void expand(String s, int left, int right) {
	        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	            left--;
	            right++;
	        }
	        set.add(s.substring(left + 1, right));
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();

	        for (int i = 0; i < s.length(); i++) {
	            expand(s, i, i);     // Odd length
	            expand(s, i, i + 1); // Even length
	        }

	        int max = 0;
	        String str = "";
	        for (String ele : set) {
	            if (ele.length() > max) {
	                max = ele.length(); // This line was missing
	                str = ele;
	            }
	        }

	        System.out.print(str);
	    }
}
