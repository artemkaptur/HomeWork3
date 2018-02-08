package by.htp.hmw;

public class HW3Task5 {

	public static void main(String[] args) {
		
		double array[] = new double[20];
		for (int i = 0; i < 20; i++) {
			array[i] = ((double) Math.random() * 10 - 5);
			System.out.print(Math.round(array[i] * 100) / 100.0d + " ");
		}

		int count = 0;

		for (int i = 0; i < 20; i++) {
			if ((array[i] > 0) && (i % 2 == 0) && (i != 0))
				count++;
		}

		double array2[] = new double[count];
		System.out.println();
		System.out.print("New array:");
		System.out.println();

		for (int i = 0, j = 0; i < 20; i++) {
			if ((array[i] > 0) && (i % 2 == 0) && (i != 0)) {
				array2[j] = array[i];
				System.out.print(Math.round(array2[j] * 100) / 100.0d + " ");
				j++;
			}
		}

		double result = 0;

		for (int i = 0; i < count; i++) {
			result = result + (array2[i] * array2[i]);
		}

		System.out.println();
		System.out.print("Result = " + Math.round(result * 100) / 100.0d);

	}

}
