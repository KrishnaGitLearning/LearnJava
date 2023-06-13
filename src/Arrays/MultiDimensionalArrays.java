package Arrays;

import org.testng.annotations.Test;

public class MultiDimensionalArrays {

		@Test
		public void test() {

		int[][] excel = new int[10][20];

		excel[0][0] = 100;
		excel[0][1] = 200;
		excel[0][2] = 300;

		// Secondrow

		excel[1][0] = 400;
		excel[1][1] = 500;
		excel[1][2] = 600;

		int[][] cord = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		System.out.println("Length of the Array: " + cord.length);

		for (int i = 0; i < cord.length; i++) {

			for (int j = 0; j < cord[i].length; j++) {
				

			System.out.println("Element at index : " + i + " " + j + " " + "is" + cord[i][j]);

		}
			
		}	
	}

}
