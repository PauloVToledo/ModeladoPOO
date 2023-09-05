package org.example;
import java.util.ArrayList;

public class Sucursal {
	private String codigoSucursal;
	private String codigoPostal;
	private ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();
	public GestionBanco GestionBanco;

	public Sucursal(String sucursalA) {
		this.codigoSucursal=sucursalA;
	}


	public String getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public void setCodigoSucursal(String codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Sucursal(String codigoSucursal, String codigoPostal) {

		this.codigoSucursal=codigoSucursal;
		this.codigoPostal=codigoPostal;
	}
}