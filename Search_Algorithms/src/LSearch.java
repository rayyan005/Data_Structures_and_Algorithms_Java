public class LSearch {


	private class Node {
		private Entry value;
		private Node nextNode;

		public Node(Entry v) {
			value = v;
			nextNode = null;
		}

		public Entry getValue() {
			return value;
		}

		public Node getNextNode() {
			return nextNode;
		}

		// Sets the NextNode to the given Node
		public void setNextNode(Node n) {
			nextNode = n;
		}
	}

	// Holds a reference to the head of the list
	private Node headNode;

	public LSearch() {
		headNode = null;
	}

	public void addAtHead(Entry e) {
		Node newNode = new Node(e); 
		newNode.setNextNode(headNode); 
		headNode = newNode; 
	}
	
	
	/**
	 * Performs a linear search on the linked list to find an entry by name.
	 *
	 * Time Complexity: O(N)
	 * Reason: Every node may need to be traversed in the worst case.
	 *
	 * @param name the person’s name to search for
	 * @return the associated phone number if found, otherwise -1
	 */
	public int linearSearch(String name){
		
		Node currentNode = headNode;
		
		while (currentNode != null) {
			if (currentNode.getValue().getName().equals(name)) {
				return currentNode.getValue().getNumber();
			}
			currentNode = currentNode.getNextNode();
		}
		return -1; 
	}
}
