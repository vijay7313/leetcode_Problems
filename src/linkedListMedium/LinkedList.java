package linkedListMedium;

import java.util.Arrays;

public class LinkedList {

	private class ListNode {
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

}
