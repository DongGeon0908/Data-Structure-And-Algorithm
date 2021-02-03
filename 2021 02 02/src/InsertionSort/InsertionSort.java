package InsertionSort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int n = scan.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("data[" + i + "] : ");
			data[i] = scan.nextInt();
		}

		insertionSort(data, n);

		System.out.println("오름차순 정렬");
		for (int i = 0; i < n; i++) {
			System.out.println("data[" + i + "] = " + data[i]);
		}
	}

	private static void insertionSort(int[] data, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			int j;
			int tmp = data[i];
			for (j = i; j > 0 && data[j - 1] > tmp; j--) {
				data[j] = data[j - 1];
			}
			data[j] = tmp;
		}
	}

}
