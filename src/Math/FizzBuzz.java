package Math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

//	Given an integer n, return a string array answer (1-indexed) where:
//
//		answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//		answer[i] == "Fizz" if i is divisible by 3.
//		answer[i] == "Buzz" if i is divisible by 5.
//		answer[i] == i (as a string) if none of the above conditions are true.
	public static void main(String[] args) {

		System.out.println(fizzBuzz(15));
	}

	private static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>(n);

		int i = 1;

		while (i <= n) {

			if (i % 3 == 0 && i % 5 == 0)
				list.add("FizzBuzz");

			else if (i % 3 == 0)
				list.add("Fizz");

			else if (i % 5 == 0)
				list.add("Buzz");

			else
				list.add(Integer.toString(i));
			i++;
		}
		return list;
	}
}
