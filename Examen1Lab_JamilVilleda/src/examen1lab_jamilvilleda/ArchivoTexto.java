/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_jamilvilleda;

/**
 *
 * @author Jamil
 */
public class ArchivoTexto {
    private String texto;

    public ArchivoTexto() {
    }

    public ArchivoTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "ArchivoTexto{" + "texto=" + texto + '}';
    }
    
    
}
