class LinkedListTest 
{
    public static void main(String[] args) 
    {
            LinkedList list = new LinkedList();

            list.insertFirst("cat");
            list.insertFirst("dog");
            list.insertFirst("fish");
            list.insertFirst("cow");
            list.insertFirst("horse");
            list.insertFirst("pig");
            list.insertFirst("chicken");

            list.add(3, "mouse");

            list.print();
    }   
}