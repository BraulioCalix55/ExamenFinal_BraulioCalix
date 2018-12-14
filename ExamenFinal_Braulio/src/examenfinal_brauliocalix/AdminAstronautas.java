/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_brauliocalix;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AdminAstronautas {
    private ArrayList<Astronauta> listaAstronautas = new ArrayList();
    private File archivo = null;

    public AdminAstronautas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Astronauta> getListaAstronautas() {
        return listaAstronautas;
    }

    public void setListaAstronautas(ArrayList<Astronauta> listaAstronautas) {
        this.listaAstronautas = listaAstronautas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaAstronautas=" + listaAstronautas;
    }

    //extra mutador
    public void setAstronauta(Astronauta p) {
        this.listaAstronautas.add(p);
    }

    public void cargarArchivo() {
        try {            
            listaAstronautas = new ArrayList();
            Astronauta temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Astronauta) objeto.readObject()) != null) {
                        listaAstronautas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            //ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Astronauta t : listaAstronautas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
