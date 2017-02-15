
import java.util.*;  
 
public class ArrayScratch {  
    String[] x = {"A", "B", "C", "D"};  
    String[] growableArray;
    public static void main(String[] args) {  
        ArrayScratch  gat = new ArrayScratch ();  
 
        System.out.println("x before grow: " + Arrays.toString(gat.x));  
        gat.growArray(gat.x,9);  
        System.out.println("x after grow: " + Arrays.toString(gat.growArray(gat.x,9)));  
    }  
 
    private String[] growArray(String[] x, int increasedSize) {
        growableArray =  new String[increasedSize];
        for(int i=0;i<x.length;i++){
            growableArray[i] = x[i];
        }
        x=growableArray;
        return x;
         
        // Mansukhdeep, your job is to write, test and debug this method.  
        // Ignore anything else about ArrayLists, etc.  
        // All you care about is making this method work.  
    }  
}