import java.util.Scanner;

public class EuclidGCD {

	private static int gcd(int x, int y) {
		// TODO Auto-generated method stub
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("두 정수의 최대공약수를 구합니다.");

		System.out.print("정수를 입력 : ");
		int x = scan.nextInt();

		System.out.print("정수를 입력 : ");
		int y = scan.nextInt();

		System.out.println("최대공약수 : " + gcd(x, y));
	}
}
