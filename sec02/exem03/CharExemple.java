package sec02.exem03;

public class CharExemple {

	public static void main(String[] args) {
		char c1 = 'A'; // 문자로 저장
		char c2 = 65; // 10진수로 저장
		char c3 = '\u0041'; // 16진수로 저장

		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

	}

}
