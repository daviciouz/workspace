package exerciseOne;


// The bag's data structure is a cyclic doubly linkedList 

public class bagSack{
	Node head;
	int size;
	static class Node{
		public int data;			// Data or a reference to data	
		public Node next;			// A reference to the next node	
		public Node prev;			// A reference to the previous node

		//Constructor
		public	Node (int x, Node prev, Node next){
			this.data=x;
			this.prev=prev;
			this.next=next;
		}
	}
	// Methods for Class BagSack
	// All method operations for the bag are single actions. thus Time Complexity: O(1)
	// size is used to remember the number of items in the list at any time
	
	public bagSack(){
		head = new Node(0, null, null);
		head.prev = head;
		head.next = head;
		size = 0;
	}
	public void append(int x){
		Node p = new Node(x, head.prev, head);
		p.prev.next = p;
		p.next.prev = p;
		this.size++;
	}
	public void remove(Node p){
		p.prev.next = p.next;
		p.next.prev = p.prev;
		this.size--;
	}
	public void restore (Node p){
		p.prev.next = p;
		p.next.prev = p;
		this.size++;
	}
	public void removeAllFrom(Node p, int size){
		p.next = head;
		head.prev = p;
		this.size = size;
	}
}	

