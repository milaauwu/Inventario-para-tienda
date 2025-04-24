package com.clases;

public class ProductoElectrodomestico {
	private String nombre;
	private int precio;
	private int cantidadDisponible;
	
	public ProductoElectrodomestico(String nombre, int precio, int cantidadDisponible) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public ProductoElectrodomestico(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = 0;
	}
	
	public String getNombre(){
		return nombre;
	}
	public int getPrecio(){
		return precio;
	}
	public int getCantidadDisponible(){
		return cantidadDisponible;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public void mostrarInformacion(){
		System.out.println("=== Electrodomestico ===");
		System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad Disponible: " + cantidadDisponible);
	}
	
}
