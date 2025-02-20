package treeMedium;

import java.util.ArrayList;
import java.util.List;

public class BSTree {

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

	public boolean isLeaf(TreeNode node) {
		return node.left == null && node.right == null;
	}

	public int size() {
		return size;
	}

	public int kthSmallestElement(int k) {

		List<Integer> list = new ArrayList<>(k);

		kthSmallestElement(root, list);

		return list.get(k - 1);
	}

	private void kthSmallestElement(TreeNode root, List<Integer> list) {

		if (root != null) {

			kthSmallestElement(root.left, list);

			list.add(root.val);

			kthSmallestElement(root.right, list);
		}
	}

}
