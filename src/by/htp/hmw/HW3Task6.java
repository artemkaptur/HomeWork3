package by.htp.hmw;

public class HW3Task6 {

	public static void main(String[] args) {
		
		int matrix[][] = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = i;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		for (int j = 0; j < 5; j++) {
			int temp = matrix[1][j];
			matrix[1][j] = matrix[3][j];
			matrix[3][j] = temp;
		}

		System.out.println("New matrix:");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
