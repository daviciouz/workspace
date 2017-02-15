package net.javavideotutorials.example;

public class calculator {
  
  public int add(int value1, int value2)
  {
    return value1 + value2;
  }
  
  public int add(double value1, int value2)
  {
    //eg: 6.05 + 1 will be 6.05 + 1.00 = 7.05 cast to int(7)
    return (int)(value1 + value2);
  }
  
  public double add(double value1, double value2)
  {
  
    return  value1 + value2;
  }
  
  /**
   * This method performs subtraction 
   * @param value1: first integer value
   * @param value2: second integer value
   * @return value2 - value1
   */

  public int subtract(int value1, int value2)
  {
    return value2 - value1;
  }

  public int subtract(double value1, int value2)
  {
    return (int)(value2 - value1);
  }
  
  public double subtract(double  value1, double value2)
  {
    return value2 - value1;
  }
  
}
