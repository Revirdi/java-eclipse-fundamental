package NDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingWord {

	public static void main(String[] args) {
		String s = "Hello word, how are you today? Are you fine?";
		String t = "word, are you Are fine?";

		System.out.println(missingWords(s, t));

	}

	public static List<String> missingWords(String s, String t) {

		List<String> text1 = new ArrayList<String>(Arrays.asList(s.split(" ")));
		List<String> text2 = new ArrayList<String>(Arrays.asList(t.split(" ")));

		for (String i : text2) {
			text1.remove(i);
		}

		return text1;

	}

}
