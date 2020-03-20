package by.htp.homework.sixth;

import java.util.Random;

public class Task37 {
	
	// Переставить строки матрицы случайным образом.

	public static void main(String[] args) {
		int m, n;
		
		m = 3;
		n = 5;
		
		int[][] arr = new int[m][n];
		
		init(arr);
		print(arr);
		System.out.println();
		
		shiftStrings(arr, m);
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
	
	public static void shiftStrings(int[][] array, int numOfStrings) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			int r = rand.nextInt(numOfStrings);
			for (int j = 0; j < array[i].length; j++) {
				int temp;
				temp = array[i][j];
				array[i][j] = array[r][j];
				array[r][j] = temp;
			}
		}
	}

}
