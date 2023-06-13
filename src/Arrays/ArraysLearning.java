package Arrays;

public class ArraysLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1st method of declaring Variable

		String employeeName[];

		employeeName = new String[5];

		employeeName[0] = "Krishna";
		employeeName[1] = "Michael";
		employeeName[2] = "Ram";
		employeeName[3] = "Aravind";
		employeeName[4] = "Karthick";

		System.out.println(employeeName.length);

		// 2nd method of declaring Variable

		String SchoolStudent[] = { "Vignesh", "Ramya", "Sridevi" };

		for (int i = 0; i < SchoolStudent.length; i++) {

			System.out.println(SchoolStudent[i]);
			
			
		char name[] = {'K', 'r' ,'i' ,'s', 'h', 'n', 'a'};
		
		

		}
		
		
		String studentName[] = new String[5];
		
		studentName[0]= "Krishna";
		studentName[1]= "Krishna1";
		studentName[2]= "Krishna2";
		studentName[3]= "Krishna3";
		studentName[4]= "Krishna4";
		
		System.out.println(studentName[2]);
		System.out.println(studentName.length);
		
		
		
		
	}

}
