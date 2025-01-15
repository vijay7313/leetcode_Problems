package Tree;

public class Main {

	public static void main(String[] args) {

		int[] array = { 5, 5, 2, 7, 4, 9, 1 };

		BSTree tree = new BSTree();

		for (int value : array)

			tree.insert(value);

//		System.out.println(tree.maxDepth());

//		tree.falseForisValidBST();

//		System.out.println(tree.isValidBST());
		
		System.out.println(tree.isSymmetric());

	}

}
