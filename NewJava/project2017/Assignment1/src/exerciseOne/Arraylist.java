package exerciseOne;

import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args)
	{
	  //initialize array
	  LinkedList[] predCount = new LinkedList[10];
	    
	  //initialize array elements(objects of LinkedList)
	    Scanner input = new Scanner(System.in);
	    int i = 0, m = 11;
	    
	    while(i!=m){
	    	System.out.println("Enter input values: \n");
	    	  int temp = input.nextInt();
	    	  int temp2 = input.nextInt();
	    	  
	    for (int j=0; j<5; j++)
	       predCount[i]=new LinkedList();
	    
	    // initializing the list before adding 
	    if (predCount[temp] == null) {
	       predCount[temp] = new LinkedList();
	    }
	    
	    predCount[temp].add(temp2);
	    i++;
	    System.out.println("list "+predCount[i]);
	    }	    
	}
}

//6
//1 3
//1 2
//1 5
//2 7
//2 4
//2 9

