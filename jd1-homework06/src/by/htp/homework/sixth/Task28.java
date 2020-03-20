package by.htp.homework.sixth;

import java.util.Random;

public class Task28 {
	
	// Задана матрица неотрицательных чисел. 
	// Посчитать сумму элементов в каждом столбце. 
	// Определить, какой столбец содержит максимальную сумму.

	public static void main(String[] args) {
		
		int[][] arr = new int[3][5];
		init(arr);
		print(arr);
		System.out.println();
		
		int[] colSum = colSum(arr);
		
		int max;
		max = maxColSumIndex(colSum);
		
		System.out.println("The number of column with max sum is " + max);
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
	
	public static int[] colSum(int[][] array) {
		int arrLen;
		
		arrLen = array[0].length;
		int[] arrayOfSum = new int[arrLen];
		
		int sum;
		
		for (int j = 0; j < array[0].length; j ++) {
			sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum = sum + array[i][j];
			}
			arrayOfSum[j] = sum;
			System.out.println("sum of colum " + j + " is " + sum);
		}
		return arrayOfSum;
	}
	
	public static int maxColSumIndex(int[] array) {
		int max;
		max = array[0];
		int index;
		index = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		return index;
	}
	
}
