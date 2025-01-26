package linkedList;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 6, 3, 4, 5, 6);
		LinkedList list = new LinkedList();

		for (int num : nums)
			list.addLast(num);
//
//		System.out.println(Arrays.toString(list.toArray()));
//
//		list.reverse();
//
//		System.out.println(Arrays.toString(list.toArray()));
//
//		list.deleteNode(10);
//
//		System.out.println(Arrays.toString(list.toArray()));

//		list.createCycle(3);
//
//		System.out.println(list.hasCycle());

//		list.removeNthFromTheEnd(1);

//		System.out.println(Arrays.toString(list.toArray()));

//		System.out.println(list.isPalindrome());

//		System.out.println(list.isPalindrome2ndApproach());
//
//		Node node = list.middleNode();
//
//		System.out.println(Arrays.toString(list.toArray(node)));

		list.removeElements(6);

		System.out.println(Arrays.toString(list.toArray()));

	}

}
