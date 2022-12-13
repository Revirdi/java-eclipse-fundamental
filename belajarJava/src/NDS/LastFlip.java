package NDS;

public class LastFlip {

	public static void main(String[] args) {

		System.out.println(lastFlip("101"));

	}

	public static String lastFlip(String s) {
		String result = "";

		String[] str = s.split("");
		for (int i = str.length - 1; i >= 0; i--) {
			for (int k = i; k <= str.length - 1; k++) {
				if (str[k].equals("1")) {
					str[k] = "0";
				} else {
					str[k] = "1";
				}

			}
		}
		for (String c : str) {
			result += c;
		}

		return result;

	}

}
