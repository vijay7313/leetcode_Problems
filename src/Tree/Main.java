package Tree;

public class Main {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6 };

		BSTree tree = new BSTree();

//		for (int value : array)
//
//			tree.insert(value);

//		System.out.println(tree.maxDepth());

//		tree.falseForisValidBST();

//		System.out.println(tree.isValidBST());

//		System.out.println(tree.isSymmetric());

		Tree root = tree.sortedArrayToBST(array);

		System.out.println(tree.levelOrder(root));

	}

}
