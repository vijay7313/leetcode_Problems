package Math;

public class CountPrimes {

	public static void main(String[] args) {

		System.out.println(countPrimes(10));
	}

	public static int countPrimes(int num) {

		int count = 0;
		boolean[] bool = new boolean[num];

		for (int i = 0; i < bool.length; i++)
			bool[i] = true;

		double sqr = Math.sqrt(num);
		for (int i = 2; i < sqr; i++)
			if (bool[i] == true)
				for (int j = (i * i); j < num; j = j + i)
					bool[j] = false;

		for (int i = 2; i < bool.length; i++)
			if (bool[i] == true)
				count++;

		return count;
	}
}
