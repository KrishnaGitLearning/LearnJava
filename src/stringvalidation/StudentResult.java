package stringvalidation;

public class StudentResult {

//	int mark1;
//	int mark2;
//	String total;
//	String result;
//	String Pass;
//	String fail;
//	String mark3;
	
	
	public String studentMarks(int a , int b) {
	
//	int a = 65; 	
//	int b = 55;
		
	int total = a+b;
	
	if(total > 50) {
		
		return "Pass";
	}
		else return "Fail";	
	}

}
