package net.javavideotutorials.example;

import java.util.HashSet;
import java.util.Set;

public class hashSetExample1 {

  public static void main(String[] args) {
    
    //declare a HashSet
    Set<String> stepHash = new HashSet<String>();
    
    //Insert items into HashSet
    stepHash.add("Sena");
    stepHash.add("Abena");
    stepHash.add("Kwabena");
    stepHash.add("Kofi");
    stepHash.add("Serwaah");
    stepHash.add("Edem");
    
    //loop through our HashSet and print
    
    for(String astring: stepHash){
      System.out.println(astring);
    }
    
    

  }

}
