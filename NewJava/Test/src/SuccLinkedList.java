public class SuccLinkedList {  
   public ListNode firstNode; //first ListNode of a SuccLinkedList.  
   public ListNode lastNode; //last ListNode of a SuccLinkedList.  
   public ListNode pointer; //pointer used to traverse through each SuccLinkedList for the removal and addition of predcount.  
   public int size;  
   public SuccLinkedList()  
   {  
     firstNode = null;  
     lastNode = null;  
     size = 0;  
   }  
    public void print()  
   {  
     ListNode p = firstNode;  
     while (p!=null)  
     {  
       System.out.print(p.data);  
       p = p.nextBag;  
     }  
     System.out.println();  
   }  
   public int size()  
   {  
     return size;  
   }  
   public void addListNode(ListNode add)  
   {  
     if (firstNode==null)  
     {  
       firstNode = add;  
       lastNode = add;  
     }  
     else  
     {  
       lastNode.nextBag = add;  
       add.previousBag = lastNode;  
       lastNode = add;  
     }  
   }  
   public void addListNode2(ListNode add)  
   {  
     if (firstNode==null)  
     {  
       firstNode = add;  
       lastNode = add;  
     }  
     else  
     {  
       lastNode.nextBag = add;  
       add.previousBag = lastNode;  
       lastNode = add;  
     }  
     size++;  
   }  
   public void pop()  
   {  
     if (firstNode.nextBag!=null){  
     firstNode = firstNode.nextBag;}  
     else {firstNode=null;lastNode =null;}  
     size--;  
   }  
   public int peek()  
   {  
     return firstNode.data;  
   }  
   public boolean isEmpty()  
   {  
     return (size ==0);  
   }  
   public void popLastNode()  
   {  
     if (lastNode.previousBag==null&&lastNode.nextBag ==null)  
     {  
       firstNode = null;  
       lastNode = null;  
     }  
     else if (lastNode.previousBag!=null&&lastNode.nextBag==null)  
     {  
       lastNode = lastNode.previousBag;  
       lastNode.nextBag =null;  
     }  
   }  
   public ListNode returnFirstListNode()  
   {  
     return firstNode;  
   }  
   public ListNode returnListNodeLast()  
   {  
     return lastNode;  
   }  
   public void popLastListNode()  
   {  
     lastNode.previousBag.nextBag=null;  
   }  
   public void addBag(int data) //adds a successor to a LinkedList. O(1)  
   {  
     ListNode succListNode = new ListNode(data);  
     if (firstNode==null)  
     {  
       firstNode = succListNode;  
       lastNode = succListNode;  
     }  
     else  
     {  
       lastNode.nextBag = succListNode;  
       lastNode.nextBag.previousBag = lastNode;  
       lastNode = succListNode;  
     }  
     size++;  
   }  
   public void addListNodeSuccessor(int data) //adds a successor to a LinkedList. O(1)  
   {  
     ListNode succListNode = new ListNode(data);  
     if (firstNode==null)  
     {  
       firstNode = succListNode;  
       lastNode = succListNode;  
     }  
     else  
     {  
       lastNode.next = succListNode;  
       lastNode.next.previous = lastNode;  
       lastNode = succListNode;  
     }  
   }  
   public class ListNode  
   {  
     int data;  
     ListNode next;  
     ListNode previous;  
     ListNode nextBag;  
     ListNode previousBag;  
     public ListNode(int data)  
     {  
       this.data = data;  
       next = null;  
       previous = null;  
       nextBag = null;  
       previousBag = null;  
     }  
     public int returnNodeValue()  
     {  
       return data;  
     }  
   }  
 }  