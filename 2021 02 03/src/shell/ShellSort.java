package shell;

import java.util.Scanner;

public class ShellSort {

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

	static int shellSort(int[] a, int n) {
		int count = 0; // 옮김 횟수
		int h;
		for (h = 1; h < n / 9; h = h * 3 + 1)
			;

		for (; h > 0; h /= 3) {
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					count++;
				}
				a[j + h] = tmp;
				count++;
			}
		}
		return count;
	}

}
