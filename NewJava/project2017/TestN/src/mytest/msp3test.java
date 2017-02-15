package mytest;

import java.lang.*;
import java.util.Scanner;

public class msp3test {
	static int maxprod;
	static int a [];
	public msp3test(){  					// default constructor 
	}
	
public static int msp3(int[] a, int p1, int p2) {

    if (p1 == p2) {
        if (a[p1] != 0) {
            maxprod = a[p1];
        } else {
            maxprod = 0;
        }

    } else {
        int m = (p1 + p2) / 2;

        int L = msp3(a, p1, m);
        int R = msp3(a, m + 1, p2);

        int prodlt = 1, prodrt = 1, PL = 0, PR = 0;

        int checkForSplit = 0;

        for (int i = m; i >= p1; i--) {

            if (a[i] != 0) {
                prodlt = prodlt * a[i];

                if (prodlt > PL) {
                    PL = prodlt;
                }
            } else {
                if (i == m) {
                    prodlt = 1;
                    checkForSplit = 1;
                }
            }
        }

        for (int i = m + 1; i <= p2; i++) {
            if (a[i] != 0) {
                prodrt = prodrt * a[i];

                if (prodrt > PR) {
                    PR = prodrt;
                }
            } else {
                if (i == m + 1) {
                    prodrt = 1;
                    checkForSplit = 1;
                }
            }
        }

        if (checkForSplit == 0) {
            maxprod = max3(L, R, PL * PR);
        } else {
            maxprod = max3(L, R, PL);
            maxprod = max(maxprod, PR);
        }

    }
    return maxprod;
	}

	private static int max(int maxprod2, int PR) 
	{
	
	return Math.max(maxprod2, PR);
	}


	private static int max3(int l, int r, int i) 
	{
	return l > r ? l > i ? l : i : r > i ? r : i;
	}
	
    public static void main( String [ ] args )
    {
        
    	Scanner input = new Scanner(System.in);
	      int n;
	   
	      System.out.println("Enter the Array size N:");
	      
	      n = input.nextInt();
	      int[] a = new int[n];
	     
	      for (int i=0; i<n; i++)
	      {
	    	  a[i] =input.nextInt(); 
	    	  
	      }
	      
	      input.close();
	      System.out.println("*******************************");
	      System.out.println("Input Elements: ");
	     
	      for(int i =0; i<n; i++)
	      {
	    	  System.out.print(a[i]+" ");
	      }
	      System.out.println("");
	      
	      int p1 = 0;  
	      int p2 = a.length-1;
        
	      maxprod = msp3(a,p1,p2);
	      
	      System.out.println("*******************************");
        
	      System.out.println("Max product: " + maxprod);
	      System.out.println("*******************************");
	      System.out.println("First position: " + p1);
	      System.out.println("*******************************");
	      System.out.println("Last  position: " + p2);
	     
    	
    }
    
	
}


