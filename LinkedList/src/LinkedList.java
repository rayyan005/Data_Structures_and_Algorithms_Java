class LinkedListException extends RuntimeException{    
	public LinkedListException(String err) {
		super(err);
	}
}


public class LinkedList {

	private class Node {
		private int value;
		private Node nextNode;

		public Node(int i) {
			value = i;
			nextNode = null; 
		}

		// returns the value stored in the node
		public int getValue() {
			return value;
		}

		// sets the value stored in the node
		public void setValue(int i) {
			value = i;
		}

		// Returns the Node that this Node links to
		// Note this may return null
		public Node getNextNode() {
			return nextNode;
		}

		// Sets the NextNode to the given Node
		public void setNextNode(Node n) {
			nextNode = n;
		}

		// adds Node n to the tail of the list
		public void addNodeAtTail(Node n) {
			if (this.nextNode == null) {
				this.nextNode = n;
			} else {
				this.nextNode.addNodeAtTail(n);
			}
		}

		public Node removeAtTail(Node valueAtTail) {
			if (this.nextNode == null) { // if this is the last node
				valueAtTail.setValue(this.getValue()); // copy out the value
				return null; // return null
			} else { // move onto the next Node
				this.nextNode = this.nextNode.removeAtTail(valueAtTail);
				return this;
			}

		}
	} // End of Node Class implementation

	private Node headNode; // Holds a reference to the head of the list

	public LinkedList() {
		headNode = null;
	}

	public void addAtHead(int i) {
		Node newNode = new Node(i); 
		newNode.setNextNode(headNode); 
		headNode = newNode; 
	}

	public void addAtTail(int i) {
		Node newNode = new Node(i);
		if (headNode == null) { 
			headNode = newNode;
		} else {
			headNode.addNodeAtTail(newNode);
		}
	}

	/*
	 * removes and returns the value at the head of the list
	 */ 
	public int removeAtHead() throws LinkedListException {
		if (headNode == null) {
			throw new LinkedListException("Cannot remove from the head of an empty linked list");
		} else {
			Node returnedNode = headNode;
			headNode = headNode.getNextNode();
			return returnedNode.getValue();
		}
	}

	/*
	 * 
	 */
	public int removeAtTail() throws LinkedListException {
		if (headNode == null) {
			throw new LinkedListException("Cannot remove from the tail of an empty linked list");
		} else {
			Node returnedNode = new Node(-1);
			headNode = headNode.removeAtTail(returnedNode);
			return returnedNode.getValue();
		}
	}


	/** Calculates the number of nodes in a linked list.
	 * 
	 * Time Complexity: O(n)
	 * 
	 * Because: We traverse each node exactly once to count them.
	 * 
	 * @return the number of nodes in the linked list
	 */
	public int size(){
		int count = 0;
		Node currentNode = headNode;
		while (currentNode != null) {
			count+=1;
			currentNode = currentNode.getNextNode();
		}
		return count;
	}
	
	
	/** Calculates the sum of all node values in the linked list.
	 *
	 * Time Complexity: O(n)
	 * 
	 * Because: we have to traverse through the entire list to get the sum
	 * and the complexity will depend on the number of nodes we have
	 * 
	 * @return the sum of all nodes in the linked list
	 */
	public int total(){ 
		int sum = 0;
		Node currentNode = headNode;
		while (currentNode != null) {
			sum+=currentNode.getValue();
			currentNode = currentNode.getNextNode();
		}
		return sum;
	}

}
