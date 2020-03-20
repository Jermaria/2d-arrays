package by.htp.homework.sixth;

import java.util.Random;

public class Task39 {
	
	// Найдите произведение двух матриц

	public static void main(String[] args) {
		
		int cols1;
		
		cols1 = 2;
		
		int[][] arr1 = new int[2][cols1];
		int[][] arr2 = new int[cols1][4];
		
		init(arr1);
		init(arr2);
		
		print(arr1);
		System.out.println();
		print(arr2);
		System.out.println();
		
		int[][] mult = matrixMult(arr1, arr2);
		print(mult);
		
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
	
	public static int[][] matrixMult(int[][] array1, int[][] array2) {
		int[][] multMatrix = new int[array1.length][array2[0].length];
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2[0].length; j++) {
				multMatrix[i][j] = 0;
				for (int n = 0; n < array1[0].length; n++) {
					multMatrix[i][j] = multMatrix[i][j] + array1[i][n] * array2[n][j];
				}
			}
		}
		
		return multMatrix;
	}
	

}
