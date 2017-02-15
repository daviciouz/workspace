package net.javavideotutorials.example;

public class stringManipulation {

  public static void main(String[] args) {
    
    String astring = concatenate("He" , "lo");
    System.out.println("Result of concatenation: " + astring);
    
    String bstring = truncate("Test");
    System.out.println("Result of truncation: " + bstring);
    
    int searchResult = search("Graduates of temple university","temple");
    System.out.println("Result of Search:" + searchResult);
    
    int searchAndReplace = searchReplace("Roseline","os", "in");
    System.out.println("Result of Search and Replace:" + searchAndReplace);
   
   
    boolean isFound = doesStringContainSearchValue("Here comes the hot stepper", "hot");
    System.out.println("Result fo doesStringContainSearchValue: " + isFound);
    
    
  }

  private static int searchReplace(String string, String string2, String string3) {
    
    return 0;
  }

  private static int search(String string1, String string2) {
    // TODO Auto-generated method stub
    return string1.indexOf(string2);
  }

  private static String truncate(String string1) {
    // TODO Auto-generated method stub
    return string1.substring(0,3);
  }

  private static String concatenate(String string1, String string2) 
  {
    
    return string1 + string2;
  }

  private static boolean doesStringContainSearchValue(String string, String string2)
  {
    return string.indexOf(string2) >= 0;
  }

}

