package linkedListMedium;

public class LinkedListCycleII {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		int[] nums = { 3, 2, 0, -4 };

		for (int num : nums)
			list.add(num);

		list.cycle();

		int node = list.cycleII();

		System.out.println(node);
	}
}
