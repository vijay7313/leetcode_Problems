package treeMedium;

public class KthSmallestElementInBSTMain {

	public static void main(String[] args) {

		BSTree tree = new BSTree();

		int[] nums = { 3, 1, 4 ,2};

		for (int num : nums)
			tree.add(num);

		int kthSmall = tree.kthSmallestElement(3);

		System.out.println(kthSmall);
	}
}
