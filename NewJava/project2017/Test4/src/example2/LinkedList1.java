package example2;


public class LinkedList1 <T> 		// generic type
{
	private Node1<T> head;
	private Node1<T> tail;

	public void add(T element)
	{
		 Node1<T> newNode1 =	new Node1<T>(element, null); 
		
		// create a new Node1 with an element in it also defined in 
		//constructor and assign to variable newNode1 of Type T Head and Tail are pointing to the new Node1   
		
		  // if the LinkedList is empty
		  
		  if(head == null)
		  {
			  head = newNode1;								
			  tail = newNode1;								  
		  }	
		  else
		  {
			  tail.setNext(newNode1);
			  tail = newNode1;
		  }
	}
	
	public T get(T element) // Return and get a generic type Hence T represent element type and what method returns
	{
		if (head.getElement().equals(element))
		{
			return head.getElement();
		}
		else
		{
		  Node1<T> current = head.getNext();
		  while (current.getNext()!= null)
		  {
			  if(current.getElement().equals(element))
			  {
				  return current.getElement();
			  }
			  
			  current = current.getNext();
			  
			  if(current.getElement().equals(element))
			  {
				  return current.getElement();
			  }
		  }
		  
		}
		
		return null;
	}
	
	public void remove(T element)
	{
		if(head.getElement().equals(element))
				{
				 head = head.getNext();
				}
		else
		{
			Node1<T> current = head;
			Node1<T> next = head.getNext();
			
			while (next != null)
			{
				if(next.getElement().equals(element))
				{
					current.setNext(next.getNext());
					// we're removing the tail
					if(next.getNext() == null)
					{
						tail = current;
					}
					return;
				}
				
				current = next;
				next = next.getNext();
			}
		}
	}

}
