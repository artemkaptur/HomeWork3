package by.htp.hmw;

public class HW3Task8 {

	public static void main(String[] args) {
		
		int n = 5;
		int matrix[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = ((int) (Math.random() * 10) - 5);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int x = 1;
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == x)
					count++;
			}
		}
		
		System.out.println("There are " + count +" number x");

	}

}
