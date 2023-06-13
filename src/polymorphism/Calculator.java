package polymorphism;

public class Calculator {
	
	public static void main(String[] args) {
		
		CalcMain obj = new CalcMain();
		System.out.println(obj.add(12, 24));
		System.out.println(obj.add(100, 200, 300));
		System.out.println(obj.add(1000,2000, 3000,4000));
		
	}

}
