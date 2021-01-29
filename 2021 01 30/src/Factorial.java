import java.util.Scanner;

public class Factorial {

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if (n > 0) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
		int x = scan.nextInt();

		System.out.println(x + " 의 펙토리얼은 " + factorial(x) + " 입니다.");
	}

}
