package by.htp.homework.sixth;

import java.util.Random;

public class Task10 {

	// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		
		int k, p;
		
		k = 2;
		p = 1;
		
		init(arr);
		print(arr);
		
		System.out.println("String " + k + ":");
		printString(arr, k);
		
		System.out.println("Column " + p + ":");
		printColumn(arr, p);
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
	
	public static void printString(int[][] array, int n) {
		for (int j = 0; j < array[n].length; j++) {
			System.out.print(array[n][j]);
		}
		System.out.println();
	}
	
	public static void printColumn(int[][] array, int n) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i][n]);
		}
	}

}
