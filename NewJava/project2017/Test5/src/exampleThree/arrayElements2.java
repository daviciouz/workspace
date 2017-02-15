package exampleThree;

import java.util.Scanner;

public class arrayElements2 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int[] predCount = new int[11];
		
		for ( int i = 0; i < predCount.length; i++)
		{
		    predCount[i] = i;
		    
		    System.out.println("Please enter number\n");
		    predCount[i] = input.nextInt();
		}
		System.out.println(predCount);
		
	
	}
}


//System.out.println("Please enter your name : ");
//s = input.next(); // getting a String value

//System.out.println("Please enter your age : ");
//i = input.nextInt(); // getting an integer

//System.out.println("Please enter your salary : ");
//d = input.nextDouble(); // getting a double
