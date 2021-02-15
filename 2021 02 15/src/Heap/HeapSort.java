package Heap;

import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("힙 정렬");
		System.out.print("요솟수 : ");
		int nx = scan.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}

		heapSort(x, nx);

		System.out.println("오름차순으로 정렬");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}

	private static void heapSort(int[] a, int n) {
		// TODO Auto-generated method stub
		for (int i = (n - 1) / 2; i >= 0; i--) {
			downHeap(a, i, n - 1);
		}

		for (int i = n - 1; i > 0; i--) {
			swap(a, 0, i);
			downHeap(a, 0, i - 1);
		}
	}

	private static void downHeap(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		int temp = a[left];
		int child;
		int parent;

		for (parent = left; parent < (right + 1) / 2; parent = child) {
			int cl = parent * 2 + 1;
			int cr = cl + 1;
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl;
			if (temp >= a[child]) {
				break;
			}
			a[parent] = temp;
		}

	}

	private static void swap(int[] a, int idx1, int idx2) {
		// TODO Auto-generated method stub
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

}
