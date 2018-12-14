/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_brauliocalix;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Sonda extends Naves {

    private String material;
    private double peso;

    public Sonda() {
    }

    public Sonda(String material, double peso, int serie, Planeta dest, double velocidad) {
        super(serie, dest, velocidad);
        this.material = material;
        this.peso = peso;
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
    ArrayList calculartiempo() {
        return null;
        
    }

    

}
