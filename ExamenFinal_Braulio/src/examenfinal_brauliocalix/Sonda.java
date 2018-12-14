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
public class Sonda extends Naves {

    private String material;
    private double peso;
    private JTable tabla;

    public Sonda() {
    }

    public Sonda(String material, double peso, JTable tabla, String serie, Planeta dest, double velocidad) {
        super(serie, dest, velocidad);
        this.material = material;
        this.peso = peso;
        this.tabla = tabla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Sonda{" + "material=" + material + ", peso=" + peso + '}';
    }

    @Override
    ArrayList calculartiempo(Naves nave, Planeta destino) {
        ArrayList datos = new ArrayList();
        double ida, vuelta;
        double dist = destino.getDistancia();
        ida = (dist) / (super.getVelocidad());
        vuelta = (9.8) * super.getVelocidad();
        ida=ida;
        vuelta=vuelta;
        System.out.println("vuleta"+vuelta);
        datos.add(ida);
        datos.add(vuelta);

        return datos;

    }

    @Override
    void expedicion(Naves nave, Planeta destino, JTable tabla) {
        ArrayList datos = calculartiempo(nave, destino);
        Expedicion exp = new Expedicion(nave, destino, tabla, datos);
        exp.start();
    }

}
