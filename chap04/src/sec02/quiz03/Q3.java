package sec02.quiz03;

public class Q3 {

	public static void main(String[] args) {
		// while문과 random 메소드를 이용해서 2개의 주사위를 던졌을때 눈의 합이 5이면 실행을 멈추는 코드를 작성하시오.
		int sum = 0;
		while (sum != 5) {
			sum = 0;
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			sum = dice1 + dice2;
		}
		System.out.println("실행종료");
	}

}
