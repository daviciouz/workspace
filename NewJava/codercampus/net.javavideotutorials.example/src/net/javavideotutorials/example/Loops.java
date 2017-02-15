package net.javavideotutorials.example;


public class Loops 
{
	
	public static void main (String[] args) throws InterruptedException
	{
		// for loops are used -> finite data
		// loop 10 times
		/*start; end; increment */
		
		// will run 100
		for (int i = 0; i < 10; i++)
		{
			for (int j=0; j< 10; j++)
			{
				System.out.println(j);
			}
		}
		
		// will run 81 times
		for (int i = 0; i < 9; i++)
		{
			for (int j=0; j< 9; j++)
			{
				System.out.println(j);
			}
		}
		
		// will run 225 times
		for (int i = 0; i < 15; i++)
		{
			for (int j=0; j< 15; j++)
			{
				System.out.println(j);
			}
		}
	}
}
