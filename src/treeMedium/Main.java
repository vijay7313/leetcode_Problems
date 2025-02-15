package treeMedium;

public class Main {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };

		Tree tree = new Tree();

		for (int num : nums)
			tree.add(num);

		System.out.println(tree.size());

	}
}
