package net.javavideotutorials.example;

public class ThisKeyword {

  public static void main(String[] args)
  {
      //the instance after new is called no argument constructor hence ()
      HumanBeing human = new HumanBeing();
      
      System.out.println("Name: " + human.getName()+ ", Age: "+ human.getAge());
      
      //Alternatively
      human = new HumanBeing("Stephen Osei-Akoto", 40);
      System.out.println("Name: " + human.getName()+ ", Age: "+ human.getAge());
  }

}
