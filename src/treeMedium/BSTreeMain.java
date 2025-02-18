package treeMedium;

public class BSTreeMain {
	public static void main(String[] args) {

		int[] nums = { 3, 2, 5, 1, 9, 7, 11 };

		BSTree tree = new BSTree();

		for (int num : nums)
			tree.add(num);

	}
}
