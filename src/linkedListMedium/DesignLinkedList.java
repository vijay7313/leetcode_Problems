package linkedListMedium;

public class DesignLinkedList {

	private ListNode head;

	private ListNode tail;

	private int size;

	class ListNode {
		private int val;
		private ListNode next;

		public ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public DesignLinkedList() {

	}

	public int get(int index) {

		ListNode current = head;

		ListNode temp = current;

		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}

		for (int i = 0; i <= index; i++) {

			if (current == null)
				break;
			else if (i == index && current != null)
				return current.val;

			current = current.next;
		}
		return -1;
	}

	public void addAtHead(int val) {

		ListNode node = new ListNode(val);
		if (isEmpty())
			head = tail = node;
		else {
			tail.next = node;
			tail = node;
		}
		size++;

	}

	public void addAtTail(int val) {

		ListNode node = new ListNode(val);
		if (isEmpty())
			head = tail = node;
		tail.next = node;
		tail = node;
	}

	public void addAtIndex(int index, int val) {

		ListNode node = new ListNode(val);
		if (index == size) {
			tail.next = node;
			tail = node;
		} else if (index >= size)
			return;
		else {
			ListNode current = head;

			for (int i = 1; i < index; i++)
				current = current.next;

			ListNode next = current.next;
			current.next = node;
			node.next = next;
		}

		size++;

	}

	public void deleteAtIndex(int index) {
		if (index >= size)
			return;
		else {
			ListNode current = head;

			for (int i = 0; i < index; i++)
				current = current.next;

			current.next = current.next.next;
		}
		size--;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}
}
