package arrays;
import java.io.*;
import java.util.*;

public class ArraySum {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++){
	            arr[i] = sc.nextInt();
	        }
	        int target = sc.nextInt();
	        for(int i=0;i<n-1;i++){
	            for(int j=1;j<n;j++){
	                if(arr[i]+arr[j]==target && i!=j){ 
	                    System.out.println(i + " " + j);
	                    return;
	                }
	            }
	        }
	    }
	}

