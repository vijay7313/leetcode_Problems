package Tree;

import java.util.ArrayList;
import java.util.List;

public class BSTree {

	private Tree root;

	public void insert(int value) {

		Tree node = new Tree(value);

		if (isEmpty(root))
			root = node;
		else
			insertIntoTree(node);
	}

	private void insertIntoTree(Tree node) {

		Tree current = root;
		while (current != null) {

			if (node.value < current.value) {
				if (current.left == null) {
					current.left = node;
					break;
				}
				current = current.left;
			}

			else if (node.value > current.value) {
				if (current.right == null) {
					current.right = node;
					break;
				}
				current = current.right;
			} else
				return;
		}
	}

	public int maxDepth() {

		return maxDepth(root);
	}

	private int maxDepth(Tree root) {

		if (isEmpty(root))
			return 0;

		if (isLeaf(root))
			return 1;

		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	private boolean isLeaf(Tree root) {

		return root.left == null && root.right == null;
	}

	public boolean isEmpty(Tree root) {

		return root == null;
	}

	public boolean isValidBST() {
		return isValidBST(root, null, null);
	}

	private boolean isValidBST(Tree root, Integer min, Integer max) {

		if (isEmpty(root))
			return true;

		if (min != null && root.value <= min || max != null && root.value >= max)
			return false;

		return isValidBST(root.left, min, root.value) && isValidBST(root.right, root.value, max);
	}

	public void falseForisValidBST() {

		if (root == null)
			return;

		Tree temp = root.right;

		root.right = root.left;

		root.left = temp;
	}

	public boolean isSymmetric() {
		return isSymmetric(root.left, root.right);

	}

	private boolean isSymmetric(Tree root1, Tree root2) {

		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null || root1.value != root2.value)
			return false;

		return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
	}

	public List<List<Integer>> levelOrder() {

		List<List<Integer>> list = new ArrayList<>();

		if (root == null)
			return list;
		else {
			int heightOfTree = maxDepth(root);
			for (int i = 0; i < heightOfTree; i++)
				list.add(levelOrder(root, new ArrayList<>(), i));
		}

		return list;
	}

	private List<Integer> levelOrder(Tree root, List<Integer> list, int digit) {

		if (root == null)
			return null;

		if (digit == 0)
			list.add(root.value);

		levelOrder(root.left, list, digit - 1);
		levelOrder(root.right, list, digit - 1);

		return list;
	}
}

class Tree {

	int value;

	Tree left;

	Tree right;

	public Tree(int value) {
		this.value = value;
	}
}
