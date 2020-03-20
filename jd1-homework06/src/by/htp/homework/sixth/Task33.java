package by.htp.homework.sixth;

import java.util.Random;

public abstract class Task33 {
	
	// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		init(arr);
		print(arr);
		System.out.println();
		
		sortAscending(arr);
		print(arr);
		
		System.out.println();
		sortDescending(arr);
		
		print(arr);

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
	
	public static void sortAscending(int[][] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = i + 1; k < array.length; k++) {
					if (array[i][j] > array[k][j]) {
						int temp;
						temp = array[i][j];
						array[i][j] = array[k][j];
						array[k][j] = temp;
					}
				}			
			}				
		}
	}
	
	public static void sortDescending(int[][] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = i + 1; k < array.length; k++) {
					if (array[i][j] < array[k][j]) {
						int temp;
						temp = array[i][j];
						array[i][j] = array[k][j];
						array[k][j] = temp;
					}
				}			
			}				
		}
	}

}
