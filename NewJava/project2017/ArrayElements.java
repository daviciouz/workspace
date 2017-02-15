/* Array elements as counters */

import java.util.Random;

class ArrayElements{
	public static void main(String[] args){
		
/* initialize random function and new array freq. */

		Random rand = new Random();

/* This array will contain 7 elements because we shall not be considering
 *  the 0 as part of numbers showing up in the toss of a dice */
  
		int freq[]= new int[7]; 	

/* One will be added to any number 
	shows up in the dice tossing using the random function */
	
		for(int roll=1;roll<1000;roll++){
		++freq[1+rand.nextInt(6)];  
			}
	
		System.out.println("Face\tFrequency");
	
		for(int face=1;face<freq.length;face++){
			System.out.println(face+"\t"+freq[face]);
		}
	}
	

}
