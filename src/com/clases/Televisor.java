package com.clases;

public class Televisor extends ProductoElectrodomestico {
	private String resolucion;
	private double tamañoPantalla;
	
	public Televisor (String nombre, int precio, int cantidadDisponible,String resolucion, double tamañoPantalla) {
		super (nombre, precio, cantidadDisponible);
		this.resolucion = resolucion;
		this.tamañoPantalla = tamañoPantalla;
	}
	
	@Override
	 public void mostrarInformacion() {
	        System.out.println("=== Televisor ===");
	        System.out.println("Nombre: " + getNombre());
	        System.out.println("Precio: " + getPrecio());
	        System.out.println("Cantidad disponible: " + getCantidadDisponible());
	        System.out.println("Tamaño de pantalla: " + tamañoPantalla + " pulgadas");
	        System.out.println("Resolución: " + resolucion);
	    }
	
}
