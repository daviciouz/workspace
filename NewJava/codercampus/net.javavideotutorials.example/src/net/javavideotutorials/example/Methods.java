package net.javavideotutorials.example;

public class Methods {
  public static void main(String[] args){
    System.out.println("Learning Java again");
    
    // we call the login method in main method
    
    login("Stephen");
    login("Sena");
    login("Abena");
    login("kwabena");
    
    // We can loop through the method.
    //for(int i=0;i<5;i++){
    //login();
    //}
    
  }
  
  // We create a sub method called login
  public static void login(String username){
    System.out.println("This is the login method and it's using the username: " + username);
    
  }

}
