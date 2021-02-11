package Quick;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("큌정렬");
		System.out.print("요솟수 : ");
		int n = scan.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}

		quickSort(x, 0, n - 1);

		System.out.println("오름차순으로 정렬");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}

	private static void quickSort(int[] x, int left, int right) {
		// TODO Auto-generated method stub
		int pl = left;
		int pr = right;
		int a = x[(pl + pr) / 2];

		do {
			while (x[pl] < a) {
				pl++;
			}
			while (x[pr] > a) {
				pr--;
			}
			if (pl <= pr) {
				swap(x, pl++, pr--);
			}
		} while (pl <= pr);

		if (left < pr) {
			quickSort(x, left, pr);
		}

		if (pl < right) {
			quickSort(x, pl, right);
		}
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
