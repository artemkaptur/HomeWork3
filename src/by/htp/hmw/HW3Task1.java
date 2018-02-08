package by.htp.hmw;

public class HW3Task1 {

	public static void main(String[] args) {
		
		int array[] = new int[104];
		for (int i = 0, j = 300; i < 104; i++, j--) {
			array[i] = j;
			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println("each third");
	
		for (int i = 2; i < 104; i = i + 3) {
			System.out.print(array[i] + " ");
		}

	}

}
