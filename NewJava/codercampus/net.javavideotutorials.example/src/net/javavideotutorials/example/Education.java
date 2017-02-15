package net.javavideotutorials.example;

/* Using Abstract Object
 * 
 */

public abstract class Education {
  
  public abstract Integer getStatus();
  public abstract Integer getFaculty();
  public abstract Integer getFunds();
  
  
  public String getColor(){
    
    return "Red";
    
  }
  
  @Override
  public String toString(){
    String toString = "University Ranking: " + getStatus() +
        "\nNumber of Faculty Members: " + getFaculty() +
        "\nAnnual Funds: " + getFunds() +
        "\nUniversity Color: " + getColor();
    return toString;
  }

}
