package linkedListMedium;

import java.util.Arrays;

import linkedListMedium.LinkedList.ListNode;

public class OddEvenLinkedList {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6 };

		LinkedList list = new LinkedList();

		for (int num : nums)
			list.add(num);

		ListNode oddEvenList = list.oddEvenLinkedList(list);

		int[] array = list.toArray(oddEvenList);

		System.out.println(Arrays.toString(array));
	}
}
