package net.javavideotutorials.example;

/* Demonstrating the use of an interface
 * 
 */

public class Bus implements Vehicle {
  
  public Integer getNumSeats(){
    return 35;
  }
  
  public Integer getNumWheels(){
    return 10;
  }
  
  public String toString(){
    String toString = "Num of Seats: " + getNumSeats() +
        "\nNumber of Wheels: " + getNumWheels();
    return toString;
  }

}
