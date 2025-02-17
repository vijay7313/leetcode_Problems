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

	public boolean add(int val) {

		TreeNode node = new TreeNode(val);

		if (isEmpty()) {
			root = node;
			size++;
		} else
			return addToRightPosition(node);

		return true;
	}

	private boolean addToRightPosition(TreeNode node) {

		TreeNode current = root;

		while (true)

			if (current.val > node.val) {
				if (isEmpty(current.left)) {
					current.left = node;
					break;
				}
				current = current.left;
			}

			else if (current.val < node.val) {
				if (isEmpty(current.right)) {
					current.right = node;
					break;
				}
				current = current.right;
			} else
				return false;
		size++;
		return true;
	}

	public void addRec(int val) {
		root = addRec(root, val);
	}

	private TreeNode addRec(TreeNode node, int val) {

		if (node == null) {
			size++;
			return new TreeNode(val);
		}

		if (val < node.val)
			node.left = addRec(node.left, val);
		else if (val > node.val)
			node.right = addRec(node.right, val);

		return node;
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
