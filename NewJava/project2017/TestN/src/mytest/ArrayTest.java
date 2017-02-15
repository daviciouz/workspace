
/* Since you know that you want to have an array of 20 string:
	String[] array = new String[20];
Then your for loop should use the length of the array to determine when the loop should stop. 
*/ 

package mytest;

import java.util.Scanner;

public class ArrayTest{
	

public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    String[] array = new String[5];

    System.out.println("Please enter 20 names to sort");

    for (int i = 0; i < array.length; i++) {
        array[i] = s.nextLine();
    }

    //Just to test
    for(String a: array)
    System.out.println(a);
}

}









