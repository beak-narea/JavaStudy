package sec01.exem02;

public class VariableInitializationExemple {

	public static void main(String[] args) {
		int value = 10;
		// 초기값 설정 없이 선언
		
		int result = value + 10;
		// value에 10을 더해서 result의 초기값으로 저장
		
		System.out.println(result);
		// result값 출력 -> 오류
	}

}
