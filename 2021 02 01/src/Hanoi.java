package Hanoi;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("원반 개수 : ");
		int n = scan.nextInt();

		move(n, 1, 3);
	}

	private static void move(int n, int i, int j) {
		// TODO Auto-generated method stub
		if (n > 1) {
			move(n - 1, i, 6 - i - j);
		}
		System.out.println("원반[" + n + "]을 " + i + " 기둥에서 " + j + " 기둥으로 옮김");

		if (n > 1) {
			move(n - 1, 6 - i - j, j);
		}
	}

}
