package com;

import com.clases.TiendaElectronica;
import com.clases.Televisor;
import com.clases.ComputadoraPortatil;
import com.clases.ProductoElectrodomestico;

public class Aplicacion {
    public static void main(String[] args) {

     
        TiendaElectronica tienda = new TiendaElectronica();

        System.out.println("=======================================");
        System.out.println("AGREGANDO PRODUCTOS AL INVENTARIO...");
        System.out.println("=======================================");

        Televisor tv1 = new Televisor("Samsung Smart TV", 5000, 3, "4K", 55);
        Televisor tv2 = new Televisor("LG OLED", 7000, 2, "8K", 65);
        ComputadoraPortatil laptop = new ComputadoraPortatil("Laptop ASUS", 8500, 4, "ASUS", 16, "ASUS123456");
        ProductoElectrodomestico microondas = new ProductoElectrodomestico("Microondas Panasonic", 1500, 5);

        tienda.agregarProducto(tv1);
        tienda.agregarProducto(tv2);
        tienda.agregarProducto(laptop);
        tienda.agregarProducto(microondas);

        System.out.println("\n=======================================");
        System.out.println("PRODUCTOS DISPONIBLES EN INVENTARIO");
        System.out.println("=======================================\n");
        tienda.mostrarProductos();

        System.out.println("\n=======================================");
        System.out.println("REALIZANDO VENTAS");
        System.out.println("=======================================\n");

        tienda.realizarVenta("Samsung Smart TV");
        tienda.realizarVenta("Samsung Smart TV");
        tienda.realizarVenta("Samsung Smart TV");
        tienda.realizarVenta("Samsung Smart TV"); 

        tienda.realizarVenta("Laptop ASUS");
        tienda.realizarVenta("Laptop ASUS");

        System.out.println("\n=======================================");
        System.out.println("INVENTARIO ACTUALIZADO DESPUÉS DE VENTAS");
        System.out.println("=======================================\n");
        tienda.mostrarProductos();
    }
}