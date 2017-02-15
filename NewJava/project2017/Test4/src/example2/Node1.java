package example2;

public class Node1 <T>
{
	private T element;
	private Node1<T> next; 	// pointer to the next node
	
	public Node1(T element, Node1<T> next) // constructor that takes an element and the next node
	{
		this.element = element;
		this.next = next;
	}
	
	public T getElement() 
	{
		return element;
	}
	public void setElement(T element) 
	{
		this.element = element;
	}
	public Node1<T> getNext() 
	{
		return next;
	}
	public void setNext(Node1<T> next) 
	{
		this.next = next;
	}
	
	
}

