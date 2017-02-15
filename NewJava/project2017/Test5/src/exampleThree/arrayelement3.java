package exampleThree;

import java.util.Scanner;

public class arrayelement3 {
	    public static void main(String[] args) {

	        // Create int array.
	        int[] predCount = new int[5];
	        
	    	Scanner input = new Scanner(System.in);

	        System.out.println("Please enter first number\n");
	        // Assign first three elements.
	        predCount[0] = input.nextInt();
	        
	        System.out.println("Please enter second number\n");
	        // Assign first three elements.
	        predCount[1] = input.nextInt();
	        
	        System.out.println("Please enter third number\n");
	        // Assign first three elements.
	        predCount[2] = input.nextInt();
	        
	        // Loop over elements.
	        for (int i = 0; i < predCount.length; i++) {
	            // Get value.
	            int value = predCount[i];
	            // Print value.
	            System.out.println(value);
	        }
	  }
}

