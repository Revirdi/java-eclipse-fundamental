package polymorphism;

import polymorphism.phone.Nokia;
import polymorphism.phone.Phone;
import polymorphism.phone.Samsung;

public class AppPhone {

	public static void main(String[] args) {

		Phone note8 = new Samsung("Note 8");
		System.out.println(note8.getModel());
		note8.feature();

		Phone nokia = new AppPhone().phone(1);
		System.out.println(nokia.getModel());
		nokia.feature();

		Phone samsung = new AppPhone().phone(2);
		System.out.println(samsung.getModel());
		samsung.feature();

	}

	public Phone phone(int dailyDriver) {
		switch (dailyDriver) {
		case 1:
			return new Nokia("3310");
		case 2:
			return new Samsung("Note 5");
		}
		return null;
	}

}
