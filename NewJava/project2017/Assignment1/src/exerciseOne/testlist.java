package exerciseOne;

public class testlist {
	public static void main(String[] args){
		LinkedList L = new LinkedList();
		L.add(1);
		L.add(3);
		L.add(4);
		
		LinkedList.Node snode = L.head;
		while(snode.next!= null)
		{
			System.out.println(snode.next.data);
			snode.next = snode.next.next;
			
		}
	}

}
