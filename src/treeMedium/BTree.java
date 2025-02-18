package treeMedium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import treeMedium.BSTree.TreeNode;

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

	public List<Integer> inOrderTraversal() {

		List<Integer> list = new ArrayList<>(size);

		inOrderTraversal(root, list);

		return list;
	}

	private void inOrderTraversal(TreeNode root, List<Integer> list) {

		if (isEmpty(root))
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

	public List<Integer> levelOrderTraversal() {

		List<Integer> result = new ArrayList<>();

		if (isEmpty())
			return result;

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {

			TreeNode current = queue.poll();
			result.add(current.val);

			if (current.left != null)
				queue.add(current.left);

			if (current.right != null)
				queue.add(current.right);
		}
		return result;
	}

	public List<List<Integer>> binaryTreeZigzagLevelOrderTraversal() {

		List<List<Integer>> list = new ArrayList<>();

		for (int level = 0; level < heightOfTree(); level++) {

			boolean zigZag = level % 2 == 0 ? false : true;

			list.add(binaryTreeZigzagLevelOrderTraversal(root, new ArrayList<>(), level, zigZag));

		}

		return list;
	}

	private List<Integer> binaryTreeZigzagLevelOrderTraversal(TreeNode root, List<Integer> list, int level,
			boolean zigZag) {

		if (root == null)
			return null;

		if (level == 0)
			list.add(root.val);

		if (zigZag) {
			binaryTreeZigzagLevelOrderTraversal(root.right, list, level - 1, zigZag);
			binaryTreeZigzagLevelOrderTraversal(root.left, list, level - 1, zigZag);
		} else {
			binaryTreeZigzagLevelOrderTraversal(root.left, list, level - 1, zigZag);
			binaryTreeZigzagLevelOrderTraversal(root.right, list, level - 1, zigZag);
		}

		return list;
	}
}
