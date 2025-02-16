package treeMedium;

import java.util.ArrayList;
import java.util.List;

public class Tree {

	private TreeNode root;

	private int size;

	public class TreeNode {

		private int val;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public void add(int val) {

		TreeNode node = new TreeNode(val);

		if (isEmpty()) {
			root = node;
			size++;
		}

		else
			addToRightPosition(node);

	}

	public void addToRightPosition(TreeNode node) {

		TreeNode current = root;

		while (true)

			if (current.val > node.val) {
				if (current.left == null) {
					current.left = node;
					break;
				}
				current = current.left;
			}

			else if (current.val < node.val) {
				if (current.right == null) {
					current.right = node;
					break;
				}
				current = current.right;
			} else
				return;

		size++;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int size() {
		return size;
	}

	public List<Integer> inOrderTraversal() {

		List<Integer> list = new ArrayList<>(size);

		inOrderTraversal(root, list);

		return list;
	}

	private void inOrderTraversal(TreeNode root, List<Integer> list) {

		if (root == null)
			return;

		inOrderTraversal(root.left, list);

		list.add(root.val);

		inOrderTraversal(root.right, list);
	}

	public int heightOfTree() {

		return heightOfTree(root);

	}

	private int heightOfTree(TreeNode root) {

		if (root == null)
			return 0;

		if (isLeaf(root))
			return 1;

		int left = heightOfTree(root.left);
		int right = heightOfTree(root.right);

		return 1 + Math.max(left, right);
	}

	private boolean isLeaf(TreeNode root) {
		return root.left == null && root.right == null;
	}

	
}
