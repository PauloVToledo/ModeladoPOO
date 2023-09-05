package org.example;

import java.util.ArrayList;

public class GestionBanco {
	private ArrayList<Sucursal> sucursales;
	private ArrayList<Cliente> clientes;
	private ArrayList<CuentaBancaria> cuentasBancarias;

	public GestionBanco() {
		this.sucursales = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.cuentasBancarias = new ArrayList<>();
	}

	public Cliente agregarCliente(Cliente cliente) {
		clientes.add(cliente);
		return cliente;
	}

	public CuentaBancaria agregarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		cuentasBancarias.add(cuentaBancaria);
		return cuentaBancaria;
	}

	public Sucursal agregarSucursal(Sucursal sucursal) {
		sucursales.add(sucursal);
		return sucursal;
	}

	public void mostrarCuentasCliente(Cliente cliente) {
		for (CuentaBancaria cuenta : cuentasBancarias) {
			if (cuenta.getCliente().equals(cliente)) {
				System.out.println(cuenta.toString());
			}
		}
	}

	public ArrayList<CuentaAhorro> obtenerCAhorro(Sucursal sucursal) {
		ArrayList<CuentaAhorro> cuentasAhorro = new ArrayList<>();
		for (CuentaBancaria cuenta : cuentasBancarias) {
			if (cuenta instanceof CuentaAhorro && cuenta.getSucursal().equals(sucursal)) {
				cuentasAhorro.add((CuentaAhorro) cuenta);
			}
		}
		return cuentasAhorro;
	}

	public ArrayList<CuentaCorriente> obtenerCCorriente(Sucursal sucursal) {
		ArrayList<CuentaCorriente> cuentasCorriente = new ArrayList<>();
		for (CuentaBancaria cuenta : cuentasBancarias) {
			if (cuenta instanceof CuentaCorriente && cuenta.getSucursal().equals(sucursal)) {
				cuentasCorriente.add((CuentaCorriente) cuenta);
			}
		}
		return cuentasCorriente;
	}
}
