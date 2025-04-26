import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LinkedListTest {

	LinkedList l;
	
	@Before
	public void setup(){
		l = new LinkedList();
	}
	
	@Test
	public void testSizeEmpty() {
		// Verifies that size() returns 0 for an empty linked list
		assertEquals(0,l.size());
	}

	@Test
	public void testSizeMany() {
		// Verifies size() returns the correct count after adding element
		l.addAtHead(1);
		l.addAtHead(2);
		l.addAtHead(3);
		assertEquals(3,l.size());
	}
	
	@Test
	public void testSizeTwice() {
		// Ensures repeated calls to size() return consistent results
		l.addAtHead(1);
		l.addAtHead(2);
		l.addAtHead(3);
		assertEquals(3,l.size());
		assertEquals(3,l.size());
	}

	@Test
	public void testTotalEmpty() {
		//  Verifies total() returns 0 for an empty linked list
		assertEquals(0,l.total());
	}

	@Test
	public void testTotalMany() {
		// Verifies total() returns the correct sum after adding elements
		l.addAtHead(1);
		l.addAtHead(2);
		l.addAtHead(3);
		assertEquals(6,l.total());
	}
	
	@Test
	public void testTotalTwice() {
		// Ensures repeated calls to total() return consistent results
		l.addAtHead(1);
		l.addAtHead(2);
		l.addAtHead(3);
		l.addAtHead(4);
		assertEquals(10,l.total());
		assertEquals(10,l.total());
	}
	
	@Test(expected=LinkedListException.class)
	public void testRemoveAtHeadEmpty() {
		l.removeAtHead();
	}
	
	@Test(expected=LinkedListException.class)
	public void testRemoveAtTailEmpty() {
		l.removeAtTail();
	}

}
