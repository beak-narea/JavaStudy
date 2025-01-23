package sec01.exem04;

public class VariableScopeExemple {

	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2;
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5; // v2 사용불가 컴파일 에러 발생
	}

}
