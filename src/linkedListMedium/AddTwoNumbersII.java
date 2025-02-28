package linkedListMedium;

import java.util.Arrays;

import linkedListMedium.LinkedList.ListNode;

public class AddTwoNumbersII {
	public static void main(String[] args) {

		int[] nums1 = { 7, 2, 4, 3 };
		int[] nums2 = { 5, 6, 4 };

		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		for (int num : nums1)
			list1.add(num);
		for (int num : nums2)
			list2.add(num);

		ListNode newList = list1.addTwoNumbersII(list1, list2);

		int[] array = list1.toArray(newList);
		
		System.out.println(Arrays.toString(array));
	}
}
