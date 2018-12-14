/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_brauliocalix;

import java.util.ArrayList;

public class Tripulada extends Naves{
    private String despeje;
    private ArrayList tripulacion;

    public Tripulada() {
    }

    public Tripulada(String despeje, ArrayList tripulacion, int serie, Planeta dest, double velocidad) {
        super(serie, dest, velocidad);
        this.despeje = despeje;
        this.tripulacion = tripulacion;
    }

    public String getDespeje() {
        return despeje;
    }

    public void setDespeje(String despeje) {
        this.despeje = despeje;
    }

    public ArrayList getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(ArrayList tripulacion) {
        this.tripulacion = tripulacion;
    }

    @Override
    public String toString() {
        return "Tripulada{" + "despeje=" + despeje + ", tripulacion=" + tripulacion + '}';
    }
    

    @Override
    ArrayList calculartiempo() {
        return null;
        
    }
    
}
