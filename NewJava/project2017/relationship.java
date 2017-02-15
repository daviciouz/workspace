package project2017;

import java.util.Scanner;

public class relationship {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		wife wifeObject = new wife();
		System.out.println("Enter name of your wife here: ");
		String temp = input.nextLine();
		wifeObject.setName(temp);
		wifeObject.saying();
	}

}
