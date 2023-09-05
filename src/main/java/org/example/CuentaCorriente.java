package org.example;

import java.util.Date;

public class CuentaCorriente extends CuentaBancaria {
	private int lineaSobregiro;

	public int getLineaSobregiro() {
		return this.lineaSobregiro;
	}

	public void setLineaSobregiro(int lineaSobregiro) {
		this.lineaSobregiro = lineaSobregiro;
	}

	public CuentaCorriente(int lineaSobregiro, String numeroCuenta, Date fechaApertura, String saldo) {
		super(numeroCuenta, fechaApertura, saldo);
		this.lineaSobregiro=lineaSobregiro;

	}

	public String getTipo() {

		return "Cuenta Corriente";
	}

	public void mostrarDetallesCuenta() {

		System.out.println("Número de cuenta: " + getNumeroCuenta());
		System.out.println("Fecha de apertura: " + getFechaApertura());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Linea sobre giro: " + getLineaSobregiro());
		System.out.println("Tipo: " + getTipo());
	}
}