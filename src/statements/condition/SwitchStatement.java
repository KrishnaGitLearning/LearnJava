package statements.condition;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day = 2;
		
		switch (day)
		{
		case 1 :
			System.out.println("Sunday");
			break;
		case 2 :
			System.out.println("Monday");
			break;
		case 3 :
			System.out.println("Tuesday");
			break;
		case 4 :
			System.out.println("Wed");
			break;
		case 5 :
			System.out.println("Thur");
			break;
		case 6 :
			System.out.println("Fri");
			break;
		case 7 :
			System.out.println("Sat");
			break;
		default:
			
			System.out.println("Not a valid option");
		

	}

}
}