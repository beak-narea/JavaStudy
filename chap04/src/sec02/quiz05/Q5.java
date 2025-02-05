package sec02.quiz05;

public class Q5 {

	public static void main(String[] args) {
		// for 문을 이용해서 별을 출력하시오
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
