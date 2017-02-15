package project2017;

public class nestedif{
	public static void main(String args[]){
		int age = 60;
		
		if(age < 50){
			System.out.println("You are young");
		}
		else 
		{
			System.out.println("You are old");
		}
			if (age > 50 && age <60)
			{
				System.out.println("You are really old");
			}
			else
			{
				System.out.println("You are not that old");
			}
		}
}

