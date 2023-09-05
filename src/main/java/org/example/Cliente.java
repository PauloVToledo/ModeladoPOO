package org.example;
import java.util.ArrayList;

public class Cliente {
	private final String paulo;
	private String nombre;
	private String rut;
	private ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();

	public Cliente(String paulo) {
		this.paulo=paulo;
	}

    public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Cliente(String paulo, String nombre, String rut) {
		this.paulo = paulo;

		this.nombre=nombre;
		this.rut=rut;
	}
}