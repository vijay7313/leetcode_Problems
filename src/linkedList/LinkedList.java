package linkedList;

public class LinkedList {

	private int size;
	private Node head;

	public void addFirst(int value) {

		Node node = new Node(value);
		if (isEmpty())
			head = node;

		else {
			node.next = head;
			head = node;
		}

		size++;
	}

	public void addLast(int value) {
		Node node = new Node(value);
		if (isEmpty())
			head = node;
		else
			previousOfLastNode(head).next = node;
		size++;
	}

	public void removeFirst() {
		if (isEmpty())
			throw new IllegalStateException();
		head = head.next;
		size--;
	}

	public void removeLast() {
		if (isEmpty())
			throw new IllegalStateException();
		previousOfLastNodeSBefore(head).next = null;
		size--;

	}

	private Node previousOfLastNode(Node head) {

		Node current = head;
		while (current != null)
			if (current.next == null)
				return current;
			else
				current = current.next;
		return null;
	}

	private Node previousOfLastNodeSBefore(Node head) {

		Node current = head;
		while (current != null)
			if (current.next.next == null)
				return current;
			else
				current = current.next;
		return null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	public int[] toArray() {
		int[] array = new int[size];

		Node current = head;
		int index = 0;
		while (current != null) {
			array[index++] = current.value;
			current = current.next;
		}
		return array;
	}

	public void deleteNode(int value) {

		Node current = head;

		while (current != null)
			if (current.value == value)
				break;
			else
				current = current.next;

		while (current != null) {
			current.value = current.next.value;
			if (current.next.next == null)
				current.next = null;
			current = current.next;
		}
		size--;
	}

	public void createCycle(int position) {

		if (position < 0 || size <= position)
			return;

		Node positionNode = head;
		int i = 0;
		while (i++ < position)
			positionNode = positionNode.next;

		previousOfLastNode(head).next = positionNode;

	}

	public boolean hasCycle() {

		Node slower = head;
		Node faster = head;

		while (faster != null) {
			if (faster.next == null)
				break;
			slower = slower.next;
			faster = faster.next.next;
			if (slower == faster)
				return true;
		}
		return false;

	}

	public Node reverse() {

		if (isEmpty())
			return null;

		Node previous = head;

		Node current = head.next;

		while (current != null) {
			Node next = current.next;

			current.next = previous;
			previous = current;
			current = next;
		}
		head.next = null;

		head = previous;

		return head;
	}

}

class Node {
	int value;
	Node next;

	public Node(int value) {
		this.value = value;
		this.next = null;
	}
}