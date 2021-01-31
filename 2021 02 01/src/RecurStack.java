package stack;

import java.util.Scanner;

public class RecurStack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("입력 : ");
		int x = scan.nextInt();

		recur(x);
	}

	private static void recur(int n) {
		// TODO Auto-generated method stub
		IntStackTester stack = new IntStackTester(n);

		while (true) {
			if (n > 0) {
				stack.push(n);
				n = n - 1;
				continue;
			}
			if (stack.isEmpty() != true) {
				n = stack.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}
}
