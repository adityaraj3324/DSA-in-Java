package arrays;
import java.util.*;

public class MaximumSubArray {

	    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    int maxSum=0;
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        int sum =0;
	        for(int j=i;j<n;j++){
	            sum += arr[j];
	            if(maxSum<sum){
	                maxSum =  sum;
	            }
	        }
	    }
	        System.out.println(maxSum);
	    }
	
}
