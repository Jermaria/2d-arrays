package by.htp.homework.sixth;

import java.util.Random;

public class Task05 {

	// Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
	
	public static void main(String[] args) {
		
		int[][] arr = new int[4][5];
		
		init(arr);
		printEvenString(arr);

	}

	public static void init(int[][] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
	}
	
	public static void printEvenString(int[][] array) {

		for (int i = 0; i < array.length; i = i + 2) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
