package org.example;

import java.util.Date;

public class CuentaAhorro extends CuentaBancaria {
	private double reajusteAnual;

    public double getReajusteAnual() {
		return this.reajusteAnual;
	}

	public void setReajusteAnual(double reajusteAnual) {
		this.reajusteAnual = reajusteAnual;
	}

	public CuentaAhorro(double reajusteAnual, String numeroCuenta, Date fechaApertura, double saldo) {
		super(numeroCuenta, fechaApertura, String.valueOf(saldo));
		this.reajusteAnual = reajusteAnual;
	}


	public String getTipo() {
		return "Cuenta de Ahorro";
	}


	public void mostrarDetallesCuenta() {
		System.out.println("Número de cuenta: " + getNumeroCuenta());
		System.out.println("Fecha de apertura: " + getFechaApertura());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Reajuste Anual: " + getReajusteAnual());
		System.out.println("Tipo: " + getTipo());
	}
}
