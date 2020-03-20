package by.htp.homework.sixth;

public class Task15 {

	//  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	
	public static void main(String[] args) {
		
		int n;
		n = 6;
		
		int[][] arr = new int[n][n];
		
		init(arr);
		print(arr);
	}
	
	public static void init(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					array[i][j] = array.length - j;
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
