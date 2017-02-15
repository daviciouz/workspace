/* User would enter the 10 elements
* and the program will store them into an array and 
* will display the sum of them.
*/

package mytest;

import java.util.Scanner;

public class ArrayTest3 {

  public static void main(String args[])
  {
     Scanner scanner = new Scanner(System.in);
     
    
     int sum = 0;
     int n;
  
     
     System.out.println("Input N:");
     
     n = scanner.nextInt();
     int[] array = new int[n+1];
    
     for (int i=1; i<=n; i++)
     {
   	  array[i] =scanner.nextInt(); 
     }
     for( int num : array) {
         sum = sum+num;
     }
     System.out.println("Sum of array elements is:"+sum);
     for(int aint : array)
    	 System.out.println(aint);
    	 
  }
}