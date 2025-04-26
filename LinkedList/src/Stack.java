class StackException extends RuntimeException{    
		public StackException(String err) {
			super(err);
		}
}

public class Stack implements StackADT {
	
	private class Node{
		int element;
		Node next;
		
		public Node(int e, Node n){
			element = e;
			next = n;
		}
		
		public int getValue() {
			return element;
		}
		
		public Node getNext() {
			return next;
		}
	}
	
	// this is a reference to the head node of the linked list
	private Node top;
	
	// keep track of the number of elements in the stack
	private int size;
	
	public Stack(){
		top = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public int size(){
		return size; 
	}
	
	
	/** Adds a new element to the stack
	 * 
	 * Time Complexity: O(1)
	 * Because: Adding a node to the top does not require traversal.
	 * 
	 * @param o the integer to add to the top of the stack
	 */
	public void push(int o){
		Node newNode = new Node(o, top);
		top = newNode;
		size+=1;
	}
	
	
	/** 
	 * Removes and returns the value at the top of the stack.
	 * 
	 * Time Complexity: O(1)
	 * Because: We remove the top node directly without traversal.
	 *
	 * @return the integer that was at the top of the stack
	 * @throws StackException if the stack is empty
	 */
	public int pop() throws StackException{
		if (isEmpty()) {
			throw new StackException("empty stack");
		}
		
		int removedVal = top.getValue();
		top = top.getNext();
		size-=1;
		return removedVal;
	}
	
	
	/** 
	 * Returns the value at the top of the stack without removing it.
	 *
	 * Time Complexity: O(1)
	 * Because: We access the top node directly.
	 * 
	 * @return the integer at the top of the stack
	 * @throws StackException is the stack is empty
	 */
	public int top() throws StackException{
		if (isEmpty()) {
			throw new StackException("empty stack");
		}
		
		int topValue = top.getValue();
		return topValue;
	}
	
}
