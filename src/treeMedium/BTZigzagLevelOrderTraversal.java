package treeMedium;

import java.util.List;

public class BTZigzagLevelOrderTraversal {
	public static void main(String[] args) {

		int[] nums = { 3, 2, 5, 1, 9, 7, 11 };

		Tree tree = new Tree();

		for (int num : nums)
			tree.add(num);

		List<List<Integer>> zigZagList = tree.binaryTreeZigzagLevelOrderTraversal();

		System.out.println(zigZagList);
	}
}
