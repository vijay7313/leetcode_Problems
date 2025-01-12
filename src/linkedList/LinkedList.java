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

	public int[] toArray(Node head) {

		int[] array = new int[listCount(head)];

		int index = 0;

		Node current = head;

		while (current != null) {
			array[index++] = current.value;
			current = current.next;
		}

		return array;
	}

	public int listCount(Node head) {

		Node current = head;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
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
			if (current.next.next == null) {
				current.next = null;
				size--;
			}

			current = current.next;

		}

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

	public Node removeNthFromTheEnd(int n) {

		if (n < 1 || n > size)
			return head;
		Node slower = head;
		Node faster = head;
		int i = 1;
		while (i++ < n + 1)
			faster = faster.next;

		if (faster == null) {
			size--;
			return head = head.next;
		}

		while (faster != null)
			if (faster.next == null) {
				slower.next = slower.next.next;
				size--;
				break;
			} else {
				slower = slower.next;
				faster = faster.next;
			}

		return head;

	}

	public Node mergedTwoSortedLists(LinkedList llist1, LinkedList llist2) {

		Node list1 = llist1.head;
		Node list2 = llist2.head;

		// list1: 1 → 2 → 4
		// list2: 1 → 3 → 4

		Node newList = null;
		Node tail = null;

		while (list1 != null && list2 != null) {
			Node node;
			if (list1.value < list2.value) {
				node = new Node(list1.value);
				list1 = list1.next;
			}

			else {
				node = new Node(list2.value);
				list2 = list2.next;
			}

			if (newList == null)
				newList = tail = node;

			else {
				tail.next = node;
				tail = node;
			}

		}

		if (list1 != null)
			if (isEmpty(newList))
				tail = list1;
			else
				tail.next = list1;

		if (list2 != null)
			if (isEmpty(newList))
				tail = list2;
			else
				tail.next = list2;

		return newList;

	}

	public boolean isEmpty(Node newList) {
		return newList == null;
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