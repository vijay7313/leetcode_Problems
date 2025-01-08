package leet_array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		System.out.println(isValidSudoku(board));

	}

	public static boolean isValidSudoku(char[][] board) {
		
		Set<String> set = new HashSet<>();
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				if (board[i][j] == '.')
					continue;
				else if (!set.add(board[i][j] + " in row " + i) || !set.add(board[i][j] + " in column " + j)
						|| !set.add(board[i][j] + " in grid " + i / 3 + "-" + j / 3))
					return false;

		return true;
	}

}
