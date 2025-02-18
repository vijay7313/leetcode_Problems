package treeMedium;

import java.util.List;

public class ConstructBTreeFromPreorderAndInorderMain {

	public static void main(String[] args) {

		ConstructBTreeFromPreorderAndInorder tree = new ConstructBTreeFromPreorderAndInorder();

		int[] preOrder = { 3, 9, 20, 15, 7 };

		int[] inOrder = { 9, 3, 15, 20, 7 };

		tree.buildTree(preOrder, inOrder);

		List<Integer> levelOrder = tree.levelOrderTraversal();

		System.out.println(levelOrder);

	}
}
