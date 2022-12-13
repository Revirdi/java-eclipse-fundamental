package NDS;

public class SimilarWords2 {

	public static void main(String[] args) {
		String[] s = { "ab", "ba", "abc", "baa" };
		System.out.println(similarWords(s));
	}

	public static int similarWords(String[] s) {

		int result = 0;
		int check = 0;

		for (int i = 0; i < s.length - 1; i++) {

			String currentStr = s[i];

			for (int j = i + 1; j < s.length; j++) {
				String nextStr = s[j];

				check = checkSimilarWords(currentStr, nextStr);

			}
			result += check;

		}

		return result;
	}

	public static int checkSimilarWords(String s, String t) {
		String[] arrayT = t.split("");
		int check = 0;

		for (String z : arrayT) {
			if (!s.contains(z)) {
				check = 0;
			}
			check = 1;
		}

		return check;
	}

}
