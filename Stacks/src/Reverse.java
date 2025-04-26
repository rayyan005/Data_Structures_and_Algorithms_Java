
public class Reverse {

	/**
	 * Reversing a string array using a stack
	 * Time Complexity: O(n)
	 * 
	 * @param arr the array containing the elements to be reversed
	 */
	public static void reverse(String[] arr){ 

		
		//Creating a stack that will have the elements of the array and to use push() and pop() methods.
		Stack S = new Stack(arr.length);
		
		
		//Pushing the elements of the array into the stack.
		for (int i=0; i<arr.length; i++) {
			S.push(arr[i]);
		}
		
		//Pop elements from the stack and put back into the array.
		//This will put the elements in the reverse order.
		for (int i=0; i<arr.length; i++) {
			arr[i] = S.pop().toString();
		} 
		
	}
	
	
	
	
	
	
}
