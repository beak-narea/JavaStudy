package sec04.exem02;

import java.io.IOException;

public class KeyCodeExemple {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		
		keyCode = System.in.read();
		System.out.println("keyCode: "+ keyCode);
		
	}

}
