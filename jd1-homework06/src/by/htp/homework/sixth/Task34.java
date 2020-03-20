package by.htp.homework.sixth;

public class Task34 {
	
	// Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
	// причем в каждом столбце число единиц равно номеру столбца.

	public static void main(String[] args) {
		
		int n, m;
		m = 6;
		n = 5;
		
		int[][] arr = new int[m][n];
		init(arr);
		print(arr);
		
	}
	
	public static void init(int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j - i > 0) {
					array[i][j] = 1;
				}
			}
		}
	}
	
	public static void print(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
