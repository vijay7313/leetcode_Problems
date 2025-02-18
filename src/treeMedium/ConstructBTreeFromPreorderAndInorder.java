package treeMedium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConstructBTreeFromPreorderAndInorder {

	private TreeNode root;

	private int size;

	private int preorderIndex = 0;

	public class TreeNode {

		private int val;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {

		return root = buildTreeHelper(preorder, inorder, 0, inorder.length - 1);
	}

	private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int inorderStart, int inorderEnd) {

		if (inorderEnd < inorderStart)
			return null;

		int rootVal = preorder[preorderIndex++];
		TreeNode root = new TreeNode(rootVal);
		size++;

		int inorderIndex = findInorderIndex(inorder, inorderStart, inorderEnd, rootVal);

		root.left = buildTreeHelper(preorder, inorder, inorderStart, inorderIndex - 1);
		root.right = buildTreeHelper(preorder, inorder, inorderIndex + 1, inorderEnd);

		return root;
	}

	private int findInorderIndex(int[] inorder, int start, int end, int value) {

		while (start <= end)
			if (inorder[start++] == value)
				break;

		return start - 1;

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public boolean isEmpty(TreeNode node) {
		return node == null;
	}

	public List<Integer> levelOrderTraversal() {

		List<Integer> result = new ArrayList<>();

		if (isEmpty())
			return result;

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {

			TreeNode current = queue.poll();

			result.add(current.val);

			if (!isEmpty(current.left))
				queue.add(current.left);

			if (!isEmpty(current.right))
				queue.add(current.right);
		}

		return result;
	}
}
