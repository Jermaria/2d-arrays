package by.htp.homework.sixth;

import java.util.Random;

public class Task04 {

	// Дана матрица. Вывести на экран первую и последнюю строки
	
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

		for (int i = 0; i < array.length; i = i + array.length - 1) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
