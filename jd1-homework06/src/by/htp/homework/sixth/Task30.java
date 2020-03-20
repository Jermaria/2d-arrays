package by.htp.homework.sixth;

import java.util.Random;

public class Task30 {
	
	// Матрицу 10x20 заполнить случайными числами от 0 до 15. 
	// Вывести на экран саму матрицу и номера строк, 
	// в которых число 5 встречается три и более раз

	public static void main(String[] args) {
		int[][] arr = new int[10][20];
		init(arr);
		print(arr);
		System.out.println();
		
		stringsWanted(arr);
	}
	
	public static void init(int[][] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(16);
			}
		}
	}
	
	public static void print(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%5d", array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void stringsWanted(int[][] array) {
		int counter;
		counter = 0;
		
		System.out.print("Numbers of strings containing 3 and more 5s: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 5) {
					counter++;
				}
			}
			if (counter > 2) {
				System.out.print(i + " ");
			}
		}
	}
}
