package by.htp.homework.sixth;

public class Task25 {
	
	//  Получить квадратную матрицу порядка n:

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
				array[i][j] = i * array[i].length + j + 1;
			}
		}
	}
	
	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%3d", array[i][j]);
			}
			System.out.println();
		}
	}
}
