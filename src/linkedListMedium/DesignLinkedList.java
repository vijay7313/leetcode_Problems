package linkedListMedium;

public class DesignLinkedList {

	private ListNode head;

	private ListNode tail;

	private int size;

	class ListNode {
		private int val;
		private ListNode previous;
		private ListNode next;

		public ListNode(int val) {
			this.val = val;
			this.previous = null;
			this.next = null;
		}
	}

	public void addAtHead(int val) {

		ListNode node = new ListNode(val);

		if (isEmpty())
			head = tail = node;
		else {
			node.next = head;
			head.previous = node;
			head = node;
		}
		size++;
	}

	public void addAtTail(int val) {

		ListNode node = new ListNode(val);

		if (isEmpty())
			head = tail = node;
		else {
			node.previous = tail;
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public int get(int index) {

		if (index < 0 || index >= size)
			return -1;

		ListNode current = head;

		int i = 0;
		while (i++ < index)
			current = current.next;

		return current.val;
	}

	public void addAtIndex(int index, int val) {

		if (index < 0 || size < index)
			return;

		ListNode node = new ListNode(val);

		if (index == 0) {
			addAtHead(val);
			return;
		}

		if (size == index) {
			addAtTail(val);
			return;
		}

		ListNode current = head;

		int i = 0;

		while (i++ < (index - 1))
			current = current.next;

		ListNode next = current.next;

		current.next = node;

		node.previous = current;

		node.next = next;

		if (node.next == null)
			tail = node;
		else
			next.previous = node;

		size++;

	}

	public void iterate() {

		ListNode current = head;

		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	public void deleteAtIndex(int index) {

		if (index < 0 || (size - 1) < index)
			return;

		if (index == 0 && size == 1) {
			head = tail = null;
			size--;
			return;
		}

		if (index == 0 && 1 < size) {
			head = head.next;
			if (head != null) {
				head.previous = null;
			} else
				tail = null;
			size--;
			return;
		}

		if (index == size - 1) {
			tail = tail.previous;
			tail.next = null;
			size--;
			return;
		}

		int i = 0;

		ListNode current = head;

		while (i++ < index) {
			current = current.next;
		}

		ListNode previous = current.previous;
		ListNode next = current.next;
		previous.next = next;

		if (next != null)
			next.previous = previous;
		else
			tail = previous;

		size--;
	}
}
