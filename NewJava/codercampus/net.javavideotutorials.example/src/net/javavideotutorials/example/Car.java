package net.javavideotutorials.example;

/* Demonstrating the use of an interface
 * 
 */

public class Car implements Vehicle {
  
  public Integer getNumSeats(){
    return 5;
  }
  
  public Integer getNumWheels(){
    return 4;
  }
  
  public String toString(){
    String toString = "Num of Seats: " + getNumSeats() +
        "\nNumber of Wheels: " + getNumWheels();
    return toString;
  }

}
