package mytest;

import java.lang.Math;  
import java.util.Scanner;

public class MSS4Test {


	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

public static int FindMaxSumSubArray(int[] array, int low, int high){
	 
    /* No element in the array */
    if (low > high)  
       return 0;
    /* One element in the array */
    if (low == high) 
       return max(0, array[low]);
       
    /* Middle element of the array */   
    int middle = (low + high) / 2;
   
    /* find maximum sum crossing to left */
    int leftMax;
    int sum;
    
    leftMax = sum = 0;
    for (int i = middle; i ≥ low; i--) {
       sum += array[i];
       if (sum > leftMax)
           leftMax = sum;
    }
   
    /* find maximum sum crossing to right */
    int rightMax;
    
    rightMax = sum = 0;
    for (int i = middle+1; i ≤ high; i++) {
       sum += array[i];
       if (sum > rightMax)
           rightMax = sum;
    }
    
    /* Return the maximum of leftMax, rightMax and their sum */
    return Math.max(leftMax + rightMax, 
    Math.max(FindMaxSumSubArray(low, middle), FindMaxSumSubArray(middle+1, high)));
}


