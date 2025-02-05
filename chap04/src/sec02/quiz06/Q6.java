package sec02.quiz06;

public class Q6 {

	public static void main(String[] args) {
		// for문을 이용해서 다음과 같이 *을 출력하시오
		for(int i = 0; i <4;i++) {
			for(int j = 0; j < (4-i); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
