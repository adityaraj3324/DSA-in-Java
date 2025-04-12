package arrays;
import java.util.*;
public class DutchNationalFlagAlgo {
	


	    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    int c0=0,c1=0,c2=0;
	    for(int i =0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	      for(int i =0;i<n;i++){
	        if(arr[i] == 0) c0++;
	        else if(arr[i] == 1) c1++;
	        else if(arr[i] == 2) c2++;  
	    } 
	        for(int i =0;i<n;i++){
	        if(i<c0) arr[i] = 0;
	        else if(i<c1+c0 && i>=c0) arr[i] = 1;
	        else if(i<n && i>=c0+c1){
	            arr[i] = 2;
	        }
	    }
	    for(int val : arr){
	        System.out.print(val + " ");
	    }
	    }
	
}
