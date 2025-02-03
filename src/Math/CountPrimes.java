package Math;

public class CountPrimes {

	public static void main(String[] args) {

		System.out.println(countPrimes(10));
	}

	public static int countPrimes(int num) {

		int count = 0;
		boolean[] bool = new boolean[num];

		while (count < bool.length)
			bool[count++] = true;

		for (int i = 2; i < Math.sqrt(num); i++)
			if (bool[i] == true)
				for (int j = (i * i); j < num; j = j + i)
					bool[j] = false;

		count = 0;
		for (int i = 2; i < bool.length; i++)
			if (bool[i] == true)
				count++;

		return count;
	}
}
