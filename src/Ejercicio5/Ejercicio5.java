/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import co.edu.uniminuto.actividad4.ejercicio5.Cliente;
import co.edu.uniminuto.actividad4.ejercicio5.Producto;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mduar
 */
public class Ejercicio5 {

    private static String producto;
    private static String getDescripcion;
    private static String Producto;

    /*5. Calcular el valor a pagar de un cliente por su compra, se desea saber los productos que ha
comprado: precio, cantidad, descripción. También el total a pagar y cálculo de impuestos,
adicional se debe tener el nombre, apellidos y documento del cliente.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cantidadProductos = 0;
        double totalPagar = 0;

        String nombre = JOptionPane.showInputDialog("""
                                                    Datos del cliente
                                                    Ingrese los nombres:""");
        String apellidos = JOptionPane.showInputDialog("""
                                                       Datos del cliente
                                                       Ingrese los apellidos:""");
        int documento = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                     Datos del cliente
                                                                     Ingrese el numero de documento:"""));
        Cliente cliente = new Cliente(nombre, apellidos, documento);

        cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de prodcutos comprados:"));
        for (int i = 1; i <= cantidadProductos; i++) {
            String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del producto:" + i);
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:" + i));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto:" + i));
            Producto producto = new Producto(descripcion, precio, cantidad);
            totalPagar += precio * cantidad;
        }
        float iva = (float) (0.19 * totalPagar);
        float total = (float) ((totalPagar) + iva);
        JOptionPane.showInputDialog(cliente + "\n El subtotal de su compra por los productos: \n"+Producto+
                + totalPagar + "\n El iva de su compra es: \n" + iva
                + "\n El total de su compra con IVA es: \n" + total);

    }
}
