package org.example;

public class Main1 {
	public static void inicializar(){
		GestionBanco banco = new GestionBanco();

		// Crear y agregar una sucursal
		Sucursal sucursal1 = new Sucursal("Sucursal A");
		banco.agregarSucursal(sucursal1);

		// Crear y agregar un cliente
		Cliente cliente1 = new Cliente("Paulo Vicente");
		banco.agregarCliente(cliente1);

		// Mostrar las cuentas del cliente
		banco.mostrarCuentasCliente(cliente1);

		// Obtener cuentas de ahorro de una sucursal
		banco.obtenerCAhorro(sucursal1);

		// Obtener cuentas corrientes de una sucursal
		banco.obtenerCCorriente(sucursal1);
	}

	public static void main(String[] args) {
		inicializar();
	}
}
