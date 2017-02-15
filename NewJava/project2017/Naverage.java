import java.util.Scanner;

class Naverage{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int n = 5;
		
		for(int counter=1; counter<=n; counter++)
		{
		
			grade = input.nextInt();
			total = total + grade;
			
		}

		average = total/n;
		System.out.println("Your average is "+ average);
}

}