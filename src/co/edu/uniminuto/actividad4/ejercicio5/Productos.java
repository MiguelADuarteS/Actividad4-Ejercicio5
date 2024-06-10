/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.actividad4.ejercicio5;

/**
 *
 * @author mduar
 */
public class Productos {
    private int precio; 
    private byte cantidad; 
    private String descripción;

    public Productos() {
    }
    
    public Productos(int precio, byte cantidad, String descripción) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripción = descripción;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos{");
        sb.append("precio=").append(precio);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", descripci\u00f3n=").append(descripción);
        sb.append('}');
        return sb.toString();
    }
    
    
}
