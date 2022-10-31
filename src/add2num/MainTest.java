package add2num;

import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {

		System.out.println("Nhập chuỗi số thứ  nhất: ");
		String s1 = new Scanner(System.in).nextLine();

		System.out.println("Nhập chuỗi số thứ  hai: ");
		String s2 = new Scanner(System.in).nextLine();

		System.out.println(sum(s1, s2));
	}

	public static String sum(String s1, String s2) {
		int s = Math.abs(s1.length() - s2.length());
		if (s1.length() > s2.length()) {

			for (int i = 0; i < s; i++) {

				s2 = "0".concat(s2);
			}

		} else if (s1.length() < s2.length()) {
			for (int i = 0; i < s; i++) {
				s1 = "0".concat(s1);
			}

		}

		double sum = 0;

		for (int i = 0; i < s1.length(); i++) {

			System.out
					.println("Bước " + (i + 1) + " Ta cộng 2 số " + s1.charAt(s2.length() - 1 - i) + " và "
							+ s2.charAt(s2.length() - 1 - i) + " ra kết quả "
							+ (Integer.valueOf(String.valueOf(s1.charAt(s2.length() - 1 - i)))
									+ Integer.valueOf(String.valueOf(s2.charAt(s2.length() - 1 - i))))
									* Math.pow(10, i));

			sum = sum + (Integer.valueOf(String.valueOf(s1.charAt(s2.length() - 1 - i)))
					+ Integer.valueOf(String.valueOf(s2.charAt(s2.length() - 1 - i)))) * Math.pow(10, i);

			System.out.println("Tổng tạm thời là:" + sum);

			if (i == s1.length() - 1) {
				System.out.println("Tổng cuối cùng của 2 số là " + sum);
			}

		}

		return String.valueOf(sum);
	}
}
