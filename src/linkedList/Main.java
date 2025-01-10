package linkedList;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addFirst(10);

		list.addLast(12);

		list.addFirst(2);

		list.addFirst(1);

		list.addLast(1);

		System.out.println(Arrays.toString(list.toArray()));

		list.reverse();

		System.out.println(Arrays.toString(list.toArray()));

		list.deleteNode(10);

		System.out.println(Arrays.toString(list.toArray()));
	}

}
