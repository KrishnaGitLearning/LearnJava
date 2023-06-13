package StringLearn;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Java World ";

		String CourseName = "Substring";
		
		System.out.println("Length Method: " + name.length());

		System.out.println("EqualMethod : " + name.equals(CourseName));

		System.out.println("Substring : " + name.substring(3));
		
		System.out.println("LowerCase Method:" + name.toLowerCase());
		
		System.out.println("Trim Method:" + name.trim());
		
		System.out.println("Replace Method:" + name.replace('V', 'B'));
		
		System.out.println("Split Method:" + CourseName.split(CourseName));
		
		System.out.println("Concatinate Method: " + name.concat(CourseName));

		System.out.println("CharAt Method: " + name.charAt(3));
		
		System.out.println("Substring Method : " + CourseName.substring(6, 4));

	}

}
