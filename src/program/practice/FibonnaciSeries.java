package program.practice;

public class FibonnaciSeries {

	public static void main(String[] args) {

		// fibonacci Series

		int n1 = 0;
		int n2 = 1;
		int count = 50;
		int n3;

		System.out.print(n1 + " " + n2);

		for (int i = 2; i <= count; i++) {

			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}

	}

}
