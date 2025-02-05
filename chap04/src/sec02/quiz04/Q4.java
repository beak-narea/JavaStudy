package sec02.quiz04;

public class Q4 {

	public static void main(String[] args) {
		// 중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해를 구해서 (x,y)형태로 출력하시오 (x와 y는 10이하의 자연수)
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if ((i * 4) + (j * 5) == 60) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
	}

}
