package net.javavideotutorials.example;

public class Objects {
  
  // the main method is part of the blueprint of the Objects class
  public static void main(String[] args){
    
    User theUser = new User();
    
    theUser.setUsername("Stephen");
    theUser.setPassword("P@SSword123");
    
    System.out.println(theUser.toString());
    
    // Statically we can refer to the securitylevel as
    
    if(User.securitylevel>1)
      System.out.println("Not Authorized");
    else
      System.out.println("Not Authorized");
    
    doSomething();
    
  }
  
  
  
  // creating a new method. IF this message is not static and we call it java will throw an error.
  // Unless we change it to static we can call it in main or any place within the Object (Class)
  public static void doSomething(){
    System.out.println("Do little");
  }

}
