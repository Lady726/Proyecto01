/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
/**
 *
 * @author sala2
 */
public class Persona implements Serializable {

    private String nombre, apellidos, dir; // cada caracter ocupa 2 bytes
    private int id, salario, telefono; // ocupa 4 bytes
    private boolean activo;
    public Persona(){
        nombre="Kevin";
        apellidos="Roa P.";
        dir="Kra";
        id=1234;salario=1200;telefono=789;
        activo = true;
    }

    public Persona(String name, String ap, String dir, int id, int sala, int tel, boolean activo){
        this.nombre=name;
        this.apellidos=ap;
        this.dir=dir;
        this.id=id;
        this.salario=sala;
        this.telefono=tel;
        this.activo = activo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDir() {
        return dir;
    }

    public int getId() {
        return id;
    }

    public int getSalario() {
        return salario;
    }

    public int getTelefono() {
        return telefono;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }
    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nDireccion: " + dir + "\nId: " + id + "\nSalario: " + salario + "\nTelefono: " + telefono;
    }   
    
    public int getTamaño() {
        return getNombre().length()*2 + 2 + 4 + 1;
    }
}
