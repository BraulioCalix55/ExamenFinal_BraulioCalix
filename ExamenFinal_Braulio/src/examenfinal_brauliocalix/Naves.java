/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_brauliocalix;

import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author User
 */
public abstract class Naves {

    private String serie;
    private Planeta dest;
    private double velocidad;

    public Naves() {
    }

    public Naves(String serie, Planeta dest, double velocidad) {
        this.serie = serie;
        this.dest = dest;
        this.velocidad = velocidad;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Planeta getDest() {
        return dest;
    }

    public void setDest(Planeta dest) {
        this.dest = dest;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Naves{" + "serie=" + serie + ", dest=" + dest + ", velocidad=" + velocidad + '}';
    }

    abstract void expedicion(Naves nave, Planeta destino, JTable tabla);

    abstract ArrayList calculartiempo(Naves nave, Planeta destino);

}
