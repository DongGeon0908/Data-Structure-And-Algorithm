package merge;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]  : ");
			x[i] = scan.nextInt();
		}

		Arrays.sort(x);

		System.out.println("오름차순으로 정렬");
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]" + x[i]);
		}
	}

}
