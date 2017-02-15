
public class ArrayStack implements Stack
{
	/* Default length of the array */
	public static final int CAPACITY = 1000;
	/* Length of the array used to implement the stack */
	public int capacity;
	/* Array used to implement the stack*/
	Object S[];
	/* Initializes the stack to empty */
	int top = -1;
	/* Initialize the stack to default CAPACITY */
	
	public ArrayStack()
	{
		this(CAPACITY);
	}
	
	/* Initialize the stack to be of the given length */
	public ArrayStack(int c)
	{
		capacity = c;
		S = new Object[capacity];
	}

	/* Implementation of size() */
	public int size()
	{
		return (top+1);
	}

	/* Implementation of isEmpty() */
	public boolean isEmpty()
	{
		return (top < 0);
	}

	/* Implementation of top() */
	public Object top()
	{
		if (isEmpty()) throw new StackException("Stack empty.");
		return S[top];
	}
	
	/* Implementation of pop() */
	public Object pop()
	{
		Object item;
		if (isEmpty())throw new StackException("Stack underflow.");
		item = S[top];
		S[top--] = null;
		return item;
	}

	/* Implementation of push() */
	public void push(Object item)
	{
		if (size()==capacity)throw new StackException("Stack overflow.");
		S[++top]=item;
	}
}
