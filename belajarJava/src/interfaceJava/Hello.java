package interfaceJava;

import interfaceJava.phone.OnePlus5;
import interfaceJava.phone.Phone;

public class Hello {

	public static void main(String[] args) {

		Phone phone = new OnePlus5();
		System.out.println(phone.processor());
		;

	}

}
