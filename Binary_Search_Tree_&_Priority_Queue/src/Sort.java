
public class Sort {

	
	/**
	 * Sorts an array using a priority queue.
	 * 
	 * The effect of calling this method is that the input 'arr' array is
	 * updated in-place, rather than creating a new array holding the sorted value.
	 * 
	 * @param arr the array to be sorted in-place
	 */
	public static void sort(int[] arr){	

		PriorityQueue pq = new PriorityQueue(arr.length);
		
		// Insert all elements that are in the array into the priority queue
		for (int i = 0; i < arr.length; i++) {
		    pq.insert(arr[i]);
		}
		
		// Use removeMin() to remove elements from the priority queue and 
		// put it back into the array in the required order
		for (int i = 0; i < arr.length; i++) {
            arr[i] = pq.removeMin();
        }
	}
	
	public static void main(String[] args){
		int[] arr = {53,3,5,2,4,67};
		Sort.sort(arr);
		// should be printed in order
		System.out.println(arr[0]);
		System.out.println(arr[1]);	
		System.out.println(arr[2]);
		System.out.println(arr[3]);	
		System.out.println(arr[4]);	
		System.out.println(arr[5]);	
	}
	
}
