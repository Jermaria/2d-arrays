package by.htp.homework.sixth;

import java.util.Random;

public class Task36 {
	
	// Операция сглаживания матрицы дает новую матрицу того же размера, 
	// каждый элемент которой получается как среднее арифметическое соседей 
	// соответствующего элемента исходной матрицы. 
	// Построить результат сглаживания заданной матрицы

	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		init(arr);
		print(arr);
		System.out.println();
		
		int[][] smoothed = new int[arr.length][arr[0].length];
		
		initSecond(arr, smoothed);
		print(smoothed);
	}
	
	public static void init(int[][] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(9) + 1;
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
	
	public static void smoothHeader(int[][] oldAr, int[][] newAr) {
		int neighbourSum;
		for (int j = 0; j < oldAr[0].length; j++) {
			if(j == 0) {
				neighbourSum = oldAr[0][j+1] + oldAr[1][j] + oldAr[1][j+1]; 
				newAr[0][j] = (int)Math.round(neighbourSum / 3.0);
				
			} else if (j == oldAr[0].length - 1) {
				neighbourSum = oldAr[0][j-1] + oldAr[1][j-1] + oldAr[1][j];
				newAr[0][j] = (int)Math.round(neighbourSum / 3.0);
				
			} else {
				neighbourSum = oldAr[0][j-1] + oldAr[0][j+1] 
								+ oldAr[1][j-1] + oldAr[1][j] + oldAr[1][j+1];
				newAr[0][j] = (int)Math.round(neighbourSum / 5.0);
			}
		}
	}
	
	public static void smoothFooter(int[][] oldAr, int[][] newAr) {
		int neighbourSum;
		int iLast = oldAr.length - 1;
		
		for (int j = 0; j < oldAr[0].length; j++) {
			if (j == 0) {
				neighbourSum = oldAr[iLast][j+1] + oldAr[iLast-1][j] + oldAr[iLast-1][j+1];
				newAr[iLast][j] = (int)Math.round(neighbourSum / 3.0);
			} else if (j == oldAr[iLast].length - 1) {
				neighbourSum = oldAr[iLast][j-1] + oldAr[iLast-1][j-1] + oldAr[iLast-1][j];
				newAr[iLast][j] = (int)Math.round(neighbourSum / 3.0);
			} else {
				neighbourSum = oldAr[iLast][j-1] + oldAr[iLast][j+1] 
						+ oldAr[iLast-1][j-1] + oldAr[iLast-1][j] + oldAr[iLast-1][j+1];
				newAr[iLast][j] = (int)Math.round(neighbourSum / 5.0);
			}
		}
	}
	
	public static void smoothBody(int[][] oldAr, int[][] newAr) {
		int neighbourSum;
		
		for (int i = 1; i < oldAr.length - 1; i++) {
			for (int j = 0; j < oldAr[i].length; j++) {
				if(j == 0) {
					neighbourSum = oldAr[i-1][j] + oldAr[i-1][j+1]
									+ oldAr[i][j+1]
									+ oldAr[i+1][j] + oldAr[i+1][j+1];
					newAr[i][j] = (int)Math.round(neighbourSum / 5.0);
				} else if (j == oldAr[i].length - 1) {
					neighbourSum = oldAr[i-1][j] + oldAr[i-1][j-1]
									+ oldAr[i][j-1]
									+ oldAr[i+1][j-1] + oldAr[i+1][j];
					newAr[i][j] = (int)Math.round(neighbourSum / 5.0);
				} else {
					neighbourSum = oldAr[i-1][j-1] + oldAr[i-1][j] + oldAr[i-1][j+1]
									+ oldAr[i][j-1] + oldAr[i][j+1] 
									+ oldAr[i+1][j-1] + oldAr[i+1][j] + oldAr[i+1][j+1];
					newAr[i][j] = (int)Math.round(neighbourSum / 8.0);
				}
			}
		}
	}
		
	public static void initSecond(int[][] oldAr, int[][] newAr) {
		smoothHeader(oldAr, newAr);
		smoothBody(oldAr, newAr);
		smoothFooter(oldAr, newAr);
	}

}