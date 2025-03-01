package linkedListMedium;

public class DesignCircularDeque {

	private ListNode head;
	private ListNode tail;
	private int maxSize;
	private int currentSize;

	class ListNode {
		private int val;
		private ListNode next;

		public ListNode(int val) {
			this.val = val;
		}
	}

	public DesignCircularDeque(int k) {
		maxSize = k;
	}

	public boolean insertFront(int value) {

		ListNode node = new ListNode(value);
		if (isFull())
			return false;

		if (isEmpty())
			head = tail = node;
		else {
			node.next = head;
			head = node;
		}
		currentSize++;

		return true;
	}

	public boolean insertLast(int value) {
		ListNode node = new ListNode(value);
		if (isFull())
			return false;

		if (isEmpty())
			head = tail = node;
		else {
			tail.next = node;
			tail = node;
		}
		currentSize++;

		return true;
	}

	public boolean deleteFront() {
		if (isEmpty())
			return false;
		else if (currentSize == 1)
			head = tail = null;
		else
			head = head.next;
		currentSize--;

		return true;
	}

	public boolean deleteLast() {

		if (isEmpty())
			return false;
		else if (currentSize == 1)
			head = tail = null;
		else {
			tail = getPreviousOfLastNode();
			tail.next = null;
		}
		currentSize--;

		return true;
	}

	public ListNode getPreviousOfLastNode() {
		ListNode current = head;

		while (current.next != tail)
			current = current.next;

		return current;

	}

	public int getFront() {
		if (isEmpty())
			return -1;
		else
			return head.val;
	}

	public int getRear() {
		if (isEmpty())
			return -1;
		else
			return tail.val;
	}

	public boolean isEmpty() {
		return currentSize == 0;
	}

	public boolean isFull() {
		return maxSize == currentSize;
	}
}
