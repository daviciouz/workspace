
import java.util.ArrayList;
import java.util.List;
 
public class ArrayListTest2 {
    public static void printList(List<int> mylist = new ArrayListTest2;) {
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println("mylist[" + i + "]: " + mylist.get(i));
        }
    }


 
    public static void main(String []args) {
        List<int> mylist = new ArrayList<int>();
        // append
        mylist.add(1);
        printList(mylist);
 
        mylist.add(0, 2);
        System.out.println("> Insert via index");
        printList(mylist);
 
        mylist.set(1, 3);
        System.out.println("> Update via index");
        printList(mylist);
 
        mylist.remove(0);
        System.out.println("> Remove via index");
        printList(mylist);
 
    }
}