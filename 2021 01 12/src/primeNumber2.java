public class primeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];

		prime[ptr++] = 2;

		for (int i = 3; i <= 1000; i = i + 2) {
			int j;
			for (j = 1; j < ptr; j++) {
				counter++;
				if (i % prime[j] == 0) {
					break;
				}
			}
			if (ptr == j) {
				prime[ptr++] = i;
			}
		}

		for (int i = 0; i < ptr; i++) {
			System.out.println("prime => " + prime[i]);
		}

		System.out.println("allCounter => " + counter);
	}
}
