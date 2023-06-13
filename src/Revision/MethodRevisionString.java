package Revision;

public class MethodRevisionString {

	public String resultValidation(int marks1, int marks2) {

		String result;

		// marks1 = 100;
		// marks2 = 99;
		int total;

		total = marks1 + marks2;

		if (total > 35) {

			result = "pass";
		}

		else

			result = "fail";

		return result;

	}

}
