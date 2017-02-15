package net.javavideotutorials.example;

public class overrideAndoverload {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    System.out.print("The Additions****************************************\n");
    calculator mycalc = new calculator();
    System.out.println("mycalc.add(5,6) = "+ mycalc.add(5,6));
    
    // This is going to pick from the other add method based on the input we supply
    System.out.println("mycalc.add(6.55,6) = "+ mycalc.add(6.55,6));
    
    System.out.println("mycalc.add(6.55,6.78) = "+ mycalc.add(6.55,6));

    System.out.print("The Subtractions****************************************\n");
    
    calculator sub = new calculator();
    System.out.println("sub.subtract(5,6) = "+ sub.subtract(5,6));
    System.out.println("sub.subtract(6.55,6) = "+ sub.subtract(6.55,6));
    
    System.out.println("sub.subtract(6.55,6.78) = "+ sub.subtract(6.55,6.78));
    
  }

}
