package chap0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhysExamSearch {

	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String toString() {
			return name + " " + height + " " + vision;
		}

		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		PhyscData[] x = { new PhyscData("이나영", 162, 1.3), new PhyscData("김동건", 165, 3.3),
				new PhyscData("오한얼", 169, 2.3), new PhyscData("강동진", 172, 1.8), new PhyscData("성민수", 177, 1.2),
				new PhyscData("이준표", 125, 0.7), new PhyscData("이준희", 100, 0.4), new PhyscData("정준희", 120, 0.5) };
		System.out.print("몇 cm인 사람을 찾고 있나 : ?");
		int height = scan.nextInt();
		int index = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

		if (index < 0) {
			System.out.println("요소가 없음");
		} else {
			System.out.println("x[" + index + "]에 있음");
			System.out.println("찾은 데이터 : " + x[index]);
		}
	}

}
