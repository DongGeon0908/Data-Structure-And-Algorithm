import java.util.Scanner;

public class Recur {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("입력 : ");
		int x = scan.nextInt();

		recur(x);
	}

	private static void recur(int x) {
		// TODO Auto-generated method stub
		if (x > 0) {
			recur(x - 1);
			System.out.println(x);
			recur(x - 2);
		}
	}
}
