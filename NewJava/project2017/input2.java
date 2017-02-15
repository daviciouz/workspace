package project2017;

import java.util.Scanner;


public class input2 {
	public static void main(String args[]){
		Scanner mymath = new Scanner(System.in);
		
		double fnum, snum, result;
		
		System.out.println("Enter first number: ");
		fnum = mymath.nextDouble();
		System.out.println("Enter second number: ");
		snum = mymath.nextDouble();
		result = fnum + snum;
		
		System.out.println("Sum of two numbers: " + result);
		
	}
}
