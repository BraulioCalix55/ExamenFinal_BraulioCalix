/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_brauliocalix;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Expedicion extends Thread {

    private Naves nave;
    private Planeta planeta;
    private ArrayList datos = new ArrayList();
    private JTable tabla;

    public Expedicion(Naves nave, Planeta planeta, JTable tabla, ArrayList dato) {
        this.nave = nave;
        this.planeta = planeta;
        this.tabla = tabla;
        this.datos = dato;
    }

    public Naves getNave() {
        return nave;
    }

    public void setNave(Naves nave) {
        this.nave = nave;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    @Override
    public void run() {
        //dato1 timepo ida
        //dato2 tiempo vuelta
        double num = 0;
        boolean termina = false;
        boolean ida = false;
            boolean vuelta = false;
        while (termina != true) {
           //System.out.println(num);
           
            if (vuelta == true && vuelta == true) {
                termina = true;
            }
            if (num == (double) datos.get(0)) {
                num = 0;
                ida = true;
            }
            if (num == (double) datos.get(1)) {
                num = 0;
                vuelta = true;
            }
            num++;
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
        System.out.println("muere");
         tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "serie", "planeta"
                }
        ));
       
            Object row2[] = {nave.getSerie(),nave.getDest()};
            DefaultTableModel m = (DefaultTableModel) tabla.getModel();
            m.addRow(row2);
            tabla.setModel(m);
        
    }
}
