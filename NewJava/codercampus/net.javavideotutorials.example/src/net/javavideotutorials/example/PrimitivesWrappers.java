package net.javavideotutorials.example;

public class PrimitivesWrappers {
  //non-primitives will require initialization when created. 
  static Integer j = 2;
  static Integer k = 24;
  static String w = "4";

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    
    // will return a String object representing this Integer's value
    System.out.println("Output of j: ");
    output1(j.toString());
    
    System.out.println("Output of w: ");
    output2(Integer.parseInt(w));
    
    // toString object has a lot of features we can use
    
    System.out.println("Output of k: ");
    System.out.println(k.floatValue());

  }

  // a method to demonstrate conversion of Integer to Sting.
  // This only works when non-primitives are used and this method accept
  // say only Strings.
  
  public static void output1(String output){
    System.out.println(output);
    
  }
  
  public static void output2(int output){
    System.out.println(output);
    
  }
  
}
