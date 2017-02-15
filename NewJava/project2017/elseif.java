package project2017;
import java.util.Scanner;


public class elseif {
	public static void main(String args[]){
		int age;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		
		age = input.nextInt();
		
		if (age>65)
			System.out.println("You are young");
		else if (age>50 && age<60)
			System.out.println("You're in your 50s");
		else if (age>40 && age<50)
			System.out.println("You are in your 40s");
		else if (age>30 && age<40)
			System.out.println("You are in your 30s");
		else
			System.out.println("You are a young adult");
	}

}
