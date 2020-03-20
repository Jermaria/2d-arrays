package by.htp.homework.sixth;

import java.util.Scanner;

public class Task26 {
	
	// С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
	// а) вычислить сумму отрицательных элементов в каждой строке;
	// б) определить максимальный элемент в каждой строке;
	// в) переставить местами максимальный и минимальный элементы матрицы

	public static void main(String[] args) {
		
		int n, m;
		n = 3;
		m = 3;
		
		int[][] arr = new int[n][m];
		init(arr);
		print(arr);
		
		System.out.println();
		sumNegative(arr);
		findMax(arr);
		
		replaceMaxMin(arr);
		print(arr);
		

	}
	public static void init(int[][] array) {
		
		System.out.print("Enter the elements of array: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%3d", array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void sumNegative(int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			int sum;
			sum = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < 0) {
					sum = sum + array[i][j];
				}	
			}
			System.out.println("Sum of negative in row " + i + " is " + sum);
		}
	}
	
	public static void findMax(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			int max;
			max = array[i][0];
			for (int j = 1; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
			System.out.println("Max in row " + i + " is " + max);
		}
	}
	
	public static int findMax2(int[][] array) {
		int max;
		max = array[0][0];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		return max;
	}
	
	public static int findMin(int[][] array) {
		int min;
		min = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < min) {
					min = array[i][j];
				}
			}
		}
		return min;
	}
	
	public static void replaceMaxMin(int[][] array) {
		int max;
		max = findMax2(array);
		int min;
		min = findMin(array);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == min) {
					array[i][j] = max;
					continue;
				}
				if (array[i][j] == max) {
					array[i][j] = min;
				}
			}
		}	
	}
}
