package by.htp.homework.sixth;

import java.util.Random;

public class Task29 {
	
	// Найти положительные элементы главной диагонали квадратной матрицы

	public static void main(String[] args) {
		
		int n;
		n = 6;
		
		int[][] arr = new int[n][n];
		init(arr);
		print(arr);
		System.out.println();
		
		showDiagPositive(arr);
	}
	
	public static void init(int[][] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(10) - 5;
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
	
	public static void showDiagPositive(int[][] array) {
		System.out.println("Positive elements of the main diagonal: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((i == j) && (array[i][j] > 0)) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}

}
