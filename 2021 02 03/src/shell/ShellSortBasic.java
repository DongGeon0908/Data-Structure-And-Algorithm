package shell;

import java.util.Scanner;

public class ShellSortBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int n = scan.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}

		shellSort(data, n);

		System.out.println("오름차순 정렬");
		for (int i = 0; i < n; i++) {
			System.out.println("data[" + i + "] = " + data[i]);
		}
	}

	private static void shellSort(int[] data, int n) {
		// TODO Auto-generated method stub
		for (int i = n / 2; i > 0; i /= 2) {
			for (int k = i; k < n; k++) {
				int j;
				int tmp = data[k];
				for (j = k - i; j >= 0 && data[j] > tmp; j -= i) {
					data[j + i] = data[j];
				}
				data[j + i] = tmp;
			}
		}
	}

}
