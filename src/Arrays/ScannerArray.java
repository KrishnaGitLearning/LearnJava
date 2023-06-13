package Arrays;

public class ScannerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] StudentMarks = {10, 25, 35, 45, 55};
		
		System.out.println(StudentMarks.length);
		
		int total =0;
		
		for(int i = 0; i<StudentMarks.length; i++) {
		
		total = total +StudentMarks[i];
		
		
		}
		
		int avg = total/ StudentMarks.length;
		
		System.out.println("Avg : "+ avg);
		
		
		
			
			
		
		}
		
		
	}
	
	
	
	
	


