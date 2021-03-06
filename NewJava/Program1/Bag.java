//Defining Class Bag (i.e. actions that can be done within/outside the bag)

public class Bag{
	public static class Node{
		int data;
		Node next;
		Node prev;
		Node (int x, Node prev, Node next){
			this.data=x;
			this.prev=prev;
			this.next=next;
		}
	}
	Node head;
	int size;
	public Bag(){
		head = new Node(0, null, null);
		head.prev = head;
		head.next = head;
		size = 0;
	}
	public void append(int x){
		Node p = new Node(x, head.prev, head);
		p.prev.next = p;
		p.next.prev = p;
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
	public void removeALlFrom(Node p, int size){
		p.next = head;
		head.prev = p;
		this.size = size;
	}
}