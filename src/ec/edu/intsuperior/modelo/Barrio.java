/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author PC
 */
public class Barrio {
    private String idBarrio;
    private String calles;

    public Barrio(String idBarrio, String calles) {
        this.idBarrio = idBarrio;
        this.calles = calles;
    }

    public String getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(String idBarrio) {
        this.idBarrio = idBarrio;
    }

    public String getCalles() {
        return calles;
    }

    public void setCalles(String calles) {
        this.calles = calles;
    }
        
}
