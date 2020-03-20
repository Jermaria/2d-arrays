package by.htp.homework.sixth;

import java.util.Random;

public class Task09 {

	// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n;
		n = rand.nextInt(5) + 2;
		
		int[][] arr = new int[n][n];
		
		init(arr);
		print(arr);
		System.out.println();;
		
		diagonal(arr);
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
	
	public static void diagonal(int[][] array) {
		
		System.out.println("Diagonal 1:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i == j) {
				System.out.print(array[i][j] + " ");
				}
			}
		}	
		System.out.println();
		
		System.out.println("Diagonal 2:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i + j == array[i].length - 1) {
				System.out.print(array[i][j] + " ");
				}
			}
		}
			
	}
		
	
}


