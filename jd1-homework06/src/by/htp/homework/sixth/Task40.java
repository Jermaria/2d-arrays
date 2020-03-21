package by.htp.homework.sixth;

public class Task40 {
	
	// Магическим квадратом порядка n называется квадратная матрица размера nxn, 
	// составленная из чисел 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу, 
	// каждой строке и каждой из двух больших диагоналей равны между собой.
	// Построить такой квадрат. Пример магического квадрата порядка 3:
	// 6 1 8
	// 7 5 3
	// 2 9 4

	public static void main(String[] args) {
		int n = 3; // works with odd numbers only 

	    int[][] magic = new int[n][n];
	       
	    int i, j;
	       
	    i = 0;
	    j = getFirstJ(n);

	    magic[i][j] = 1;
	        
	    initOdd(magic, n, i, j);
	        
	    print(magic);
	}
	
	public static int getFirstJ(int order) {
		int col;

        if (order % 4 != 0) {
        	if (order % 2 != 0) {
        		col = order / 2;
        	} else {
        		col = order / 4;
        	}
        } else {
        	col = 0;
        }
        return col;
	}
	
	public static void initOdd (int[][] array, int order, int row, int col) {
		
		int start;
		start = array[row][col] + 1;
		
		for (int i = start; i <= order * order; i++) {
			row = row - 1;
			col = col + 1;
			
			if ((row == -1) && (col == order)) {
				row = row + 2;
				col = col - 1;
			} else if (row == -1) {
				row = order - 1;
			} else if (col == order) {
				col = 0;
			}
			
			if (array[row][col] != 0) {
				row = row + 2;
				col = col - 1;
			}
			
			array[row][col] = i;
		}
	}
	
	public static void print (int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%5d", array[i][j]);
			}
			System.out.println();
		}
	}
}
