package project2017;

import java.util.Scanner;

public class mainname {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		myname mynameObject = new myname();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		mynameObject.message1(name);
		
	}
	

}
