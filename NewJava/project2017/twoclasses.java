/* 
Using multiple classes in Java program Java program can contain more than one i.e. multiple classes. 
Following example Java program contain two classes: Computer and Laptop. Both classes have their own 
constructors and a method. In main method we create object of two classes and call their methods. */

// Using two classes in Java program

class Computer {
  Computer() {
    System.out.println("Constructor of Computer class.");
  }
 
  void computer_method() {
    System.out.println("Power gone! Shut down your PC soon...");
  }
 
  public static void main(String[] args) {
    Computer my = new Computer();
    Laptop your = new Laptop();
 
    my.computer_method();
    your.laptop_method();
  }
}
 
class Laptop {
  Laptop() {
    System.out.println("Constructor of Laptop class.");
  }
 
  void laptop_method() {
    System.out.println("99% Battery available.");
  }
} 