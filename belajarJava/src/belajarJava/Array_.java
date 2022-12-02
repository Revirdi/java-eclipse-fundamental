package belajarJava;
import java.util.Arrays;

public class Array_ {
	public static void main(String[] args) {
		
		String[] arrayString;
		arrayString = new String[3];
		arrayString[0] = "Ardwi";
		arrayString[1] = "yan";
		arrayString[2] = "Revirdi";

		int[] arrayInt = new int[] {
			10, 90, 80, 67, 29	
		};
		
		long[] arrayLong = {
				10,90,80,67,29
		};
		String[][] members = {
				{"Ardwiyan", "Revirdi"},
				{"No", "Life"},
				{"Programmer"}
		};
		
		System.out.println(members[0][0]);
		System.out.println(arrayLong[0]);
		System.out.println(arrayLong.length);
		System.out.println(Arrays.toString(arrayLong)); // [10, 90, 80, 67, 29]
		System.out.println(Arrays.deepToString(members)); // deepToString untuk array 2 dimensi
	}
}
