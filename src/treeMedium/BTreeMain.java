package treeMedium;

public class BTreeMain {
	public static void main(String[] args) {

		int[] nums = { 3, 2, 5, 1, 9, 7, 11 };

		BTree tree = new BTree();

		for (int num : nums)
			tree.add(num);

	}
}
