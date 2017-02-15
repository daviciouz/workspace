/* Summing items in an array */

class myArrays4{
	public static void main(String[] args){
		int stepsei[]={10,49,34,28,45,89};
		int sum=0;
		
		for(int i=0; i<stepsei.length; i++){
			sum+=stepsei[i];
		}
		
		System.out.println("Sum of items in this Array: " + sum);
		
	}
	
}
