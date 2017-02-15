package exerciseOne;


public class LinkedList{
	public class Node{
		public int data;
		public Node next;
		public Node() {
			this.data = 0;
			this.next = null;
		}
	}
	public Node head;
	public LinkedList() {
		head = new Node();
	}
	
	public void add(int data){
		Node pnode = new Node();
		pnode.data = data;
		pnode.next = head.next;
		head.next = pnode;
	}
	
	public void print(){
		Node pnode = new Node();
		pnode = this.head;
		while(pnode.next != null){
			pnode = pnode.next;
			System.out.print(pnode.data + " ");
		}
	}
}