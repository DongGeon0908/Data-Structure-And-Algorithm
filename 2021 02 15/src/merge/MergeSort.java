package merge;

import java.util.Scanner;

public class MergeSort {
	static int[] buff;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("병합 정렬");
		System.out.print("요솟수 : ");
		int nx = scan.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}

		mergeSort(x, nx);

		System.out.println("오름차순으로 정렬");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]" + x[i]);
		}

	}

	private static void mergeSort(int[] a, int n) {
		// TODO Auto-generated method stub
		buff = new int[n];

		__mergeSort(a, 0, n - 1);

		buff = null;
	}

	private static void __mergeSort(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		if (left < right) {
			int i;
			int center = (left + right) / 2;
			int p = 0;
			int j = 0;
			int k = left;

			__mergeSort(a, left, center);
			__mergeSort(a, center + 1, right);

			for (i = left; i <= center; i++) {
				buff[p++] = a[i];
			}

			while (i <= right && j < p) {
				a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
			}

			while (j < p) {
				a[k++] = buff[j++];
			}
		}
	}

}
