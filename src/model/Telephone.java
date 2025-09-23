package model;

public class Telephone {
	
	
	private String brand;
	private String model;


	public Telephone(String brand, String model) {
	
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public void call(String telephone) {
		System.out.println("Calling the number: "+telephone+"·");
	}
	

	@Override
	public String toString() {
		return "Telephone [brand=" + brand + ", model=" + model + "]";
	}

}
