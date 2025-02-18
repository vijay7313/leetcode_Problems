package treeMedium;

import java.util.List;

public class BTreeMain {
	public static void main(String[] args) {

		int[] nums = { 3, 2, 5, 1, 9, 7, 11 };

		BTree tree = new BTree();

		for (int num : nums)
			tree.add(num);

		int height = tree.heightOfTree();

		List<Integer> levelOrder = tree.levelOrderTraversal();

		System.out.println(levelOrder);

		System.out.println(height);

	}
}
