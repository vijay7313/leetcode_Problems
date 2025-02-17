package treeMedium;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {

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

		if (isEmpty())
			root = node;
		else
			addToRightPosition(node);

		size++;

	}

	private void addToRightPosition(TreeNode node) {

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			TreeNode current = queue.poll();

			if (isEmpty(current.left)) {
				current.left = node;
				return;
			} else
				queue.add(current.left);

			if (isEmpty(current.right)) {
				current.right = node;
				return;
			} else
				queue.add(current.right);
		}
	}

	public boolean isEmpty() {
		return root == null;
	}

	public boolean isEmpty(TreeNode node) {
		return node == null;
	}

	public int size() {
		return size;
	}

}
