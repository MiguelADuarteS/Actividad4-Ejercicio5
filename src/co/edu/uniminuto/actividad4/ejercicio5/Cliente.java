/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.actividad4.ejercicio5;

/**
 *
 * @author mduar
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int documento;

    public Cliente() {
        
    }
    public Cliente(String nombre, String apellido, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String nombre() {
    String  nombre = this.nombre;
        return nombre;
    }
    public String apellido() {
    String  apellido = this.apellido;
        return apellido;
    }
    public int documento() {
    int documento = this.documento;
        return documento;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", documento=").append(documento);
        sb.append('}');
        return sb.toString();
    }
    
    
}
