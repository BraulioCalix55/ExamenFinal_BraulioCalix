/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_brauliocalix;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Astronauta implements Serializable {
    private String nombre;
    private String nacion;
    private String sueldo;
    private int exp;
    private String sexo;
    private int peso;
     private static final long SerialVersionUID=1;

    public Astronauta() {
    }

    public Astronauta(String nombre, String nacion, String sueldo, int exp, String sexo, int peso) {
        this.nombre = nombre;
        this.nacion = nacion;
        this.sueldo = sueldo;
        this.exp = exp;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Astronauta{" + "nombre=" + nombre + ", exp=" + exp + ", sexo=" + sexo + ", peso=" + peso + '}';
    }
    
}
