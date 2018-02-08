package by.htp.hmw;

public class HW3Task9 {

	public static void main(String[] args) {
		
		int n = 3;
		int matrix[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 200);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((matrix[i][j] > 9) && (matrix[i][j] < 100)
						&& (((matrix[i][j] / 10) + (matrix[i][j] % 10)) % 2 == 0))
					count++;
			}
		}

		System.out.print("Result - " + count);

	}

}
