package arithmeticcalculation;

public class Subtraction {

	// with out ARG and with Return type

	public int sub() {

		int a = 10, b = 15;
		int c = a - b;
		return c;

	}

	// with out ARG and with out Return type

	public void sub1() {

		int a1 = 10, b1 = 15;

		System.out.println(a1 - b1);

	}

	// with ARG and with Return type

	public int sub2(int a, int b) {

		int c = (a - b);
		return c;

	}

	// with ARG and with with out Return type

	public void sub3(int a, int b) {

		int c = a - b;
		System.out.println(c);

	}

}
