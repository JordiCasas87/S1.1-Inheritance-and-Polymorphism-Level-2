package model;

public class Telefono  {
	
	
	private String marca;
	private String modelo;


	public Telefono(String marca, String modelo) {
	
		this.marca = marca;
		this.modelo = modelo;
	}


	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public void llamar(String telefono) {
		System.out.println("Se está llamando al número: "+telefono+"·");
	}
	

	@Override
	public String toString() {
		return "Telefono [marca=" + marca + ", modelo=" + modelo + "]";
	}


	

}
