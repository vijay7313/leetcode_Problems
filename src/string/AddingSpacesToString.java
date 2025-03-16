package string;

public class AddingSpacesToString {
	public static void main(String[] args) {

		String s = "LeetcodeHelpsMeLearn";
		int[] spaces = { 8, 13, 15 };

		String result = addSpaces(s, spaces);

		System.out.println(result);
	}

	public static String addSpaces(String s, int[] spaces) {

		StringBuffer str = new StringBuffer();

		int spacesIndex = 0;

		for (int i = 0; i < s.length(); i++) {

			if (spacesIndex < spaces.length && i == spaces[spacesIndex]) {
				str.append(" ");
				spacesIndex++;
			}
			str.append(s.charAt(i));
		}

		return str.toString();
	}
}
