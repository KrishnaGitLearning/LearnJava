package statements.condition;

public class IfCondition {

	// greatest of 3 numbers

	public static void main(String[] args) {

		int num1 = 500;
		int num2 = 200;
		int num3 = 300;

		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is the greatest");
		}	
		else if(num2 >= num3 && num2 >= num1){
			System.out.println(num2 +  " is the greatest");

		}
		else if(num3 >= num1 && num3 >= num2){
			System.out.println(num3 +  " is the greatest");
	}

}
	
}