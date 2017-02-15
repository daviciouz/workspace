package net.javavideotutorials.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;



public class TestExceptions {
  
  public static void main(String[] args) throws IOException
  {
    
    // The declaration of the variable is outside the try block so other objects can access it.
    // we could put it within the try block and it will not work but not accessible by other objects
    
    FileReader filereader = null;
    
    try
    {
      filereader = new FileReader(new File("/home/stepsei/troubleshoot.txt"));
      System.out.println("file read successfully");
    }
    catch(FileNotFoundException e){
      System.out.println("File not found in location");
      
    }
    
    catch(Exception ex){
      System.out.println("File2 not found in location");
      
    }
    // it is used to clean the activities of try and catch. Additionally disabling mutex
    // and other read and write privileges so another program or resource can use it.
    finally
    {
      filereader.close();
      
    }
    System.out.println("End program");
  }

}
