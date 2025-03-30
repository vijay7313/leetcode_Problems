package hashTable;

import java.util.HashMap;
import java.util.Map;

public class CheckIfSentenceIsPangram {
	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";

		boolean result = checkIfPangram(sentence);

		System.out.println(result);
	}

	public static boolean checkIfPangram(String sentence) {

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : sentence.toCharArray())
			if (!map.containsKey(ch))
				map.put(ch, 1);

		if (map.size() == 26)
			return true;
		else
			return false;
	}
}
