public class ReverseStack {


	
	/**
     * Reverses the order of elements in a Stack using a temporary Queue.
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     * 
     * @param st Stack to be reversed
     */
	public static <T> void reverseStack(Stack<T> st){
		Queue<T> q = new Queue<T>(st.size()+1);
		
		// Transfer elements from stack to queue
		while (!st.isEmpty()) {
			q.enqueue(st.pop());
		}
		
		// Transfer elements back from queue to stack (now reversed)
		while(!q.isEmpty()) {
			st.push(q.dequeue());
		}
	}
	
	
	
	
}
