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
public class Planeta implements Serializable {

    private String Nombre;
    private String tem;
    private String anillos;
    private String superficie;
    private double distancia;
    private static final long SerialVersionUID = 1;

    public Planeta() {
    }

    public Planeta(String Nombre, String tem, String anillos, String superficie, double distancia) {
        this.Nombre = Nombre;
        this.tem = tem;
        this.anillos = anillos;
        this.superficie = superficie;
        this.distancia = distancia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getAnillos() {
        return anillos;
    }

    public void setAnillos(String anillos) {
        this.anillos = anillos;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
