package arrays;
import java.util.*;
class Sequence {
    
    static void sequence(int a[], int n){
        boolean arr1[] = new boolean[n+2];
        for(int i=0;i<n;i++) {
        	arr1[a[i]] = true;
        }
        for(int i=1;i<arr1.length;i++) {
        	if(arr1[i] == false) {
        		System.out.println(i);
        		break;
        	}
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sequence(arr,n);
        sc.close();
    }
}