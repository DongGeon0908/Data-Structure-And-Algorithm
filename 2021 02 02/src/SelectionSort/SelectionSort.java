package SelectionSort;

import java.util.Scanner;

public class SelectionSort {
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

		selectionSort(data, n);

		System.out.println("Sorting");
		for (int i = 0; i < n; i++) {
			System.out.println("data[" + i + "] = " + data[i]);
		}
	}

	private static void selectionSort(int[] data, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (data[j] < data[min]) {
					min = j;
				}
			}
			swap(data, i, min);
		}
	}

	private static void swap(int[] data, int i, int j) {
		// TODO Auto-generated method stub
		int tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}
}
