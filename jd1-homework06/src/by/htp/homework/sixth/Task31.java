package by.htp.homework.sixth;

import java.util.Random;

public class Task31 {
	
	// Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. 
	// Посчитать количество двузначных чисел в ней.

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		init(arr);
		print(arr);
		System.out.println();
		
		int doubleDigitNum = countDoubleDigit(arr);
		
		System.out.println(doubleDigitNum);

	}
	
	public static void init(int[][] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(1000);
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
	
	public static int countDoubleDigit(int[][] array) {
		int counter;
		counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((array[i][j] > 9) && (array[i][j] < 100)) {
					counter++;
				}
			}
		}
		return counter;
	}

}
