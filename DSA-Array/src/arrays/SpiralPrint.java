package arrays;
import java.util.*;

public class SpiralPrint {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	        int arr[][] = new int[m][n];
	        int left = 0, right = n-1, top =0, bottom = m-1;
	        for(int i=0; i<m;i++){
	            for(int j=0;j<n;j++){
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        while(left<=right && top<=bottom){
	        for(int i = left;i<=right;i++){
	            System.out.print(arr[top][i]+" ");
	        }
	        top++;
	        for(int i = top;i<=bottom;i++){
	            System.out.print(arr[i][right]+" ");
	        }
	        right--;
	        if(top<=bottom)
	        for(int i = right;i>=left;i--){
	            System.out.print(arr[bottom][i]+" ");
	        }
	        bottom--;
	        if(left<=right)
	        for(int i = bottom;i>=top;i--){
	            System.out.print(arr[i][left]+" ");
	        }
	        left++;
	        }
	    }
	
}
