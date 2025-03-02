package linkedListMedium;

import java.util.Arrays;

import linkedListMedium.LinkedList.ListNode;

public class DoubleANumberRepresentedAsList {
	public static void main(String[] args) {
		int[] nums = { 1, 8, 9 };

		LinkedList list = new LinkedList();

		for (int num : nums)
			list.add(num);

//		ListNode node = list.DoubleANumberInList();
//
//		int[] array = list.toArray(node);
//
//		System.out.println(Arrays.toString(array));
		
		ListNode node = list.doubleANumberInListUsingRecursion();
		
		int[] array = list.toArray(node);

		System.out.println(Arrays.toString(array));
	}
}
