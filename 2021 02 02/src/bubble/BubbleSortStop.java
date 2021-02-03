package bubble;

import java.util.Scanner;

public class BubbleSortStop {

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
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				if (data[j - 1] > data[j]) {
					swap(data, j - 1, j);
				}
			}
		}
	}

	private static void swap(int[] data, int i, int j) {
		// TODO Auto-generated method stub
		int tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

}
