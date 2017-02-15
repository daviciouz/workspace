/* This program fetches random numbers with a dice as an example */

import java.util.Random;

class myRandom{
	public static void main(String[] args){
		Random dice = new Random();
		int number;
		
		for(int counter=1; counter<=6; counter++){
			number = 1 + dice.nextInt(6);	
			
/* The dice can only have 1 - 6 nos. we use the 1 to add to the 0 - 5 that 
  computer will give so we still have our dice range. */
		
			System.out.println(number + " ");
		}
	}
	
}
