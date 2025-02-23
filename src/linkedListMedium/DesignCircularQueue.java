package linkedListMedium;

public class DesignCircularQueue {

	LinkedList circularQueue;
	int maxSize = 0;

	public DesignCircularQueue(int k) {
		circularQueue = new LinkedList();
		maxSize = k;
	}

	public boolean enQueue(int value) {
		if (isFull())
			return false;
		circularQueue.addLast(value);
		return true;
	}

	public boolean deQueue() {
		if (isEmpty())
			return false;
		circularQueue.removeFirst();
		return true;
	}

	public int Front() {
		if (isEmpty())
			return -1;
		return circularQueue.getFirst();
	}

	public int Rear() {
		if (isEmpty())
			return -1;
		return circularQueue.getLast();
	}

	public boolean isEmpty() {
		return circularQueue.size() == 0;
	}

	public boolean isFull() {
		return maxSize == circularQueue.size();
	}

}
