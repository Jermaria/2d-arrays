package by.htp.homework.sixth;

import java.util.Random;

public class Task02 {

	// Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]
	
	public static void main(String[] args) {

		int[][] arr = new int[2][3];
		
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
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
