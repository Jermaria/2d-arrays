package by.htp.homework.sixth;

import java.util.Random;

public class Task38 {
	
	// Найдите сумму двух матриц

	public static void main(String[] args) {
		
		int[][] arr1 = new int[3][5];
		int[][] arr2 = new int[3][5];
		
		init(arr1);
		init(arr2);
		
		print(arr1);
		System.out.println();
		print(arr2);
		System.out.println();
		
		int[][] sum = new int[3][5];
		initSum(arr1, arr2, sum);
		print(sum);
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
				System.out.printf("%-4d", array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void initSum(int[][] array1, int[][] array2, int[][] sum) {
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				sum[i][j] = array1[i][j] + array2[i][j];
			}
		}
	}
	
	
}
