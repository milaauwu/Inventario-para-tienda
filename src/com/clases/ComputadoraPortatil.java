package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
	private String marca;
	private int memoriaRam;
	private String numeroSerie;
	
	public ComputadoraPortatil (String nombre, int precio, int cantidadDisponible, String marca, int memoriaRam, String numeroSerie) {
		super(nombre, precio, cantidadDisponible);
		this.marca = marca;
		this.memoriaRam = memoriaRam;
		this.numeroSerie = numeroSerie;
	}
	
	@Override
	 public void mostrarInformacion() {
	        System.out.println("=== Computadora Portatil ===");
	        System.out.println("Nombre: " + getNombre());
	        System.out.println("Precio: " + getPrecio());
	        System.out.println("Cantidad disponible: " + getCantidadDisponible());
	        System.out.println("Marca: " + marca);
	        System.out.println("Memoria Ram: " + memoriaRam);
	        System.out.println("Numero de Serie: " + numeroSerie);
	    }
	
}
