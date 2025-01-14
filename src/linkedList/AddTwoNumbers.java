package linkedList;

import java.util.Arrays;

public class AddTwoNumbers {
	public static void main(String[] args) {

		int[] l1 = { 9, 9, 9, 9, 9, 9, 9 };

		int[] l2 = { 9, 9, 9, 9 };

		LinkedList list1 = new LinkedList();

		LinkedList list2 = new LinkedList();

		for (int num : l1)
			list1.addLast(num);

		for (int num : l2)
			list2.addLast(num);

		Node res = list1.addTwoNumbers(list1, list2);

		int[] array = list1.toArray(res);

		System.out.println(Arrays.toString(array));
	}

}
