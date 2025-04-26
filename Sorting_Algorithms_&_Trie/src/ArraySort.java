import java.util.ArrayList;
import java.util.Iterator;

public class ArraySort {

	/** Insertion sort of an array
	 * @param arr the array to be sorted in-place
	 */
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int cur = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > cur) {
				arr[j + 1] = arr[j--];
				arr[j + 1] = cur;
			}
		}
	}

	/** Insertion sort of an array
	 * 
	 * Time Complexity: O(N^2)
	 * 
	 * @param arr the array to be sorted in-place
	 */
	public static void bubbleSort(int[] arr) {
		
		boolean swaps = true;
		
		while(swaps) {
			swaps = false;
			
			//step through the array from beginning to end
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i + 1] < arr[i]) {
					
					//swap the elements
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swaps = true;
				}
			}
		}
	}

	/** Quick sort of an array. This method creates a new array with
	 * its values sorted, based on the values in the unsorted input array S.
	 * 
	 * Time Complexity: O(N log N)
	 * 
	 * @param S the unsorted input array
	 * @return the sorted output array
	 */
	public static ArrayList<Integer> quickSort(ArrayList<Integer> S) {

		//If list has 0 or 1 elements, return list as it is
		if (S.size() <= 1) {
			return S;
		}
		
		//Choosing first element as pivot element
		int pivot = S.get(0);
		
		ArrayList<Integer> L = new ArrayList<>();
		ArrayList<Integer> E = new ArrayList<>();
		ArrayList<Integer> G = new ArrayList<>();
		
		
		while(!S.isEmpty()) {
		
			//getting and deleting the first element 
			int val = S.remove(0);
		
			if (val < pivot) {
				L.add(val);
			} else if (val == pivot) {
				E.add(val);
			} else {
				G.add(val);
			}
		}
		
		//Performing quick sort on L and G
		ArrayList<Integer> sortedL = quickSort(L);
		ArrayList<Integer> sortedG = quickSort(G);
		
		//Combining all 3 sorted ArrayLists into one 
		ArrayList<Integer> combinedLists = new ArrayList<>();
		combinedLists.addAll(sortedL);
		combinedLists.addAll(E);
		combinedLists.addAll(sortedG);
		
		return combinedLists;
	}

	
	/** predicate to check if array is sorted
	 * @param arr the array to be checked
	 * @return true if the array is sorted, false otherwise
	 */
	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			if (arr[i] > arr[i + 1])
				return false;
		return true;
	}

	
	/** predicate to check if arrayList is sorted.
	 *  Useful for checking ArrayList<Integer> lists returned
	 *  from Quick Sort.
	 * 
	 * @param arr the array to be checked
	 * @return true is the aray is sorted, flalse otherwise
	 */
	public static boolean isSorted(ArrayList<Integer> arr) {
		Iterator i = arr.iterator();
		int val;
		if (i.hasNext())
			val = (int) i.next();
		else
			return true;
		while (i.hasNext()) {
			int nv = (int) i.next();
			if (val > nv)
				return false;
			val = nv;
		}
		return true;
	}

	
	/** Helper printing methods for testing
	 * @param arr the array to print
	 */
	private static void printIntArray(int[] arr) {
		System.out.print("[ ");
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println(" ]");
	}

	private static void printIntArrayList(ArrayList<Integer> arr) {
		System.out.print("[ ");
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println(" ]");
	}

	public static void main(String[] args) {
		// testing part1
		int[] arr1 = { 5, 4, 3, 2, 1 };
		bubbleSort(arr1);
		printIntArray(arr1);

		// testing part2
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(3);
		arr2.add(1);
		arr2.add(6);
		arr2.add(5);
		ArrayList<Integer> arr2_sorted = quickSort(arr2);
		printIntArrayList(arr2_sorted);
		// {5,4,3,5,1};

	}

}
