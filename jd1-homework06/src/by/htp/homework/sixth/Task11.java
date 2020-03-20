package by.htp.homework.sixth;

import java.util.Random;

public class Task11 {

	// Дана матрица размера m x n. Вывести ее элементы в следующем порядке: 
	// первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее.
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		
		init(arr);
		print(arr);
		System.out.println();
		reverseEven(arr);

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
	
	public static void reverseEven(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for(int j = array[i].length - 1; j >= 0; j--) {
					System.out.print(array[i][j] + " ");
				}
			} else {
				for(int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
