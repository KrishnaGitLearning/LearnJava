package program.practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int count = 50;

		for (int i = 2; i < count; i++) {

			boolean isPrimeNumber = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					isPrimeNumber = false;
					break;
				}

			}

			if (isPrimeNumber) {

				System.out.print(i + "-");
			}

		}

	}

}
