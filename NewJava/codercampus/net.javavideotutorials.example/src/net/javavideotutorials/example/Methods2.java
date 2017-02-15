package net.javavideotutorials.example;

public class Methods2 {
  public static void main(String[] args){
   
  boolean userValid = isValidUser("Stephen");
  
  if(userValid == true)
  {
    System.out.println("The user is valid, and He will allow them to use our system.");
  }
  else
  {
    System.out.println("The user is NOT valid, please re-enter your credentials.");
  }
 }
  
  // Performing validation assuming db exist
  public static boolean isValidUser(String username){
    //compare the username with what's in the database
    //and also the password
    
    return true;
     
  }
}
