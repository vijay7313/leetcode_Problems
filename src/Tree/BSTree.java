package Tree;

public class BSTree {

	private Tree root;

	public void insert(int value) {

		Tree node = new Tree(value);

		if (isEmpty())
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

	public boolean isEmpty() {

		return root == null;
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
