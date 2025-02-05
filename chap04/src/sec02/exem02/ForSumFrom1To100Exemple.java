package sec02.exem02;

public class ForSumFrom1To100Exemple {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("1~100 합: " + sum);
	}

}
