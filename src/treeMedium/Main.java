package treeMedium;

public class Main {
	public static void main(String[] args) {

		int[] nums = { 3, 2, 5, 1, 9, 7, 11, 2, 11 };

		Tree tree = new Tree();

		for (int num : nums)
			System.out.println(tree.add(num));

		int height = tree.heightOfTree();

		System.out.println(height);

	}
}
