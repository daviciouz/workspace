package net.javavideotutorials.example;

import java.util.HashSet;
import java.util.Set;

public class hashSetExample2 {

  public static void main(String[] args) {
    
    //declare a HashSet (We can only use primitives as variable types for HashSet
    Set<Integer> senaHash = new HashSet<Integer>();
    
    //Insert items into HashSet
    senaHash.add(85);
    senaHash.add(75);
    senaHash.add(105);
    senaHash.add(8);
    senaHash.add(15);
    senaHash.add(45);
    
    //loop through our HashSet and print
    
    for(Integer bInt: senaHash){
      System.out.println(bInt);
    }
}
  
}