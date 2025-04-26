/*
 * Queue implementation with a linked list.
 */
public class LQueue {
	
	private class Node{
		Object element;
		Node next;
		
		public Node(Object e, Node n){
			element = e;
			next = n;
		}
		
		public Node(Object e){
			element = e;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public LQueue(){
		head = null;
		tail = null;	
		size = 0;
	}
	

	
	/**
     * Checks whether the queue is empty.
     * Time Complexity: O(1)
     */
    public boolean isEmpty(){
        return head == null;
    }
	
	
	/**
	 * 
	 * Returns the number of elements in the queue.
     * Time Complexity: O(1)
     * 
	 */
	public int size(){
		return size;
	}
	
	
	/**
	 * 
	 * Adds a new element to the tail of the queue.
	 *
	 * Time Complexity: O(1)
	 * 
	 */
	public void enqueue(Object o) {
		Node newNode = new Node(o);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size+=1;
		
	}
	
	
	/**
	 * 
     * Removes and returns the front element of the queue.
     * 
     * Time Complexity: O(1)
     * 
     */
	public Object dequeue() throws QueueException{
		if (isEmpty()) {
			throw new QueueException("empty queue");
		} else {
			Object removedElement = head.element;
			head = head.next;
			size-=1;
			return removedElement;
		}
	}
	
	
	/**
	 * 
	 * Returns (but does not remove) the front element of the queue.
     * 
     * Time Complexity: O(1)
     * 
	 */
	public Object front() throws QueueException{
		if (isEmpty()) {
			throw new QueueException("empty queue");
		} else {
			Object frontValue = head.element;
			return frontValue;
		}
	}
	
}
