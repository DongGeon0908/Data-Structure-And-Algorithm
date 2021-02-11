package Quick;

import java.util.Scanner;

public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("배열 나누기");
		System.out.print("요솟수");
		int n = scan.nextInt();

		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		partition(x, n);

	}

	private static void partition(int[] x, int n) {
		// TODO Auto-generated method stub
		int pl = 0;
		int pr = n - 1;
		int a = x[n / 2];

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

		System.out.println("pivot : " + x);

		System.out.println("pivot 이하의 그룹");
		for (int i = 0; i <= pl - 1; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();

		if (pl > pr + 1) {
			System.out.println("pivot과 일치하는 그룹");
			for (int i = pr + 1; i <= pl - 1; i++) {
				System.out.print(x[i] + " ");
			}
			System.out.println();
		}

		System.out.println("pivot 이상의 그룹");
		for (int i = pr + 1; i < n; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
