/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_jamilvilleda;

import java.util.ArrayList;

/**
 *
 * @author Jamil
 */
public class Carpeta {
    
    private ArrayList <Archivo> archivo = new ArrayList();

    public Carpeta() {
    }

    public ArrayList<Archivo> getArchivo() {
        return archivo;
    }

    public void setArchivo(ArrayList<Archivo> archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Carpeta{" + "archivo=" + archivo + '}';
    }
    
    
    
}
