package by.htp.homework.sixth;

import java.util.Random;

public class Task07 {

	//  Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов
	
	public static void main(String[] args) {
		
		int[][] arr = new int [5][5];
		
		init(arr);
		print(arr);
		
		int sum;
		sum = summarise(arr);
		
		System.out.println("sum = " + sum);
		
	}
	
	public static void init(int[][] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(20) - 10;
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
	
	public static int summarise(int[][] array) {
		int sum;
		sum = 0;
		
		int num;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				num = array[i][j];
				if ((num < 0) && (num % 2 != 0)) {
					sum = sum + Math.abs(num);
				}
			}
		}
		
		return sum;
	}
	
	
}
