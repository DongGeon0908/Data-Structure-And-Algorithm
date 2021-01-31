public class Queen88 {

	static boolean[] flag = new boolean[8];
	static int[] pos = new int[8];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(0);
	}

	private static void set(int i) {
		// TODO Auto-generated method stub
		for (int j = 0; j < 8; j++) {
			if (flag[j] == false) {
				pos[i] = j;
				if (i == 7) {
					print();
				} else {
					flag[j] = true;
					set(i + 1);
					flag[j] = false;
				}
			}
		}
	}

	private static void print() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}

}
