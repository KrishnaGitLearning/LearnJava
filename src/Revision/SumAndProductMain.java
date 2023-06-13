package Revision;

public class SumAndProductMain {
	
	
	public static void main(String[] args) {
		
		int n = 10;
		int product = 1;
		int sum = 1;
		
		SumAndProduct operation = new SumAndProduct();
		
		
		for(int i=1; i<=n; i++) {
			
			sum = operation.sumCalculation(sum, i);
			product = operation.sumProduct(product, i);		
			
			
		}
		
		System.out.println(product);
		System.out.println(sum);

		
	}
	

}
