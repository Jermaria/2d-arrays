package by.htp.homework.sixth;

import java.util.Random;
import java.util.Scanner;

public class Task27 {
	
	// В числовой матрице поменять местами два столбца любых столбца, 
	// т. е. все элементы одного столбца поставить на соответствующие им позиции другого, 
	// а его элементы второго переместить в первый. 
	// Номера столбцов вводит пользователь с клавиатуры.

	public static void main(String[] args) {
		
		int[][] arr = new int[3][5];
		init(arr);
		print(arr);
		System.out.println();
		
		int col1, col2;
		
		col1 = colsNum();
		col2 = colsNum();
		
		replaceColumns(arr, col1, col2);
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
	
	public static int colsNum() {
		int a;
		System.out.print("Enter the number of column [0;4] ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		return a;
	}
	
	public static void replaceColumns(int[][] array, int column1, int column2) {
		int firstCol, lastCol;
		firstCol = Math.min(column1, column2);
		lastCol = Math.max(column1, column2);
		
		int temp;
		for (int i = 0; i < array.length; i++) {
			temp = array[i][firstCol];
			array[i][firstCol] = array[i][lastCol];
			array[i][lastCol] = temp;
		}
	}
}
