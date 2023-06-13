package Arrays;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Pal = new Scanner(System.in);
		
		System.out.println("Enter the ORiginal String = ");

		String OrignalString  = Pal.nextLine();
		String reversedString = "";
		
		// int lengthofOriginalString = OrignalString.length();
		
		for(int i=OrignalString.length()-1; i>=0; i--) {
			
			reversedString = reversedString+OrignalString.charAt(i);
			
						
		}
			System.out.println(reversedString);
		
		
	}

}
