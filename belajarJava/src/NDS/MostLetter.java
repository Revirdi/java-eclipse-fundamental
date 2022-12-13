package NDS;

public class MostLetter {

	public static void main(String[] args) {
		String s = "imagination";
		System.out.println(mostLetter(s));

	}

	public static String mostLetter(String s) {
		char mostLetterAppear = '\u0000';
		int countLetter = 0;

		char[] arr = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			char currentChar = arr[i];

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count += 1;
				}
			}
			if (count > countLetter) {
				countLetter = count;
				mostLetterAppear = currentChar;
			}
		}

		return mostLetterAppear + " : " + countLetter;
	}

}
