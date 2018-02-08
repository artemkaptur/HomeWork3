package by.htp.hmw;

public class HW3Task4 {

	public static void main(String[] args) {
		
		int n = 232;
		int sum = 0;
		while (n > 0) {
			if (n % 10 % 2 == 0)
				sum = sum + (n % 10);
			n = n / 10;
		}
		System.out.println("sum = " + sum);

	}

}
