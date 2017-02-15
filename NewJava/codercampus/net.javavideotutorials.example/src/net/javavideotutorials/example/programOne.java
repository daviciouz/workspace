package net.javavideotutorials.example;

/* Using Abstract Object
 * 
 */

public class programOne {
  
      public static void main(String[] args){
        
        Education achoice = new University();
        Education bchoice = new Polytechnic();
        Education cchoice = new College();
        
        
        System.out.println("******************************");
        System.out.println("Info of a University: ");
        System.out.println(achoice.toString());
        
        System.out.println("******************************");
        System.out.println("Info of a Polytechnic: ");
        System.out.println(bchoice.toString());
        
        System.out.println("******************************");
        System.out.println("Info of a College: ");
        System.out.println(cchoice.toString());
    
  }

}
