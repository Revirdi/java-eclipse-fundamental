package org.dwi;

import org.dwi.laptop.Laptop;
import org.dwi.laptop.compponents.GraphicsCard;
import org.dwi.laptop.compponents.Processor;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Laptop lappy = new Laptop();
//		System.out.println(lappy.getProcessor().getBrand());

		Processor processor = new Processor("intel", "7200u", 6, 4, 4, "6MB", "2.5Ghz", "2.5Ghz", "3.1Ghz");

		GraphicsCard graphicsCard = new GraphicsCard("NVidia", 1060, "6GB");
		Laptop gamingLaptop = new Laptop(16f, processor, "DDR4", "2TB", graphicsCard, null, "mechanical");

		System.out.println(gamingLaptop);

		System.out.println("Current Frequency is : " + gamingLaptop.getProcessor().getFrequency());

		System.out.println(gamingLaptop.gamingMode());

		System.out.println("Current Frequency is : " + gamingLaptop.getProcessor().getFrequency());

	}

}
