package net.javavideotutorials.example;

/* Demonstrating the use of an interface
 * 
 */

public class Motorcycle implements Vehicle{
  
  public Integer getNumSeats(){
    return 2;
  }
  
  public Integer getNumWheels(){
    return 2;
  }
  
  public String toString(){
    String toString = "Num of Seats: " + getNumSeats() +
        "\nNumber of Wheels: " + getNumWheels();
    return toString;
  }
  
}
