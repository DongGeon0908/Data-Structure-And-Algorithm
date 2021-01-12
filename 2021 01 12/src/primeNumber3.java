public class primeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];

		prime[ptr++] = 2;
		prime[ptr++] = 3;

		for (int i = 5; i <= 1000; i = i + 2) {
			boolean flag = false;
			for (int j = 1; prime[j] * prime[j] <= i; j++) {
				counter = counter + 2;
				if (i % prime[j] == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				prime[ptr++] = i;
				counter++;
			}
		}
		for (int i = 0; i < ptr; i++) {
			System.out.println("prime => " + prime[i]);
		}
		System.out.println("allCounter => " + counter);

	}

}
