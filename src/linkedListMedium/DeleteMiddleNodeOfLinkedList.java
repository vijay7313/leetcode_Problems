package linkedListMedium;

public class DeleteMiddleNodeOfLinkedList {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		int[] nums = { 1, 2, 3, 4, 5, 6 };

		for (int num : nums)
			list.add(num);

		list.deleteMiddle();

		System.out.println(list.toString());

	}
}
