package NDS;

public class SimilarWords {

	public static void main(String[] args) {

		String s = "ab";
		String t = "abb";

		System.out.println(similarWords(s, t));

	}

	public static int similarWords(String s, String t) {

		String[] arrayT = t.split("");

		for (int i = 0; i < arrayT.length; i++) {
			if (!s.contains(arrayT[i])) {
				return 0;
			}
		}
		return 1;

	}

}
