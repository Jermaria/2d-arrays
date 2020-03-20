package by.htp.homework.sixth;

public class Task23 {
	
	// Сформировать квадратную матрицу порядка N по правилу:

	public static void main(String[] args) {
		int n;
		n = 6;
		
		double[][] arr = new double[n][n];
		
		init(arr);
		print(arr);
		
		int positive;
		positive = countPositive(arr);
		
		System.out.println("There are " + positive + " positive numbers");
	}

	public static void init(double[][] array) {
		double fraction;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				fraction = (double)(i * i - j * j) / array.length;
				array[i][j] = Math.sin(fraction);
			}
		}
	}
	
	public static void print(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%10f", array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int countPositive(double[][] array) {
		int counter;
		counter = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > 0) {
					counter++;
				}
			}
		}
		return counter;
	}
}
