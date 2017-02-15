package net.javavideotutorials.example;

/* Demonstrating the use of an interface
 * 
 */

public class Runnable {
  
  public static void main(String[] args){
    
    Vehicle aVehicle = new Car();
    Vehicle bVehicle = new Bus();
    Vehicle cVehicle = new Motorcycle();
    
    
    System.out.println("******************************");
    System.out.println("Properties of a Car: ");
    System.out.println(aVehicle.toString());
    
    System.out.println("******************************");
    System.out.println("Properties of a Bus: ");
    System.out.println(bVehicle.toString());
    
    System.out.println("******************************");
    System.out.println("Properties of a Motorcycle: ");
    System.out.println(cVehicle.toString());
  }

}
