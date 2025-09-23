package model;

import interfaces.Camara;
import interfaces.Reloj;

public class Smartphone extends Telefono implements Camara, Reloj {

	public Smartphone(String marca, String modelo) {
		super(marca, modelo);

	}

	@Override
	public void alarma() {
		System.out.println("Esta sonando la alarma!");
	}

	@Override
	public void fotografiar() {
		// TODO Auto-generated method stub
		System.out.println("Se está haciendo una foto!");

	}

	@Override
	public String toString() {
		return "Smartphone con Marca = " + getMarca() + ", Modelo = " + getModelo() + ".";
	}

}
