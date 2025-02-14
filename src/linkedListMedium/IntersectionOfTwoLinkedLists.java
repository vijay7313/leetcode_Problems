package linkedListMedium;

import java.util.Arrays;

import linkedListMedium.LinkedList.ListNode;

public class IntersectionOfTwoLinkedLists {
	public static void main(String[] args) {

		int[] nums1 = { 4, 1 }, nums2 = { 5, 6, 1 }, nums3 = { 8, 4, 5 };

		LinkedList list1 = new LinkedList();

		LinkedList list2 = new LinkedList();

		LinkedList list3 = new LinkedList();

		for (int num : nums1)
			list1.add(num);

		for (int num : nums2)
			list2.add(num);

		for (int num : nums3)
			list3.add(num);

		ListNode intersect = list1.intersectionOfTwoLinkedLists(list1, list2, list3);

		int[] array = list1.toArray(intersect);

		System.out.println(Arrays.toString(array));

	}
}
