package by.htp.homework.sixth;

public class Task01 {
	
	// Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, 
	// чтобы в одной строке была ровно одна единица, и вывести на экран
	
	public static void main(String[] args) {
		
		int[][] array = new int [3][4];
		
		for(int i = 0; i < array.length; i++ ) {
			array[i][0] = 1;
			for (int j = 1; j < array[i].length; j++) {
				array[i][j] = 0;
			}
		}
		
		for(int i = 0; i < array.length; i++ ) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}	
	}	
}
