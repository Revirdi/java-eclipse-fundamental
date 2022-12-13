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

			String currentStr = s[i]; // ab

			for (int j = i; j < s.length - 1; j++) {
				String nextStr = s[j]; // ba
				String[] arrayNext = nextStr.split(""); // ["b", "a"]
				for (int k = 0; k < arrayNext.length; k++) {
					if (!currentStr.contains(arrayNext[k])) {
						check = 0;
					}
					check = 1;
				}
			}
			result += check;

		}

		return result;
	}

}
