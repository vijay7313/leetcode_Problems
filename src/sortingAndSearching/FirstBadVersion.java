package sortingAndSearching;

//2126753390
//1702766719
public class FirstBadVersion {

	static boolean[] isBadVersion;

	public static void main(String[] args) {
		int n = 3;

		int bad = 2;

		isBadVersion = new boolean[n + 1];

		for (int i = bad; i <= n; i++)
			isBadVersion[i] = true;

		System.out.println(firstBadVersion(1, n));

	}

	public static int firstBadVersion(int start, int end) {

		if (end < start)
			return start;

		int middle = start + (end - start) / 2;

		if (!isBadVersion(middle))
			return firstBadVersion(middle + 1, end);
		else
			return firstBadVersion(start, middle - 1);

	}

	private static boolean isBadVersion(int middle) {
		return isBadVersion[middle];
	}

}
