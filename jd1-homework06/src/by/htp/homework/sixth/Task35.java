package by.htp.homework.sixth;

import java.util.Random;

public class Task35 {
	
	// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

	public static void main(String[] args) {
		
		int[][] arr = new int[3][5];
		init(arr);
		print(arr);
		System.out.println();
		
		int max;
		max = findMax(arr);
		
		replace(arr, max);
		print(arr);
	}
	
	public static void init(int[][] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(10);
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
	
	public static int findMax(int[][] array) {
		int max;
		max = array[0][0];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		return max;
	}
	
	public static void replace(int[][] array, int max) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 2 != 0) {
					array[i][j] = max;
				}
			}
		}
	}

}
