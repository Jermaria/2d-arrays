package by.htp.homework.sixth;

public class Task24 {
	
	// Дан линейный массив x1, x2,, xn−1, xn . Получить действительную квадратную матрицу порядка n:

	public static void main(String[] args) {
		int n;
		n = 6;
		
		int[] arr1 = new int[n];
		int[][] arr2 = new int[n][n];
		
		initOneDim(arr1);
		initTwoDim(arr2, arr1);
		
		print(arr2);
	}
	
	public static void initOneDim(int[]array) {
		for (int i = 0; i < array.length; i++) {
				array[i] = i + 1; 
			}
		}
	public static void initTwoDim(int[][] array2, int[] array1) {
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = (int)Math.pow(array1[j], i + 1);
			}
		}
	}
	
	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%6d", array[i][j]);
			}
			System.out.println();
		}
	}


}
