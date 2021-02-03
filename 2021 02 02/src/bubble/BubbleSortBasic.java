package bubble;

import java.util.Scanner;

public class BubbleSortBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("요솟수 : ");
		int n = scan.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("[x" + i + "] : ");
			data[i] = scan.nextInt();
		}

		bubbleSort(data, n);

		System.out.println("Sorting");
		for (int i = 0; i < n; i++) {
			System.out.println("data[" + i + "] = " + data[i]);
		}
	}

	private static void bubbleSort(int[] data, int n) {
		// TODO Auto-generated method stub
		int k = 0;
		while (k < n - 1) {
			int last = n - 1;
			for (int j = n - 1; j > k; j--) {
				if (data[j - 1] > data[j]) {
					swap(data, j - 1, j);
					last = j;
				}
			}
			k = last;
		}
	}

	private static void swap(int[] data, int i, int j) {
		// TODO Auto-generated method stub
		int tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

}
