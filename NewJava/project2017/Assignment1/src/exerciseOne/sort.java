

package exerciseOne;

import java.util.Scanner;

public class sort {

		public static void main(String[] args)
		{
			int count[] = new int[14]; 
			LinkedList succ[] = new LinkedList[14];
			bagSack bag = new bagSack(); 
			int output[] = new int[14];
		  // Scanner input enable reading numbers from keyboard
		  Scanner input = new Scanner(System.in);  
		  
		  // i,j represents pairs in input, m is a pair and w is arbitrary constant
		  int i, j, w, n;
		  int m=0;	
		  
		  // read  n the size of the array
		  System.out.println("Enter input values:");
		   n = input.nextInt();
		   
		  //initialize the arrays: output, count and succ
		  for(w=1; w<=n; w=w+1)
		  {
			  count[w]=0;
			  succ[w] = new LinkedList();
		  }
		  // start inputting pairs
		  while(input.hasNext())
		  {
			  i=input.nextInt();
			  j=input.nextInt();
			  if(i==0 && j==0)
			  {
				  break;
			  }
			  count[j] = count[j]+1; //increase count[j] by 1
			  succ[i].add(j); //insert j to the LinkedList of i
			  m = m + 1;
		  }
		 
		input.close();
		
		// initialize bag
		for (w = 1; w <= n; w = w + 1)
		{
		if (count[w] == 0)  // Checking cases where there exist no predecessors, then we add into the bag
			{
				bag.append(w);
			}
		}
		System.out.println("succ array:" );
		for(i=1; i<=n; i=i+1){
			succ[i].print();
			System.out.println("");
		}
		System.out.println("count array:");
		for (i=1; i<=n; i=i+1){
			System.out.println(count[i] + " ");
		}
}
}
		// top sorting
		//topsorts();
		// System.out.println("number of all topsorts = " + total);
		
		  