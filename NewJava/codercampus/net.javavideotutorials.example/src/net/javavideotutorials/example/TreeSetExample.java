package net.javavideotutorials.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

  public static void main(String[] args) {
    // generally we favor programming to interface by being generic as possible.
    // hence the hashset is a type of Set so easier to confirm from hashset to treeset
    // instantiation
    
    // If we are consider with ordering of our input, when we print, we could change the HashSet to TreeSet without
    // any compilation errors
    
    Set<Integer> myHashSet = new TreeSet<Integer>();
    

    myHashSet.add(5);
    myHashSet.add(10);
    myHashSet.add(15);
    myHashSet.add(20);
    myHashSet.add(56);
    myHashSet.add(25);
    myHashSet.add(30);
    
    // We are casting the HashSet into a TreeSet
    
    Iterator<Integer> itr = ((TreeSet)myHashSet).descendingIterator();
    while(itr.hasNext())
    {
      System.out.println(itr.next() + ",");
    }
    
  }
}