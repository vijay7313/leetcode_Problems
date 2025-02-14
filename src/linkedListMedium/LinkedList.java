package linkedListMedium;

import java.util.Arrays;

public class LinkedList {

	public class ListNode {
		private int value;
		private ListNode next;

		public ListNode(int value) {
			this.value = value;
		}
	}

	private ListNode head;

	private int size;

	public void add(int value) {
		addLast(value);
	}

	public void addFirst(int value) {

		ListNode node = new ListNode(value);

		if (isEmpty())
			head = node;
		else {
			node.next = head;
			head = node;
		}
		size++;

	}

	public void addLast(int value) {

		ListNode node = new ListNode(value);

		if (isEmpty())
			head = node;
		else
			getLastNode(head).next = node;

		size++;

	}

	public void removeFirst() {

		if (isEmpty())
			throw new IllegalStateException();
		else
			head = head.next;

		size--;

	}

	public void removeLast() {

		if (isEmpty())
			throw new IllegalStateException();

		else if (head.next == null)
			head = null;

		else
			getPreviousOfLastNode(head).next = null;

		size--;

	}

	private ListNode getPreviousOfLastNode(ListNode head) {

		ListNode current = head;

		while (current.next != null && current.next.next != null)
			current = current.next;

		return current;
	}

	private static ListNode getLastNode(ListNode head) {

		ListNode current = head;

		while (current.next != null)
			current = current.next;

		return current;

	}

	public int[] toArray() {

		int[] array = new int[size];

		ListNode current = head;

		int index = 0;

		while (current != null) {

			array[index++] = current.value;

			current = current.next;
		}
		return array;

	}

	public int[] toArray(ListNode node) {

		int nodeSize = listSize(node);

		int[] array = new int[nodeSize];

		ListNode current = node;

		int index = 0;

		while (current != null) {

			array[index++] = current.value;

			current = current.next;
		}
		return array;

	}

	private static int listSize(ListNode node) {

		int count = 0;

		while (node != null) {
			count++;
			node = node.next;
		}
		return count;

	}

	@Override
	public String toString() {
		return Arrays.toString(toArray());
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	public ListNode addTwoNumbers(LinkedList list1, LinkedList list2) {

		ListNode l1 = list1.head;

		ListNode l2 = list2.head;

		ListNode list = null, pointer = null;

		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {

			int l1Value = l1 != null ? l1.value : 0;
			int l2Value = l2 != null ? l2.value : 0;

			l1 = l1 != null ? l1.next : null;
			l2 = l2 != null ? l2.next : null;

			int sum = l1Value + l2Value + carry;

			carry = sum / 10;

			ListNode node = new ListNode(sum % 10);

			if (list == null)
				list = node;
			else
				pointer.next = node;

			pointer = node;

		}

		return list;

	}

}
