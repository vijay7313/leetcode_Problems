package linkedListMedium;

import java.util.Arrays;

import linkedListMedium.LinkedList.ListNode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int[] l1 = { 9, 9, 9, 9, 9, 9, 9 }, l2 = { 9, 9, 9, 9 };

		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		for (int num : l1)
			list1.add(num);

		for (int num : l2)
			list2.add(num);

		ListNode newList = list1.addTwoNumbers(list1, list2);

		int[] array = list1.toArray(newList);

		System.out.println(Arrays.toString(array));

	}
}
