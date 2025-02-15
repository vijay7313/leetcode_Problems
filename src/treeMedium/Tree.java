package treeMedium;

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
}
