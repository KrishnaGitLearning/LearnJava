package Arrays;

import java.util.Scanner;

public class ArrayPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in); //creating scanner object
		
		String userName;
		int salary;
		int age;
		float ID;
		
		
		System.out.println("Enter the User name: " );
		userName = obj.nextLine();
		
		System.out.println("Enter the Salary: " );
		salary = obj.nextInt();
		
		System.out.println("Enter the age: " );
		age = obj.nextInt();
		
		
		System.out.println("Enter the ID NO: " );
		ID = obj.nextFloat();
		
		System.out.println(userName);
		
		int studentMarks[] = new int[5];
		int total = 0;

		studentMarks[0] = 1;
		studentMarks[1] = 2;
		studentMarks[2] = 4;
		studentMarks[3] = 5;
		studentMarks[4] = 6;

		for (int i = 0; i < studentMarks.length; i++) {

			total = total + studentMarks[i];

		}

		int avg = total / studentMarks.length;
		System.out.println("Average :" + avg);
		System.out.println("Total Student Marks: " + total);

	}

}
