package arithmeticcalculation;

public class ArithmeticMethod {

	public static void main(String[] args) {
		
		Addition obj = new Addition();
		
		int result = obj.add();
		System.out.println(result);
		obj.add1();
		int result1 = obj.add2(100, 200);
		System.out.println(result1);
		obj.add3(100, 400);
		
		Subtraction Subobj = new Subtraction();
		
		int Subresult = Subobj.sub();
		System.out.println("SUB with out ARG and with Return type:" + Subresult);
		Subobj.sub1();
		int ResultSub = Subobj.sub2(110, 220);
		System.out.println("Missed Result : " + ResultSub);
		Subobj.sub3(100, 200);

		
		Multiplication Mulobj = new Multiplication();
		int ResultMul = Mulobj.mul();
		System.out.println(ResultMul);
		Mulobj.mul1();
		int ResultMul2 = Mulobj.mul2(100, 200);
		System.out.println(ResultMul2);
		
		
		Division Divobj = new Division();
		double DivResult = Divobj.Div();
		System.out.println("Division Result : " + DivResult);
		
		
		
		
	}

	
	
	
}
