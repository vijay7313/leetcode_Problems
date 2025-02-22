package linkedList;

public class ConvertBinaryNumberInLinkedListToInteger {
	public static void main(String[] args) {

		int[] nums = { 1, 0, 1 };

		LinkedList list = new LinkedList();

		for (int num : nums)
			list.addLast(num);

		int integer = list.convertBinaryToInteger();

		System.out.println(integer);
	}
}
