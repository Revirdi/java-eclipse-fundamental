package Hmmm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

	public static void main(String args[]) {
//		int[] data = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
//		System.out.println(deleteList(data));
		String a = "JavA is Fun";
//
		System.out.println(whileloop(a));

		fibonacci("1.223.434");

	}

	public static void fibonacci(String s) {
		String[] arr = s.split("\\.");
		String[] joined = String.join("", arr).split("");
		int start = 0;
		for (String e : joined) {
			String current = e;
			for (int i = start; i < joined.length - 1; i++) {

				current = current + "0";
			}

			joined[start] = current;
			start++;
			System.out.println(current);
		}

	}

	public static List<Integer> deleteList(int[] lists) {

		List<Integer> list = new ArrayList<Integer>();

		for (int a : lists) {
			list.add(a);
		}
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(3);
		list.removeAll(arr);

		return list;
	}

	public static String whileloop(String str) {

		str = str.toLowerCase();

		String[] arr = str.split("");

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {

			if (arr[start].equals("a") || arr[start].equals("e") || arr[start].equals("i") || arr[start].equals("o")
					|| arr[start].equals("u")) {
				arr[start] = "X";
			}

			start++;
		}

		return Arrays.toString(arr);

	}

}
