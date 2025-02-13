package string;

public class CountAndSay {

	public static void main(String[] args) {

		String result = countAndSay(3);

		System.out.println(result);
	}

	private static String countAndSay(int n) {

		if (n == 1)
			return "1";

		String re = countAndSay(n - 1);

		StringBuilder ss = new StringBuilder();

		int count = 1;

		for (int i = 0; i < re.length(); i++)

			if (i + 1 < re.length() && re.charAt(i) == re.charAt(i + 1))
				count++;
			else {
				ss.append(count).append(re.charAt(i));
				count = 1;
			}

		return ss.toString();
	}
}
