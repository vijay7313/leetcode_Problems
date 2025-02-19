package treeMedium;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersEachNode {

	private TreeNode root;

	private TreeNode previous;

	public class TreeNode {

		private int val;

		private TreeNode left;
		private TreeNode right;

		private TreeNode next;

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

	public TreeNode connect() {
		return connect(root);
	}

	private TreeNode connect(TreeNode root) {

		for (int level = 0; level < height(root); level++) {
			previous = null;
			levelOrder(root, level);
		}

		return root;
	}

	private void levelOrder(TreeNode root, int level) {

		if (isEmpty(root))
			return;

		if (level == 0) {
			if (!isEmpty(previous))
				previous.next = root;
			previous = root;
		}

		levelOrder(root.left, level - 1);
		levelOrder(root.right, level - 1);
	}

	private int height(TreeNode root) {

		if (isEmpty(root))
			return 0;

		if (isLeaf(root))
			return 1;

		int left = height(root.left);

		int right = height(root.right);

		return 1 + Math.max(left, right);
	}

	public boolean isEmpty() {
		return root == null;
	}

	public boolean isEmpty(TreeNode node) {
		return node == null;
	}

	public boolean isLeaf(TreeNode node) {
		return node.left == null && node.right == null;
	}
}
