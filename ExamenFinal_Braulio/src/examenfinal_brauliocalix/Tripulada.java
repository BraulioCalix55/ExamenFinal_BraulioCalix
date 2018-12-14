/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_brauliocalix;

import java.util.ArrayList;

public class Tripulada extends Naves {

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
    ArrayList calculartiempo(Naves nave, Planeta destino) {
        ArrayList datos = new ArrayList();
        double ida, vuelta;
        double dist = destino.getDistancia();
        double sumacuadrado, sumanormal;
        sumacuadrado = Math.pow((double) tripulacion.size(), 2);
        sumanormal = tripulacion.size();
        ida = (destino.getDistancia()) / nave.getVelocidad() * (sumacuadrado / 100);
        vuelta = (destino.getDistancia()) / nave.getVelocidad() * (sumanormal / 100);
        datos.add(ida);
        datos.add(vuelta);

        return datos;
    }

    @Override
    void expedicion(Naves nave, Planeta destino) {
        Expedicion exp = new Expedicion(nave, destino);
        exp.start();
    }

}
