public class ASearch {


	private Entry[] catalogue;
	private int current;
	
	/*
	 * Assume 10 entries
	 */
	public ASearch(){
		catalogue = new Entry[10];
		current = 0;
	}
	
	/*
	 * Ignores adding if full (should really be handled by exception...)
	 */
	public void addEntry(Entry e){
		if(current < 10){
			catalogue[current++] = e;
		}
	}
	
	
	/**
	 * Performs a linear search on the catalogue array to find an entry by name.
	 *
	 * Time Complexity: O(N)
	 * Reason: In the worst case, all N elements may need to be scanned before a match is found or determined absent.
	 *
	 * @param name, the person’s name to search for in the catalogue
	 * @return the associated phone number if found, otherwise -1
	 */
	public int linearSearch(String name){
		
		for (int i=0; i<current; i++) {
			if (catalogue[i].getName().equals(name)) {
				return catalogue[i].getNumber();
			}
		}
		return -1;
	}

	
	/**
	 * Performs a recursive binary search on the sorted catalogue array.
	 *
	 * Time Complexity: O(log N)
	 * Reason: The array is divided in half at each step, reducing the problem size exponentially.
	 *
	 * @param first the starting index of the current search range
	 * @param last the ending index of the current search range
	 * @param name the person’s name to search for
	 * @return the associated phone number if found, otherwise -1
	 */
	private int binarySearch(int first,int last,String name){
		
		if (first > last) {
			return -1;
		}
		
		else {
			int middle = (first + last)/2;
			
			String middle_name = catalogue[middle].getName();
			
			
			if (middle_name.equals(name)) {
				return catalogue[middle].getNumber();
			}
			
			else if (middle_name.compareTo(name) > 0) {
				return binarySearch(first, middle-1, name); 
			}
			
			else {
				return binarySearch(middle+1, last, name);
			}
		}
	}

	// helper method exposed to the programmer
	public int binarySearch(String name){
		return binarySearch(0,current-1,name);
	}
	
	
}
