package sec02.exem09;

public class ConditionalOperationExemple {

	public static void main(String[] args) {
		// 삼항 연산자
		int score = 90;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 "+ grade + "등급입니다.");
	}

}
