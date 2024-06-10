/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.actividad4.ejercicio5;

/**
 *
 * @author mduar
 */
public class Producto {

   private String descripcion;
    private double precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(String descripcion, double precio, int cantidad) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("descripcion=").append(descripcion);
        sb.append(", precio=").append(precio);
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }

}
