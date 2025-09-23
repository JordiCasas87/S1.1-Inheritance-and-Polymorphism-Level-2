package model;

import interfaces.Camera;
import interfaces.Watch;

public class Smartphone extends Telephone implements Camera, Watch {

	public Smartphone(String brand, String model) {
		super(brand, model);

	}

	@Override
	public void alarm() {
		System.out.println("The alarm is ringing!");
	}

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		System.out.println("Taking a photo!");

	}

	@Override
	public String toString() {
		return "Smartphone  Brand = " + getBrand() + ", Model = " + getModel() + ".";
	}

}
