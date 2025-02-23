package linkedListMedium;

public class DesignCircularQueueMain {

	public static void main(String[] args) {

		DesignCircularQueue queue = new DesignCircularQueue(3);

		System.out.println(queue.enQueue(1)); // return True
		System.out.println(queue.enQueue(2)); // return True
		System.out.println(queue.enQueue(3)); // return True
		System.out.println(queue.enQueue(4)); // return False
		System.out.println(queue.Rear()); // return 3
		System.out.println(queue.isFull()); // return True
		System.out.println(queue.deQueue()); // return True
		System.out.println(queue.enQueue(4)); // return True
		System.out.println(queue.Rear()); // return 4
	}
}
