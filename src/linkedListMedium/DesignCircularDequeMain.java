package linkedListMedium;

public class DesignCircularDequeMain {

	public static void main(String[] args) {
		DesignCircularDeque deque = new DesignCircularDeque(4);
		deque.insertFront(9);
		deque.deleteLast();
		System.out.println(deque.getRear()); // Expected output: -1 (Deque is empty)
		System.out.println(deque.getFront()); // Expected output: -1 (Deque is empty)
		System.out.println(deque.getFront()); // Expected output: -1 (Deque is empty)
		deque.deleteFront();
		deque.insertFront(6);
		deque.insertLast(5);
		deque.insertFront(9);
		System.out.println(deque.getFront()); // Expected output: 9
		deque.insertFront(6);
	}

}
