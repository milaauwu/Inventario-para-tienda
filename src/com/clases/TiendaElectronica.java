package com.clases;
import java.util.ArrayList;

public class TiendaElectronica {
	private ArrayList<ProductoElectrodomestico> listaDeProductos;
	
	public TiendaElectronica() {
		listaDeProductos = new ArrayList<>();
	}
	
	public void agregarProducto(ProductoElectrodomestico producto) {
		listaDeProductos.add(producto);
		System.out.println("Producto agregado: " + producto.getNombre());
	}
	
	public void mostrarProductos() {
		for(ProductoElectrodomestico producto : listaDeProductos){
			producto.mostrarInformacion();
			System.out.println("-------------------------------");
		}
	}
	
	public ProductoElectrodomestico buscarProducto(String nombre) {
		for(ProductoElectrodomestico producto : listaDeProductos) {
			if (producto.getNombre().equalsIgnoreCase(nombre)) {
				return producto;
			}
		}
		
		System.out.println("Producto no encontrado.");
        return null;
	}
	
	public void realizarVenta(String nombre) {
		ProductoElectrodomestico producto = buscarProducto(nombre);
		if (producto != null) {
			if (producto.getCantidadDisponible() > 0) {
				producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);
				System.out.println("Venta realizada: " + producto.getNombre());
			}
			else {
				System.out.println("Producto agotado: " + producto.getNombre());
			}
		}
	}
}
