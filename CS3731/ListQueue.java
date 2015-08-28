
public class ListQueue {
	private class ListQueueNode {
		public String data;
		public ListQueueNode next;
		
		// Pre: none.
		// Post: Constructs a node with the given data
		// and a null next node field.
		public ListQueueNode(String data) {
			this(data, null);
		}
		
		// Pre: none.
		// Post: Constructs a node with the given data
		// and the given next node field.
		public ListQueueNode(String data, ListQueueNode next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private int size;
	private ListQueueNode front;
	private ListQueueNode back;
	//TODO Add fields needed
	
	public ListQueue(){
		front = null;
		back = null;
		size = 0;
	}
	

	/**
	 * @function returns the number of elements in the queue
	 * @return size
	 */
	public int getSize(){
		return size;
	}
	/**
	 * @function adds a string to the end of the queue
	 * @param toEnqueue: the input to be inserted
	 */
	public void enqueue(String toEnqueue){
		//TODO implement enqueue
		ListQueueNode n = new ListQueueNode(toEnqueue);
		if (isEmpty()) {
			this.front = n;
			this.back = n;
		} 
		
		else {
			this.back.next = n;
			this.back = this.back.next;
		}
		
		this.size++;
	
	}
	
	/**
	 * @function removes the string from the front of the queue
	 * @return the string from the front of the queue
	 */
	public String dequeue(){
		//TODO implement dequeue
		if (isEmpty()) {
			throw new IllegalStateException("The queue is empty.");
		}
		
		String toDequeue = this.front.data;
		this.front = this.front.next;
		this.size--;
		return toDequeue;
	}
	
	/**
	 * 
	 * @return returns true if the queue is empty, false otherwise
	 */
	public boolean isEmpty(){
		//TODO implement isEmpty
		return this.size == 0;
	}


}
