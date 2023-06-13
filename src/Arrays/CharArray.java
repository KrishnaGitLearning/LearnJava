package Arrays;

import org.testng.annotations.Test;

public class CharArray {

	@Test	
	public void charArrayLearning() {
		
		  String str = "SeleniumLearning"; // declaring string variable String
		  String strlowercase = str.toLowerCase(); // storing the variable in lowercase in
		  char[] character = strlowercase.toCharArray(); //
		  int vowelsCount=0; for (int i = 0; i < character.length; i++) {
		  
		  if(character[i]== 'a'||character[i]== 'e'||character[i]== 'i'
		  ||character[i]== 'o'||character[i]== 'u') {
			  vowelsCount++; 
		  }
		 
		  }
		  
		  System.out.println("Total number of Vowelcount is " + vowelsCount); }
		  
		 

		

	}


