class myArrays3{
	public static void main(String[] args){
		System.out.println("Index\tValue");
		int stepsei[]={5,6,7,9,29,59,48,68};
		
/* we use counter to represent our index */
/* note in for loop we used < instead of usual <= because when equal to it
   could give arrayIndex out of bounds because of the start index 0 */
 
		for(int counter=0; counter<stepsei.length; counter++){
			System.out.println(counter + "\t" + stepsei[counter]);
		}
		
	}
	
}
