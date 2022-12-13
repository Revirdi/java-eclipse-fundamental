package NDS;

import java.util.HashSet;
import java.util.Set;

public class FindShortestSubstring {

	public static void main(String[] args) {

		String s = "imagination";

		System.out.println(findShortestSubstring(s));

	}

	public static int findShortestSubstring(String s) {

		String[] arr = s.split("");

		Set<String> mySet = new HashSet<String>();

		Integer result = 0;
		for (String i : arr) {
			if (mySet.contains(i)) {
				result += 1;
			}
			mySet.add(i);
		}

		return result;
	}

}
