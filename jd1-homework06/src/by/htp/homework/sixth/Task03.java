package by.htp.homework.sixth;

import java.util.Random;

public class Task03 {

	// Дана матрица. Вывести на экран первый и последний столбцы. 
	
	public static void main(String[] args) {
		
		int[][] arr = new int[4][5];
		
		init(arr);
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
			for (int j = 0; j < array[i].length; j = j + array[i].length - 1) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
