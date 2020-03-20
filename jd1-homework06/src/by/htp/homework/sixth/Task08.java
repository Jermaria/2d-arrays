package by.htp.homework.sixth;

import java.util.Random;

public class Task08 {

	// Дан двухмерный массив n×m элементов. Определить, 
	// сколько раз встречается число 7 среди элементов массива
	
	public static void main(String[] args) {
		
		int n;
		int m;
		
		n = 4;
		m = 6;
		
		int[][] arr = new int[n][m];
		
		init(arr);
		print(arr);
		
		int num;
		num = 7;
		
		int repeated;
		repeated = countNumber(arr, num);
		
		System.out.println(num + " repeats " + repeated + " times");
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
	
	public static int countNumber(int[][] array, int number) {
		int counter;
		counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == number) {
					counter++;
				}
			}
		}
		return counter;
	}
	
}
