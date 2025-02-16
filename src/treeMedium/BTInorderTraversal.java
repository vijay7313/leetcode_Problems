package treeMedium;

import java.util.List;

public class BTInorderTraversal {
	public static void main(String[] args) {

		int[] nums = { 3, 2, 5, 1, 9, 7, 11 };

		Tree tree = new Tree();

		for (int num : nums)
			tree.add(num);

		List<Integer> inOrder = tree.inOrderTraversal();

		System.out.println(inOrder);

	}
}
