package by.htp.homework.sixth;

public class Task12 {

	// Получить квадратную матрицу порядка n:
	
	public static void main(String[] args) {
		
		int n;
		n = 7;
		
		int[][] arr = new int[n][n];
		
		init(arr);
		print(arr);
	}

	public static void init(int[][] array) {
		int counter;
		counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i == j) {
					array[i][j] = counter;
					counter++;
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
