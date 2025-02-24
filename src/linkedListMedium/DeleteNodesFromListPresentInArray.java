package linkedListMedium;

import java.util.Arrays;

import linkedListMedium.LinkedList.ListNode;

public class DeleteNodesFromListPresentInArray {
	public static void main(String[] args) {

		int[] listNums = { 1, 2, 1, 1, 1, 2, 1, 2, 3, 1 };

		int[] nums = { 1, 2 };

		LinkedList list = new LinkedList();

		for (int num : listNums)
			list.add(num);

		ListNode result = list.deleteNodesPresentInArray(nums);

		int[] resArr = list.toArray(result);

		System.out.println(Arrays.toString(resArr));
	}
}
