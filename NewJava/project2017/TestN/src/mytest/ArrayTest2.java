/**
 * @author: BeginnersBook.com
 * @description: User would enter the 10 elements
 * and the program will store them into an array and 
 * will display the sum of them.
 */
import java.util.Scanner;
class SumDemo{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int[] array = new int[10];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<10; i++)
      {
    	  array[i] = scanner.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}



/**
 * @author: BeginnersBook.com
 * @description: Get sum of array elements
 */
class SumOfArray{
   public static void main(String args[]){
      int[] array = {10, 20, 30, 40, 50, 10};
      int sum = 0;
      //Advanced for loop
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}


/* Reading and storing names in an array from user input
 * Your problem is here:

String [] names = {n};

The size of names is now 1, with the value 10. What you want is:

String [] names = new String[n];

The latter is the correct syntax for specifying size of arrays.

EDIT:

It seems like you want to read n using the scanner. nextLine can be anything, so not just an integer. I would change the code to this:
*/


import java.util.Scanner;

public class ReadAndStoreNames {

public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    System.out.println("How many names would you like to enter?")
    int n = scan.nextInt(); //Ensures you take an integer
    System.out.println("Enter the " + n + " names: ");

    String [] names = new String[n];
    //store the names in an array
    for (int i = 0; i < names.length; i++){
        names[i] = scan.nextLine();
        }
    //sequentially print the names and upperCase them
    for (String i : names){
        System.out.println(i.toUpperCase());
        }

    scan.close();

}

}

