package org.example;

import java.util.Date;

public abstract class CuentaBancaria {
	protected String numeroCuenta;
	protected Date fechaApertura;
	protected String saldo;
	private Sucursal surcursalBancaria;
	private Cliente cliente;

	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Date getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public String getSaldo() {
		return this.saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public CuentaBancaria(String numeroCuenta, Date fechaApertura, String saldo) {
		this.numeroCuenta=numeroCuenta;
		this.fechaApertura = fechaApertura;
		this.saldo=saldo;

	}

	public abstract String getTipo();

	public abstract void mostrarDetallesCuenta();

	public Object getCliente() {
		return null;
	}

	public Object getSucursal() {
		return null;
	}
}