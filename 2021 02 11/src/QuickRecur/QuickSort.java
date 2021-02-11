package QuickRecur;

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
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);

		lstack.push(left);
		rstack.push(right);

		while (lstack.isEmpty() != true) {
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int a = x[(left + right) / 2];

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
				lstack.push(left);
				rstack.push(pr);
			}

			if (pl < right) {
				lstack.push(pl);
				rstack.push(right);
			}
		}
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
