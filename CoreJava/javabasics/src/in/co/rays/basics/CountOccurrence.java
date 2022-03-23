package in.co.rays.basics;

public class CountOccurrence {

	public static void main(String[] args) {

		String s = "Akash Ajay";

		char c = 'a';

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (c == s.charAt(i)) {

				count++;

			}

		}
		System.out.println(count);

	}
}
