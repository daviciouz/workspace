package net.javavideotutorials.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

  public static void main(String[] args) {
    List<String> myLinkedList = new LinkedList <String>();
    
    myLinkedList.add("H");
    myLinkedList.add("E");
    myLinkedList.add("L");
    myLinkedList.add("L");
    myLinkedList.add("O");
    myLinkedList.add("!");
    myLinkedList.add("!");
    
    System.out.println("What's in my linkedlist? " + myLinkedList.toString());
    
    System.out.println("Let remove the 4th element from the linkedlist, which is the letter '" +
    myLinkedList.remove(3) + "'. ");
    System.out.println("What's in my Linkedlist? " + myLinkedList.toString());
    
    //traversing the linkedlist using the iterator (next)
    //we need to instantiate the iterator before we can use it.
    
    Iterator<String> itr = myLinkedList.iterator();
    while (itr.hasNext())
    {
      System.out.print(itr.next());
    }
    
    System.out.println();
    
    System.out.println("Using for loop to iterate: ");
    
    // Or using for loop
    
    for (String letter : myLinkedList)
    {
      System.out.print(letter);
    }
    
    
    

  }

}
