package exampleThree;

public class arrayElements {
	
		public static void main(String[] args){
			
			 // declares an array of integers
	        int[] predCount;

	        // allocates memory for 10 integers
	        predCount = new int[10];
	           
	        // initialize first element
	        predCount[0] = 10;
	        // initialize second element
	        predCount[1] = 20;
	        // and so forth
	        predCount[2] = 30;

	        System.out.println("Element at index 0: " + predCount[0]);
	        System.out.println("Element at index 1: " + predCount[1]);
	        System.out.println("Element at index 2: " + predCount[2]);
		}
}