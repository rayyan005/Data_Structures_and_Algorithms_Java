import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TrieTest {

	
	Trie trie;

	@Before
	public void setup() {
		trie = new Trie();
	}
	
	/**
	 * Tests for countAllWords() in the Trie class
	 * 
	 */

	@Test
	public void countAllWordsEmptyTest() {
		// test countAllWords() for an empty trie
		assertEquals(0, trie.countAllWords());
	}
 
	@Test
	public void countAllWordsTest() {
		// step 1: add some words to the trie
		trie.insert("hello");
		trie.insert("banana");
		trie.insert("android");
		trie.insert("asteroid");
		trie.insert("antelope");
		// step 2: test countAllWords() for the trie
		assertEquals(5, trie.countAllWords());
	}
	
	/** Returns true if two lists hold exactly the same set of value.
	 * 
	 *  The ordering of the values in the lists are ignored.
	 * @param expected_list The values that should be in the list
	 * @param actual_list The actual values in the list
	 * @return true if the sets are equal
	 */
	private boolean listsEqual(List<String> expected_list, ArrayList<String> actual_list) {
		return (expected_list.size() == actual_list.size() && expected_list.containsAll(actual_list)
				&& actual_list.containsAll(expected_list));
	}
	
	@Test
	public void wordsWithPrefixTestNonEmptyBA() {
		trie.insert("balls");
		trie.insert("balloon");
		trie.insert("ball");
		trie.insert("football");
		ArrayList<String> actual_list = trie.wordsWithPrefix("ba");
		List<String> expected_list = Arrays.asList("balls", "balloon", "ball");
		assertTrue(listsEqual(expected_list, actual_list));
	}
	
	@Test
	public void wordsWithPrefixTestEmptyA() {
		trie.insert("balls");
		trie.insert("balloon");
		trie.insert("ball");
		trie.insert("football");
		ArrayList<String> actual_list = trie.wordsWithPrefix("a");
		List<String> expected_list = Arrays.asList();
		assertTrue(listsEqual(expected_list, actual_list));
	}
	
	@Test
	public void wordsWithPrefixTestEmptyBAN() {
		trie.insert("balls");
		trie.insert("balloon");
		trie.insert("ball");
		trie.insert("football");
		ArrayList<String> actual_list = trie.wordsWithPrefix("ban");
		List<String> expected_list = Arrays.asList();
		assertTrue(listsEqual(expected_list, actual_list));
	}
	
	@Test
	public void wordsWithPrefixTestEmptyNoString() {
		trie.insert("balls");
		trie.insert("balloon");
		trie.insert("ball");
		trie.insert("football");
		ArrayList<String> actual_list = trie.wordsWithPrefix("");
		List<String> expected_list = Arrays.asList("balls","balloon","ball","football");
		assertTrue(listsEqual(expected_list, actual_list));
	}
	
	@Test
	public void wordsWithPrefixTestNonEmptyF() {
		trie.insert("balls");
		trie.insert("balloon");
		trie.insert("ball");
		trie.insert("football");
		ArrayList<String> actual_list = trie.wordsWithPrefix("f");
		List<String> expected_list = Arrays.asList("football");
		assertTrue(listsEqual(expected_list, actual_list));
	}
	

	/*
	 * More trie tests
	 */

	@Test
	public void searchTrue() {
		trie.insert("balls");
		trie.insert("a");
		trie.insert("balloon");
		assertTrue(trie.search("balls"));
		assertTrue(trie.search("balloon"));
		assertTrue(trie.search("a"));
	}

	@Test
	public void searchFalse() {
		trie.insert("balls");
		assertFalse(trie.search("bug"));
	}

	@Test
	public void deleteSearch() {
		trie.insert("balls");
		trie.insert("a");
		trie.insert("balloon");
		trie.delete("a");
		assertTrue(trie.search("balls"));
		assertTrue(trie.search("balloon"));
		assertFalse(trie.search("a"));
		trie.delete("balls");
		assertFalse(trie.search("balls"));
		assertTrue(trie.search("balloon"));
		assertFalse(trie.search("a"));
		trie.delete("balloon");
		assertFalse(trie.search("balls"));
		assertFalse(trie.search("balloon"));
		assertFalse(trie.search("a"));
	}
	
	
}
