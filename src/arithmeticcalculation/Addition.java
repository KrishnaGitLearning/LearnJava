package arithmeticcalculation;

public class Addition {

		int a = 10, b = 15;

	// with out ARG and with Return type

	public int add() {

		int a = 10, b = 15;
		int c = a + b;
		return c;

	}

	// with out ARG and with out Return type

	public void add1() {

		int a1 = 10, b1 = 15;
		System.out.println(a1 + b1);

	}

	// with ARG and with Return type

	public int add2(int a2, int b2) {

		int c2 = a2 + b2;
		return c2;

	}

	// with ARG and with with out Return type

	public void add3(int a, int b) {

		int c = a + b;
		System.out.println(c);

	}

}
