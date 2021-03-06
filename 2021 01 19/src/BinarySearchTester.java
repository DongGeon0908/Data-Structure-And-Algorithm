import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력");

		System.out.print("x[0] : ");
		x[0] = scan.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = scan.nextInt();
			} while (x[i] < x[i - 1]);
		}
		System.out.print("검색할 값 : ");
		int key = scan.nextInt();

		int index = Arrays.binarySearch(x, key);

		if (index < 0) {
			System.out.println("그 값은 요소가 없음");
		} else {
			System.out.println(key + "는 x[" + index + "]에 있음");
		}
	}

}
