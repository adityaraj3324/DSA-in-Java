package recursion;
import java.util.Scanner;

public class Josepheus {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int res =0;
	        for(int i=1;i<=n;i++){
	            res = (res+k)%i;
	        }
	        System.out.println(res+1);
	    }
}
