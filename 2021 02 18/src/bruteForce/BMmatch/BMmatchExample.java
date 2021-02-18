package bruteForce.BMmatch;

import java.util.Scanner;

public class BMmatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMmatch bm = new BMmatch();
		Scanner scan = new Scanner(System.in);

		System.out.print("텍스트 : ");
		String s1 = scan.next();

		System.out.print("패턴 : ");
		String s2 = scan.next();

		int idx = bm.bmMatch(s1, s2);

		if (idx == -1) {
			System.out.println("텍스트에 패턴이 없음");
		} else {
			int len = 0;
			for (int i = 0; i < idx; i++) {
				len = len + s1.substring(i, i + 1).getBytes().length;
			}
			len = len + s2.length();

			System.out.println((idx + 1) + "번째 문자부터 일치");
			System.out.println("텍스트 : " + s1);
			System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
		}
	}

}
