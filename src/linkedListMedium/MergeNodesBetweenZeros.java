package linkedListMedium;

import java.util.Arrays;

import linkedListMedium.LinkedList.ListNode;

public class MergeNodesBetweenZeros {
	public static void main(String[] args) {
		int[] nums = { 0, 3, 1, 0, 4, 5, 2, 0 };

		LinkedList list = new LinkedList();

		for (int num : nums)
			list.add(num);

		ListNode node = list.mergeNodesBetweenZeros();

		int[] array = list.toArray(node);

		System.out.println(Arrays.toString(array));
	}
}
