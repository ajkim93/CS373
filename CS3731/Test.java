// Tests the array queue for various enqueue and dequeue operations 
// before and after resizing the queue when it gets full.
public class Test {
	public static void main(String[] args) {
		ArrayQueue n = new ArrayQueue(2);
		n.enqueue("one");
		n.enqueue("two");
		System.out.println("After adding \"one\" and \"two\": " + n.toString());
		n.enqueue("three");
		System.out.println("After adding \"three\" " + n.toString());
		System.out.println("After dequeueing " + n.dequeue() + " " + n.toString());
		n.enqueue("four");
		n.enqueue("five");
		System.out.println("After adding \"four\" and \"five\": " + n.toString());
		n.enqueue("six");
		System.out.println("After adding \"six\": " + n.toString());
		System.out.println("After dequeueing " + n.dequeue() + " " + n.dequeue() + ": " + n.toString());
		n.enqueue("seven");
		n.enqueue("eight");
		n.enqueue("nine");
		n.enqueue("ten");
		n.enqueue("eleven");
		n.enqueue("twelve");
		n.enqueue("thirteen");
		System.out.println("After adding \"seven\", \"eight\", \"nine\", \"ten\", \"eleven\", \"twelve\", \"thirteen\": " + n.toString());
	}
}
