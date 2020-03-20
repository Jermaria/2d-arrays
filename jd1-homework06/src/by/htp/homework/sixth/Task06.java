package by.htp.homework.sixth;

import java.util.Random;

public class Task06 {

	// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
	
	public static void main(String[] args) {
		
		int[][] arr = new int[4][5];
		
		init(arr);
		
		printEvenColumn(arr);
	}

	public static void init(int[][] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
	}
	
	public static void printEvenColumn(int[][] array) {
		int lastStrIndex = array.length - 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j = j + 2) {	
				
				if(array[0][j] > array[lastStrIndex][j]) {
				System.out.print(array[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
}
