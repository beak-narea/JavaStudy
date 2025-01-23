package sec02.exem06;

public class FloatDoubleExemple {

	public static void main(String[] args) {
		// float var1 = 3.14; // 컴파일 에러, 소수는 숫자 끝에 f붙여야함
		float var2 = 3.14f;
		double var3 = 3.14;

		float var4 = 0.1234567890123456789f; // 정밀도 테스트
		double var5 = 0.1234567890123456789;

		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);

		double var6 = 3e6; // e는 제곱
		float var7 = 3e6F;
		double var8 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
	}

}
