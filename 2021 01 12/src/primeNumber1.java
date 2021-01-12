public class primeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int allCounter = 0;

		for (int i = 2; i <= 1000; i++) {
			int j;
			for (j = 2; j < i; j++) {
				counter++;
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.println("prime => " + i);
			}
			System.out.println("counter => " + counter);
			allCounter += counter;
		}
		System.out.println("allCounter => " + allCounter);
	}

}