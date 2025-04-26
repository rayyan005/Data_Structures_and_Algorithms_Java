import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ASearchTest {

	ASearch as;
	
	@Before
	public void setup(){
		as = new ASearch();
		as.addEntry(new Entry("Andrew",111));
		as.addEntry(new Entry("Ben", 543));
		as.addEntry(new Entry("Bob", 278));
		as.addEntry(new Entry("Brian", 419));;
		as.addEntry(new Entry("Ewen",321));
		as.addEntry(new Entry("Peter",123));
		as.addEntry(new Entry("Roger",222));
		
	}
	
	@Test
	public void testLinearSearchOK() {
		// test the linear search method for someone who's in the collection
		assertEquals(111,as.linearSearch("Andrew"));
	}

	@Test
	public void testLinearSearchFail() {
		// test the linear search method for someone who's not in the collection
		assertEquals(-1,as.linearSearch("Ethan"));
	}
	
	@Test
	public void testBinarySearchOK() {
		// test the binary search method for someone who's in the collection
		assertEquals(321,as.binarySearch("Ewen"));
	}
	
	@Test
	public void testBinarySearchFail() {
		// test the binary search method for someone who's not in the collection
		assertEquals(-1,as.binarySearch("Tom"));
	}
	
	@Test
	public void testBinarySearchBen() {
		assertEquals(543,as.binarySearch("Ben"));
	}
	
	@Test
	public void testBinarySearchBob() {
		assertEquals(278,as.binarySearch("Bob"));
	}
	
	@Test
	public void testBinarySearchBrian() {
		assertEquals(419,as.binarySearch("Brian"));
	}

}
