package by.htp.hmw;

public class HW3Task7 {

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

		int maxarray[] = new int[n];
		
		for (int j = 0; j < n; j++) {
			maxarray[j] = matrix[0][j];
			for (int i = 1; i < n; i++) {
				if (matrix[i][j] > maxarray[j])
					maxarray[j] = matrix[i][j];
			}
		}

		System.out.println("Max elemnt for each column");

		for (int i = 0; i < n; i++) {
			System.out.print(maxarray[i] + " ");
		}

	}

}
