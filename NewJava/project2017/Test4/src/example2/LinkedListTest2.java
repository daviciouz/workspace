package example2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;



public class LinkedListTest2 {
	
	@Test
	public void should_add_new_element_to_linkedlist1()
	{
		// arrange
		LinkedList1<Integer> sut = new LinkedList1<Integer>();  // We are saying the Integer should replace the T
		
		// act
		sut.add(5);
		
		// assert
		assertThat(sut.get(5), is(5));
	}
	
	@Test
	public void should_add_multiple_elements_to_linkedlist1()
	{
		// arrange
		LinkedList1<Integer> sut = new LinkedList1<Integer>();  // We are saying the Integer should replace the T
		
		// act
		sut.add(7);
		sut.add(4);
		sut.add(9);
		sut.add(3);
		
		// assert
		assertThat(sut.get(7), is(7));
		assertThat(sut.get(4), is(4));
		assertThat(sut.get(9), is(9));
		assertThat(sut.get(3), is(3));
	}
	
	

	@Test
	public void should_remove_first_element_from_Linkedlist1()
	{
		// arrange
		LinkedList1<Integer> sut = new LinkedList1<Integer>();  // We are saying the Integer should replace the T
		
		// act
		sut.add(7);
		sut.add(4);
		sut.add(9);
		sut.add(3);
		
		sut.remove(7);
		
		// assert
		assertNull(sut.get(7));
		assertThat(sut.get(4), is(4));
		assertThat(sut.get(9), is(9));
		assertThat(sut.get(3), is(3));
	}
	
	@Test
	public void should_remove_middle_element_from_Linkedlist()
	{
		// arrange
		LinkedList1<Integer> sut = new LinkedList1<Integer>();  // We are saying the Integer should replace the T
		
		// act
		sut.add(7);
		sut.add(4);
		sut.add(9);
		sut.add(3);
		
		sut.remove(9);
		
		// assert
		assertThat(sut.get(7), is(7));
		assertThat(sut.get(4), is(4));
		assertNull(sut.get(9)); 
		assertThat(sut.get(3), is(3));
	}
	
	@Test
	public void should_remove_last_element_from_Linkedlist()
	{
		// arrange
		LinkedList1<Integer> sut = new LinkedList1<Integer>();  // We are saying the Integer should replace the T
		
		// act
		sut.add(7);
		sut.add(4);
		sut.add(9);
		sut.add(3);
		
		sut.remove(3);
		
		// assert
		assertThat(sut.get(7), is(7));
		assertThat(sut.get(4), is(4));
		assertThat(sut.get(9), is(9));
		assertNull(sut.get(3));
	}
	
	
	@Test
	public void should_remove_last_element_from_Linkedlist_and_successfully_add_new_element()
	{
		// arrange
		LinkedList1<Integer> sut = new LinkedList1<Integer>();  // We are saying the Integer should replace the T
		
		// act
		sut.add(7);
		sut.add(4);
		sut.add(9);
		sut.add(3);
		
		sut.remove(3);
		
		sut.add(8);
		sut.add(5);
		
		// assert
		assertThat(sut.get(7), is(7));
		assertThat(sut.get(4), is(4));
		assertThat(sut.get(9), is(9));
		assertNull(sut.get(3));
		assertThat(sut.get(8), is(8));
		assertThat(sut.get(5), is(5));
		
	}
	
	
}
