package linkedListMedium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LinkedList {

	public class ListNode {
		private int val;
		private ListNode next;

		public ListNode(int val) {
			this.val = val;
		}
	}

	private ListNode head;

	private ListNode first;

	private ListNode last;

	private int size;

	public void add(int value) {
		addLast(value);
	}

	public void addFirst(int value) {

		ListNode node = new ListNode(value);

		if (isEmpty())
			first = head = node;
		else {
			node.next = head;
			first = head = node;
		}

		size++;

	}

	public void addLast(int value) {

		ListNode node = new ListNode(value);

		if (isEmpty())
			last = head = node;
		else
			last = getLastNode(head).next = node;

		size++;

	}

	public void removeFirst() {

		if (isEmpty())
			throw new IllegalStateException();
		else
			first = head = head.next;

		size--;

	}

	public void removeLast() {

		if (isEmpty())
			throw new IllegalStateException();

		else if (head.next == null)
			head = null;

		else
			last = getPreviousOfLastNode(head).next = null;

		size--;

	}

	public int getFirst() {

		if (isEmpty())
			return -1;
		else
			return first.val;
	}

	public int getLast() {
		if (isEmpty())
			return -1;
		else
			return last.val;
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

			array[index++] = current.val;

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

			array[index++] = current.val;

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

			int l1Value = l1 != null ? l1.val : 0;
			int l2Value = l2 != null ? l2.val : 0;

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

	public ListNode oddEvenLinkedList(LinkedList list) {

		ListNode current = list.head;

		if (current == null || current.next == null)
			return current;

		ListNode odd = current;

		ListNode oddPointer = odd;

		ListNode even = current.next;

		ListNode evenPointer = even;

		int count = 1;

		current = current.next.next;

		while (current != null) {

			ListNode next = current.next;

			if (count % 2 == 1) {
				oddPointer.next = current;

				oddPointer = current;
			} else {
				evenPointer.next = current;

				evenPointer = current;
			}
			current = next;
			count++;

		}

		evenPointer.next = null;

		oddPointer.next = even;

		return odd;
	}

	// time complexity O(m*n) and space complexity O(1)
	public ListNode intersectionOfTwoLinkedListsOofMN(LinkedList list1, LinkedList list2, LinkedList list3) {

		ListNode headA = list1.head;

		ListNode headB = list2.head;

		getLastNode(headA).next = list3.head;

		getLastNode(headB).next = list3.head;

		ListNode dummyHeadA = headA;

		ListNode dummyHeadB = headB;

		while (dummyHeadA != null) {

			while (dummyHeadB != null) {

				if (dummyHeadA == dummyHeadB)
					return dummyHeadA;

				dummyHeadB = dummyHeadB.next;
			}

			dummyHeadA = dummyHeadA.next;

			dummyHeadB = headB;
		}

		return null;

	}

	// time complexity O(m+n) and space complexity O(m)
	public ListNode intersectionOfTwoLinkedListsOofMplusN(LinkedList list1, LinkedList list2, LinkedList list3) {

		ListNode headA = list1.head;

		ListNode headB = list2.head;

		getLastNode(headA).next = list3.head;
		getLastNode(headB).next = list3.head;

		Set<ListNode> set = new HashSet<>();

		ListNode dummyHeadA = headA;

		ListNode dummyHeadB = headB;

		while (dummyHeadA != null) {

			set.add(dummyHeadA);

			dummyHeadA = dummyHeadA.next;
		}

		while (dummyHeadB != null) {

			if (set.contains(dummyHeadB))
				return dummyHeadB;

			dummyHeadB = dummyHeadB.next;
		}

		return null;

	}

	public void deleteMiddle() {

		ListNode slow = head;

		ListNode fast = head;

		int count = 0;

		while (fast != null && fast.next != null) {

			if (count++ != 0)
				slow = slow.next;
			fast = fast.next.next;
		}

		if (slow.next != null)
			slow.next = slow.next.next;
		else
			head = null;

		size--;

	}

	public int cycleII() {
		ListNode slower = head;

		Set<ListNode> set = new HashSet<>();

		while (slower != null) {

			if (!set.contains(slower))
				set.add(slower);
			else
				return slower.val;

			slower = slower.next;

		}
		return -1;

	}

	public void cycle() {

		getLastNode(head).next = head.next;

	}

	public ListNode deleteNodesPresentInArray(int[] nums) {

		Set<Integer> set = new HashSet<>();

		for (int num : nums)
			set.add(num);

		while (head != null && set.contains(head.val)) {
			head = head.next;
			size--;
		}

		ListNode current = head;
		ListNode previous = null;

		while (current != null) {

			if (set.contains(current.val)) {
				previous.next = current.next;
				size--;
			} else
				previous = current;

			current = current.next;
		}
		return head;

	}

	public ListNode addTwoNumbersII(LinkedList list1, LinkedList list2) {

		ListNode head1 = list1.head;
		ListNode head2 = list2.head;

		Stack<Integer> stackList1 = new Stack<>();
		Stack<Integer> stackList2 = new Stack<>();

		while (head1 != null) {
			stackList1.add(head1.val);
			head1 = head1.next;
		}
		while (head2 != null) {
			stackList2.add(head2.val);
			head2 = head2.next;
		}

		int reminder = 0;
		ListNode newHead = null;

		while (!stackList1.isEmpty() || !stackList2.isEmpty() || reminder != 0) {

			int stackList1Value = !stackList1.isEmpty() ? stackList1.pop() : 0;
			int stackList2Value = !stackList2.isEmpty() ? stackList2.pop() : 0;

			int sum = stackList1Value + stackList2Value + reminder;
			reminder = sum / 10;

			ListNode node = new ListNode(sum % 10);

			node.next = newHead;
			newHead = node;
		}
		return newHead;
	}

	public ListNode DoubleANumberInList() {

		Stack<Integer> stack = new Stack<>();

		while (head != null) {
			stack.add(head.val);
			head = head.next;
		}

		int reminder = 0;

		while (!stack.isEmpty() || reminder != 0) {

			int stackVal = !stack.isEmpty() ? stack.pop() : 0;

			int result = (stackVal * 2) + reminder;

			ListNode node = new ListNode(result % 10);

			node.next = head;
			head = node;

			reminder = result / 10;
		}
		return head;
	}

	public ListNode doubleANumberInListUsingRecursion() {

		ListNode newHead = doubleANumberInListUsingRecursion(head);

		int mainRem = head.val * 2 / 10;

		if (mainRem > 0) {
			ListNode node = new ListNode(mainRem);
			node.next = newHead;
			newHead = node;
		}
		return newHead;
	}

	private ListNode doubleANumberInListUsingRecursion(ListNode head) {

		if (head == null)
			return null;

		int result = head.val * 2;

		ListNode newHead = doubleANumberInListUsingRecursion(head.next);

		int reminder = head.next != null ? head.next.val * 2 / 10 : 0;

		ListNode node = new ListNode((result % 10) + reminder);

		node.next = newHead;
		newHead = node;

		return newHead;
	}

	public ListNode mergeNodesBetweenZeros() {

		ListNode newNode = null;
		ListNode newtail = null;
		int sum = 0;

		while (head != null) {

			if (head.val == 0 && sum != 0) {

				ListNode node = new ListNode(sum);
				sum = 0;

				if (newNode == null)
					newNode = node;
				else
					newtail.next = node;
				newtail = node;
			} else
				sum += head.val;
			head = head.next;
		}
		return newNode;
	}
}
