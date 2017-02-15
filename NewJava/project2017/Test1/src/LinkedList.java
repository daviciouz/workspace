public class LinkedList 
{
    private Link first;

    public LinkedList() 
    {
        first = null;
    }

    public void insertFirst(String word)
    {
           Link link = new Link(word);
           link.next = first;
           first = link;

           System.out.print(first.item + " ");
    }

    public String deleteFirst()
    {   
        Link temp = first;
        first = first.next;
        return temp.item;
    }

    public String get(int index)
    {
        Link current = first;
        while (index > 0) 
         {
             index--;
             current = current.next;
         }

         return current.item;           
    }

    public void add(int index , String someString)
    {

        Link current = first;

        while (index>0)
        {
            index--;
            current = current.next;
        }

    Link newLink = new Link(someString);
    newLink.next = current.next;
    current.next = newLink;
    current = newLink;

    }

    public void print()
    {
        System.out.println("-----------PRINTING LIST------------");
        Link current = first;
        while(!(current==null))
        {
            System.out.println(current.item);
            current = current.next;
        }
    }
}
