package NDS;

public class SimilarWords2 {

	public static void main(String[] args) {
		String[] s = { "ab", "ba", "abc", "baa" };
		System.out.println(similarWords(s));
	}

	public static int similarWords(String[] s) {

		int result = 0;

		for (int i = 0; i < s.length - 1; i++) {

			String currentStr = s[i];
			String nextStr = s[i + 1];
			String[] arrayNext = nextStr.split("");

			for (int j = i + 1; j < s.length - 1; j++) {

				int check = 0;
				for (int k = 0; k < arrayNext.length; k++) {
					if (!currentStr.contains(arrayNext[k])) {
						check = 0;
					}
					check = 1;
				}
				result += check;
			}

		}

		return result;
	}

}
