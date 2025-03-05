package String;

public class ToLowerCase {
	public static void main(String[] args) {
		String str = "Hello";

		String lowStr = toLowerCase(str);

		System.out.println(lowStr);
	}

	public static String toLowerCase(String s) {

		StringBuilder str = new StringBuilder();

		for (int i = 0; i < s.length(); i++)
			if (64 < s.charAt(i) && 91 > s.charAt(i))
				str.append((char) (s.charAt(i) + 32));
			else
				str.append(s.charAt(i));
		return str.toString();
	}
}
