package linkedList;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(3);

		list.removeDuplicatesFromSortedList();

		System.out.println(Arrays.toString(list.toArray()));
	}
}
