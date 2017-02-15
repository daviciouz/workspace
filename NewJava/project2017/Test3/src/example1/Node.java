package example1;

public class Node <T>
{
	private T element;
	private Node<T> next; 	// pointer to the next node
	
	public Node(T element, Node<T> next) // constructor that takes an element and the next node
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
	public Node<T> getNext() 
	{
		return next;
	}
	public void setNext(Node<T> next) 
	{
		this.next = next;
	}
	
	
}

