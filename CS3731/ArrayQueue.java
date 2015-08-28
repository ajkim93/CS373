import java.util.Arrays;


public class ArrayQueue {
	private String[] queueArray;
	private int size;
	private int front;
	private int back;
	
	public ArrayQueue(){
		queueArray = new String[100];
		size = 0;
		front = 0;
		back = -1;
	}
	
	public ArrayQueue(int startSize){
		queueArray = new String[startSize];
		size = 0;
		front = 0;
		back = -1;
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
		if (isFull()) {
			// Above and Beyond. Double the array size.
			/*
			 * 
			 */
			String[] s = new String[this.queueArray.length * 2];
			int j = this.front;
			for (int i = 0; i < this.size; i++) {
				s[i] = this.queueArray[j];
				j = (j + 1) % this.queueArray.length;
				this.back = i;
			}
			
			this.front = 0;
			this.queueArray = s;
			//throw new IllegalStateException("The queue is full.");
		}
		
		this.back = (this.back + 1) % this.queueArray.length;
		this.queueArray[this.back] = toEnqueue;
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
		
		String toDequeue = this.queueArray[front];
		this.front = (this.front + 1) % this.queueArray.length;
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

	/**
	 * 
	 * @return returns true if the queue is full, false otherwise
	 */
	public boolean isFull(){
		//TODO implement isFull
		return this.size == this.queueArray.length;
	}
	
	// For Test.java.
	public String toString() {
		String s = "[";
		if (!isEmpty()) {
			s += this.queueArray[0];
			for (int i = 1; i < this.queueArray.length; i++) {
				s += ", " + this.queueArray[i];
			}
		}
		
		s += "]";
		return s;
	}
	
}
