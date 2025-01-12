package linkedList;

import java.util.Arrays;

public class TwoSortedListMain {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();

		list1.addLast(1);

		list1.addLast(2);

		list1.addLast(4);

		LinkedList list2 = new LinkedList();

		list2.addLast(1);

		list2.addLast(3);

		list2.addLast(1);

		Node mergedList = list1.mergedTwoSortedLists(list1, list2);

		int[] array = list1.toArray(mergedList);

		System.out.println(Arrays.toString(array));
	}
}
