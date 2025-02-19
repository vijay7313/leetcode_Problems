package treeMedium;

public class PopulatingNextRightPointersEachNodeMain {

	public static void main(String[] args) {
		PopulatingNextRightPointersEachNode tree = new PopulatingNextRightPointersEachNode();

		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

		for (int num : nums)
			tree.add(num);

		tree.connect();
	}
}
