import java.util.Scanner;

public class PhysicalExamination {
	static final int VMAX = 21;

	static class PhyscData {
		String name;
		int height;
		double vision;

		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	static double aveHeight(PhyscData[] dat) {
		double sum = 0;

		for (int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		return sum / dat.length;
	}

	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;

		dist[i] = 0;

		for (i = 0; i < dat.length; i++) {
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
				dist[(int) (dat[i].vision * 10)]++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		PhyscData[] x = { new PhyscData("박현규", 162, 0.3), new PhyscData("김동건", 172, 0.4),
				new PhyscData("강동진", 172, 0.5), new PhyscData("오한얼", 162, 0.6), new PhyscData("이석인", 182, 0.1),
				new PhyscData("힌궁어", 112, 0.9), new PhyscData("남기연", 132, 0.5), };
		int[] vdist = new int[VMAX];

		System.out.println("신체검사 리스트");
		System.out.println("이름  키  시력");
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		System.out.printf("\n평균키 : %5.1fcm\n", aveHeight(x));

		distVision(x, vdist);

		System.out.println("\n시력분포");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f ~ %2d명\n", i / 10.0, vdist[i]);
		}
	}
}
